package com.rest.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="EMPLOYEE_RECORD")
public class EmployeeRecord implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1968717262529207603L;
	
	
	private List<Employee> employee;

	public List<Employee> getEmployee() {
		return employee;
	}
	@XmlElement(name="EMPLOYEE")
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

}
