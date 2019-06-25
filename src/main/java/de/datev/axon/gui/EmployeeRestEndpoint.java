package de.datev.axon.gui;

import java.util.List;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    public void publishCommands(@RequestBody List<String> commands) {
    	//TODO iterate over json commands, unmarshal and send them
    	
    }
    
    @PostMapping("/join-company")
    public void joinCompany(@RequestBody EmployeeJoinCompanyCommand command) {
        commandGateway.send(command);
    }

    @PostMapping("/change-address")
    public void changeEmployeeAddress(@RequestBody EmployeeJoinCompanyCommand command) {
        commandGateway.send(command);
    }

    @GetMapping("/employees")
    public List<Employee> findAllEmployees() {
        return queryGateway.query(new FindAllEmployeesQuery(), ResponseTypes.multipleInstancesOf(Employee.class))
                           .join();
    }

}
