package de.datev.axon.gui;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import de.datev.axon.coreapi.commands.ChangeEmployeeAddressCommand;
import de.datev.axon.coreapi.commands.EmployeeJoinCompanyCommand;
import de.datev.axon.coreapi.queries.Employee;
import de.datev.axon.coreapi.queries.FindAllEmployeesQuery;

@RestController
public class EmployeeRestEndpoint {

    private final CommandGateway commandGateway;
    private final QueryGateway queryGateway;

    public EmployeeRestEndpoint(CommandGateway commandGateway, QueryGateway queryGateway) {
        this.commandGateway = commandGateway;
        this.queryGateway = queryGateway;
    }

    @PostMapping("/join-company")
    public void joinCompany() {
    	String id = UUID.randomUUID().toString();;
    	String givenName = "givenName";
    	String surname = "surname";
    	String gender = "m";
    	LocalDate dateOfBirth = LocalDate.now();
    	Integer index = 0;
    	String companyId = "companyId";
    	String city = "city";
    	String streetAddress = "streetAddress";
    	String postalCode = "postalCode";
    	String iban = "ibane";
    	String email = "email";
        
        commandGateway.send(new EmployeeJoinCompanyCommand(id, givenName, surname, gender, dateOfBirth, index, companyId, city, streetAddress, postalCode, iban, email));
        
    }

    @PostMapping("/change-address")
    public void changeEmployeeAddress() {
        String id = UUID.randomUUID().toString();
    	String city = "city";
    	String streetAddress = "streetAddress";
    	String postalCode = "postalCode";
    	
        commandGateway.send(new ChangeEmployeeAddressCommand(id, city, streetAddress, postalCode));
    }

    @GetMapping("/employees")
    public List<Employee> findAllEmployees() {
        return queryGateway.query(new FindAllEmployeesQuery(), ResponseTypes.multipleInstancesOf(Employee.class))
                           .join();
    }

}
