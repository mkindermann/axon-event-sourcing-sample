package de.datev.axon.coreapi.commands;

import java.time.LocalDate;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class EmployeeJoinCompanyCommand {

    @TargetAggregateIdentifier
	private final String id;
	private final String givenName;
	private final String surname;
	private final String gender;
	private final LocalDate dateOfBirth;
	private final Integer index;
	private final String companyId;
	private final String city;
	private final String streetAddress;
	private final String postalCode;
	private final String iban;
	private final String email;

	public EmployeeJoinCompanyCommand(String id, String givenName, String surname, String gender, LocalDate dateOfBirth,
			Integer index, String companyId, String city, String streetAddress, String postalCode, String iban,
			String email) {
		super();
		this.id = id;
		this.givenName = givenName;
		this.surname = surname;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.index = index;
		this.companyId = companyId;
		this.city = city;
		this.streetAddress = streetAddress;
		this.postalCode = postalCode;
		this.iban = iban;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public String getGivenName() {
		return givenName;
	}

	public String getSurname() {
		return surname;
	}

	public String getGender() {
		return gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public Integer getIndex() {
		return index;
	}

	public String getCompanyId() {
		return companyId;
	}

	public String getCity() {
		return city;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getIban() {
		return iban;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((companyId == null) ? 0 : companyId.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((givenName == null) ? 0 : givenName.hashCode());
		result = prime * result + ((iban == null) ? 0 : iban.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((index == null) ? 0 : index.hashCode());
		result = prime * result + ((postalCode == null) ? 0 : postalCode.hashCode());
		result = prime * result + ((streetAddress == null) ? 0 : streetAddress.hashCode());
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
		EmployeeJoinCompanyCommand other = (EmployeeJoinCompanyCommand) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (companyId == null) {
			if (other.companyId != null)
				return false;
		} else if (!companyId.equals(other.companyId))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (givenName == null) {
			if (other.givenName != null)
				return false;
		} else if (!givenName.equals(other.givenName))
			return false;
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
		if (index == null) {
			if (other.index != null)
				return false;
		} else if (!index.equals(other.index))
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
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeJoinCompanyCommand [id=" + id + ", givenName=" + givenName + ", surname=" + surname
				+ ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", index=" + index + ", companyId="
				+ companyId + ", city=" + city + ", streetAddress=" + streetAddress + ", postalCode=" + postalCode
				+ ", iban=" + iban + ", email=" + email + "]";
	}
	
}
