package de.datev.axon.commandmodel;

import java.time.LocalDate;
import java.util.UUID;

import org.axonframework.test.aggregate.AggregateTestFixture;
import org.axonframework.test.aggregate.FixtureConfiguration;
import org.junit.Before;
import org.junit.Test;

import de.datev.axon.coreapi.commands.ChangeEmployeeAddressCommand;
import de.datev.axon.coreapi.commands.EmployeeJoinCompanyCommand;
import de.datev.axon.coreapi.events.EmployeeAddressChangedEvent;
import de.datev.axon.coreapi.events.EmployeeJoinedCompanyEvent;

public class EmployeeAggregateUnitTest {

    private FixtureConfiguration<EmployeeAggregate> fixture;

    @Before
    public void setUp() {
        fixture = new AggregateTestFixture<>(EmployeeAggregate.class);
    }

    @Test
    public void giveNoPriorEmployee_whenEmployeeJoinedCompanyCommand_thenShouldPublishEmployeeJoinedCompanyEvent() {
    	String id = UUID.randomUUID().toString();
    	String givenName = "givenName";
    	String surname = "surname";
    	String gender = "m";
    	LocalDate dateOfBirth = LocalDate.now();
    	String companyId = "companyId";
    	String city = "city";
    	String streetAddress = "streetAddress";
    	String postalCode = "postalCode";
    	String iban = "iban";
    	String email = "email";
        
        fixture.givenNoPriorActivity()
               .when(new EmployeeJoinCompanyCommand(id, givenName, surname, gender, dateOfBirth, companyId, city, streetAddress, postalCode, iban, email))
               .expectEvents(new EmployeeJoinedCompanyEvent(id, givenName, surname, gender, dateOfBirth, companyId, city, streetAddress, postalCode, iban, email));
    }

    @Test
    public void givenEmployeeJoinedCompanyEvent_whenChangeEmployeeAddressCommand_thenShouldPublishEmployeeAddressChangedEvent() {
    	String id = UUID.randomUUID().toString();
    	String givenName = "givenName";
    	String surname = "surname";
    	String gender = "m";
    	LocalDate dateOfBirth = LocalDate.now();
    	String companyId = "companyId";
    	String city = "city";
    	String streetAddress = "streetAddress";
    	String postalCode = "postalCode";
    	String iban = "iban";
    	String email = "email";
    	
    	String changedStreetAddress = "new streetAddress";

        fixture.given(new EmployeeJoinedCompanyEvent(id, givenName, surname, gender, dateOfBirth, companyId, city, streetAddress, postalCode, iban, email))
               .when(new ChangeEmployeeAddressCommand(id, city, changedStreetAddress, postalCode))
               .expectEvents(new EmployeeAddressChangedEvent(id, city, changedStreetAddress, postalCode));
    }

}