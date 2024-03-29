package de.datev.axon.coreapi.events;

import java.time.LocalDate;

public class EmployeeJoinedCompanyEvent {

	private final String id;
	private final String givenName;
	private final String surname;
	private final String gender;
	private final LocalDate dateOfBirth;
	private final String companyId;
	private final String city;
	private final String streetAddress;
	private final String postalCode;
	private final String iban;
	private final String email;
	
	public EmployeeJoinedCompanyEvent(String id, String givenName, String surname, String gender, LocalDate dateOfBirth,
			String companyId, String city, String streetAddress, String postalCode, String iban,
			String email) {
		super();
		this.id = id;
		this.givenName = givenName;
		this.surname = surname;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
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
		result = prime * result + ((postalCode == null) ? 0 : postalCode.hashCode());
		result = prime * result + ((streetAddress == null) ? 0 : streetAddress.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "EmployeeJoinedCompanyEvent [id=" + id + ", givenName=" + givenName + ", surname=" + surname
				+ ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", companyId=" + companyId + ", city=" + city
				+ ", streetAddress=" + streetAddress + ", postalCode=" + postalCode + ", iban=" + iban + ", email="
				+ email + "]";
	}

	
}
