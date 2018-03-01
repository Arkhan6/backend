package com.youtube.demo.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Access(AccessType.FIELD)
public class User  extends ParentEntity {
	
	private static final long  serialVersionUID = -4611815928732870812L;
	
	@Column(name = "first_name", nullable= false, length = 255)
	private String firstName;
	
	@Column(name = "second_name", nullable= true, length = 255)
	private String secondName;
	
	@Column(name = "s", nullable= false, length = 255)
	private String firstSurname;
	
	@Column(name = "second_surname", nullable= true, length = 255)
	private String secondSurname;
	
	@Column(name = "phone", nullable= true, length = 30)
	private String phone;
	
	@Column(name = "address", nullable= true, length = 150)
	private String address;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String first_name) {
		this.firstName = first_name;
	}
	public String getSecond_name() {
		return secondName;
	}
	public void setSecondName(String second_name) {
		this.secondName = second_name;
	}
	public String getFirstSurname() {
		return firstSurname;
	}
	public void setFirstSurname(String first_surname) {
		this.firstSurname = first_surname;
	}
	public String getSecondSurname() {
		return secondSurname;
	}
	public void setSecondSurname(String second_surname) {
		this.secondSurname = second_surname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
