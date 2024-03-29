package de.datev.axon.coreapi.events;

public class EmployeeEmailAddressChangedEvent {

	private final String id;
	private final String email;
	
	public EmployeeEmailAddressChangedEvent(String id, String email) {
		super();
		this.id = id;
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
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
		EmployeeEmailAddressChangedEvent other = (EmployeeEmailAddressChangedEvent) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
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
		return "EmployeeEmailAddressChanged [id=" + id + ", email=" + email + "]";
	}
	
}
