package com.mtc.app.vo;
import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name="employees")
public class Employees {

	@Id
	private int employeeNumber;
	private String lastName;
	private String firstName;
	private String extension;
	private String email;
	@ManyToOne
	@JoinColumn(name="officeCode")
	private Offices offices;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="reportsTo", insertable=false,updatable=false)
	private Employees reportsTo;	
	
	private String jobTitle;
	
	@OneToMany(mappedBy="reportsTo")
	private Set<Employees> Managers;
	
	@OneToMany(mappedBy="employees")
	private Set<Customers> customers;

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Offices getOffices() {
		return offices;
	}

	public void setOffices(Offices offices) {
		this.offices = offices;
	}

	public Employees getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(Employees reportsTo) {
		this.reportsTo = reportsTo;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Set<Employees> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(Set<Employees> subordinates) {
		this.subordinates = subordinates;
	}

	public Set<Customers> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customers> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "Employees [employeeNumber=" + employeeNumber + ", lastName=" + lastName + ", firstName=" + firstName
				+ ", extension=" + extension + ", email=" + email 
				+ ", jobTitle=" + jobTitle  + "]";
	}
	
	
}
