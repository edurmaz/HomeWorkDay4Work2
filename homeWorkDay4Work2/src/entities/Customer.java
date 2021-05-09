package entities;

import java.time.LocalDate;

public class Customer {
	int id;
	String name;
	String lastName;
	LocalDate dateOfDay;
	String identificationNumber;
	
	public Customer(){};
	
	public Customer(int id, String name, String lastName, LocalDate dateOfDay, String identificationNumber) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.dateOfDay = dateOfDay;
		this.identificationNumber = identificationNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfDay() {
		return dateOfDay;
	}

	public void setDateOfDay(LocalDate dateOfDay) {
		this.dateOfDay = dateOfDay;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	
	

}
