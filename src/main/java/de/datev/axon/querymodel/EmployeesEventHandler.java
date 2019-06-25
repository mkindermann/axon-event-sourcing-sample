package de.datev.axon.querymodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import de.datev.axon.coreapi.events.EmployeeAddressChangedEvent;
import de.datev.axon.coreapi.events.EmployeeJoinedCompanyEvent;
import de.datev.axon.coreapi.queries.Employee;
import de.datev.axon.coreapi.queries.FindAllEmployeesQuery;

@Service
public class EmployeesEventHandler {

    private final Map<String, Employee> employees = new HashMap<>();

    @EventHandler
    public void on(EmployeeJoinedCompanyEvent event) {
        Employee employee = new Employee(event.getId(), event.getGivenName(), event.getSurname(), event.getGender(), 
        	event.getDateOfBirth(), event.getIndex(), event.getCompanyId(), event.getCity(), event.getStreetAddress(), 
        	event.getPostalCode(), event.getIban(), event.getEmail());
        employees.put(employee.getId(), employee);
    }

    @EventHandler
    public void on(EmployeeAddressChangedEvent event) {
    	employees.computeIfPresent(event.getId(), (id, employee) -> {
    		
            employee.setCity(event.getCity());
            employee.setStreetAddress(event.getStreetAddress());
            employee.setPostalCode(event.getPostalCode());
            return employee;
        });
    }

    @QueryHandler
    public List<Employee> handle(FindAllEmployeesQuery query) {
        return new ArrayList<>(employees.values());
    }

}