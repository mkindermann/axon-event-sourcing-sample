package de.datev.axon.coreapi.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class ChangeEmployeeBankAccountCommand {

    @TargetAggregateIdentifier
	private final String id;
	private final String iban;
	
	public ChangeEmployeeBankAccountCommand(String id, String iban) {
		super();
		this.id = id;
		this.iban = iban;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((iban == null) ? 0 : iban.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		ChangeEmployeeBankAccountCommand other = (ChangeEmployeeBankAccountCommand) obj;
		if (iban == null) {
			if (other.iban != null)
				return false;
		} else if (!iban.equals(other.iban))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "ChangeEmployeeBankAccountCommand [id=" + id + ", iban=" + iban + "]";
	}	
}
