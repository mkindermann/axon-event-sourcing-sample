package de.datev.axon.coreapi.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class EmployeeLeftCompanyCommand {

	@TargetAggregateIdentifier
	private final String id;
	private final String city;
	private final String streetAddress;
	private final String postalCode;
	
	public EmployeeLeftCompanyCommand(String id, String city, String streetAddress, String postalCode) {
		super();
		this.id = id;
		this.city = city;
		this.streetAddress = streetAddress;
		this.postalCode = postalCode;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((postalCode == null) ? 0 : postalCode.hashCode());
		result = prime * result + ((streetAddress == null) ? 0 : streetAddress.hashCode());
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
		EmployeeLeftCompanyCommand other = (EmployeeLeftCompanyCommand) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (postalCode == null) {
			if (other.postalCode != null)
				return false;
		} else if (!postalCode.equals(other.postalCode))
			return false;
		if (streetAddress == null) {
			if (other.streetAddress != null)
				return false;
		} else if (!streetAddress.equals(other.streetAddress))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "EmployeeLeftCompanyCommand [id=" + id + ", city=" + city + ", streetAddress=" + streetAddress + ", postalCode="
				+ postalCode + "]";
	}
	
}
