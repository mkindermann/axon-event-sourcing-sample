package de.datev.axon.coreapi.events;

public class EmployeeTransferredToDepartmentEvent {

	private final String id;
	private final String departmentId;
	
	public EmployeeTransferredToDepartmentEvent(String id, String departmentId) {
		super();
		this.id = id;
		this.departmentId = departmentId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departmentId == null) ? 0 : departmentId.hashCode());
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
		EmployeeTransferredToDepartmentEvent other = (EmployeeTransferredToDepartmentEvent) obj;
		if (departmentId == null) {
			if (other.departmentId != null)
				return false;
		} else if (!departmentId.equals(other.departmentId))
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
		return "EmployeeTransferredToDepartment [id=" + id + ", departmentId=" + departmentId + "]";
	}

}
