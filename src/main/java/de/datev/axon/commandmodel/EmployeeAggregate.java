package de.datev.axon.commandmodel;

import static org.axonframework.modelling.command.AggregateLifecycle.apply;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

import de.datev.axon.coreapi.commands.ChangeEmployeeAddressCommand;
import de.datev.axon.coreapi.commands.EmployeeJoinCompanyCommand;
import de.datev.axon.coreapi.events.EmployeeAddressChangedEvent;
import de.datev.axon.coreapi.events.EmployeeJoinedCompanyEvent;

@Aggregate
public class EmployeeAggregate {

    @AggregateIdentifier
    private String id;

    @CommandHandler
    public EmployeeAggregate(EmployeeJoinCompanyCommand command) {
    	id = command.getId();
        apply(new EmployeeJoinedCompanyEvent(command.getId(), command.getGivenName(), command.getSurname(), command.getGender(), command.getDateOfBirth(),
        		command.getIndex(), command.getCompanyId(), command.getCity(), command.getStreetAddress(), command.getPostalCode(), command.getIban(),
    			command.getEmail()));
    }
    
    @EventSourcingHandler
    public void on(EmployeeJoinedCompanyEvent command) {
        id = command.getId();
    }
    
    @CommandHandler
    public void handle(ChangeEmployeeAddressCommand command) {
        apply(new EmployeeAddressChangedEvent(command.getId(), command.getCity(), command.getStreetAddress(), command.getPostalCode()));
    }

    protected EmployeeAggregate() {
        // Required by Axon to build a default Aggregate prior to Event Sourcing
    }
	
}
