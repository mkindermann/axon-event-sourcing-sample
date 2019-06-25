package de.datev.axon.coreapi.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class ChangeEmployeeAddressCommand {

    @TargetAggregateIdentifier
    private final String id;
    private final Payload payload;
	
	public ChangeEmployeeAddressCommand(String id, String city, String streetAddress, String postalCode) {
		super();
		this.id = id;
		this.payload = new Payload();
		this.payload.city = city;
		this.payload.streetAddress = streetAddress;
		this.payload.postalCode = postalCode;
	}

	public String getId() {
		return id;
	}

	public String getCity() {
		return payload.city;
	}

	public String getStreetAddress() {
		return payload.streetAddress;
	}

	public String getPostalCode() {
		return payload.postalCode;
	}

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((payload == null) ? 0 : payload.hashCode());
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
		ChangeEmployeeAddressCommand other = (ChangeEmployeeAddressCommand) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (payload == null) {
			if (other.payload != null)
				return false;
		} else if (!payload.equals(other.payload))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ChangeEmployeeAddressCommand [id=" + id + ", payload=" + payload + "]";
	}

	class Payload {
    	
    	String city;
    	String streetAddress;
    	String postalCode;
    	
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((city == null) ? 0 : city.hashCode());
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
			Payload other = (Payload) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (city == null) {
				if (other.city != null)
					return false;
			} else if (!city.equals(other.city))
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
		
		private ChangeEmployeeAddressCommand getOuterType() {
			return ChangeEmployeeAddressCommand.this;
		}
		
		@Override
		public String toString() {
			return "Payload [city=" + city + ", streetAddress=" + streetAddress + ", postalCode=" + postalCode + "]";
		}
    	
    }
        
}
