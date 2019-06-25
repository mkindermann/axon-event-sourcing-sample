package de.datev.axon.coreapi.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class ChangeEmployeeNameCommand {

    @TargetAggregateIdentifier
    private final String id;
    private final String surname;
    
	public ChangeEmployeeNameCommand(String id, String surname) {
		super();
		this.id = id;
		this.surname = surname;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChangeEmployeeNameCommand other = (ChangeEmployeeNameCommand) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "ChangeEmployeeNameCommand [id=" + id + ", surname=" + surname + "]";
	}
    
}
