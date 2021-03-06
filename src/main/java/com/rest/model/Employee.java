package com.rest.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "name", "age", "address", "organization","experience","skill" })
@Entity
@Table(name="Employee")
public class Employee {

 @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
	private String name;
	private int age;
	private String organization;
	private int experience;
	private String skill;

	/*private List<EmployeeAddress> address;*/

	private EmployeeAddress[] address;


	public String getName() {
		return name;
	}
	@XmlElement(name="EMPLOYEE_NAME")
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	@XmlElement(name="EMPLOYEE_AGE")
	public void setAge(int age) {
		this.age = age;
	}

	public String getOrganization() {
		return organization;
	}
	@XmlElement(name="EMPLOYEE_ORGANIZATION")
	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public int getExperience() {
		return experience;
	}
	@XmlElement(name="EMPLOYEE_EXPERIENCE")
	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getSkill() {
		return skill;
	}
	@XmlElement(name="EMPLOYEE_SKILL")
	public void setSkill(String skill) {
		this.skill = skill;
	}
/*	public List<EmployeeAddress> getAddress() {
		return address;
	}
	@XmlElement(name="EMPLOYEE_ADDRESS")
	public void setAddress(List<EmployeeAddress> address) {
		this.address = address;
	}*/


	public int getId() {
		return id;
	}
	@XmlAttribute(name="ID",required=true)
	public void setId(int id) {
		this.id = id;
	}
	public EmployeeAddress[] getAddress() {
		return address;
	}
	@XmlElement(name="EMPLOYEE_ADDRESS")
	public void setAddress(EmployeeAddress[] address) {
		this.address = address;
	}



}
