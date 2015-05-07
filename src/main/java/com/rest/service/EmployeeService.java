package com.rest.service;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.rest.model.Employee;
import com.rest.model.EmployeeAddress;
import com.rest.model.EmployeeRecord;


@Path("/employees")
public class EmployeeService {

	 public int count;

	  @GET
	  @Produces({"application/xml","application/json" })
	  public EmployeeRecord getEmployee() {

		 List<Employee> empList =new ArrayList<>();
		 List<EmployeeAddress> addList =new ArrayList<>();
		 EmployeeRecord data=new EmployeeRecord();

	     Employee emp1=new Employee();
	     emp1.setId(1);
	     emp1.setName("Sudipta Sarkar");
	     emp1.setAge(29);
	     emp1.setExperience(6);
	     emp1.setOrganization("CTS");
	     emp1.setSkill("java");

	     EmployeeAddress add1=new EmployeeAddress();
	     add1.setCity("UTTARPARA");
	     add1.setPin(712258);
	     add1.setState("West Bangal");
	     add1.setCountry("India");

	    // addList.add(add1);
	     emp1.setAddress(new EmployeeAddress[] {add1});
	     empList.add(emp1);
	     data.setEmployee(empList);

	     Employee emp2=new Employee();
	     emp2.setId(2);
	     emp2.setName("Antara Majumder");
	     emp2.setAge(30);
	     emp2.setExperience(7);
	     emp2.setOrganization("CTS");
	     emp2.setSkill("java");

	     EmployeeAddress add2=new EmployeeAddress();
	     add2.setCity("KOLKATA");
	     add2.setPin(712267);
	     add2.setState("West Bangal");
	     add2.setCountry("India");
	     //List<EmployeeAddress> addList1 =new ArrayList<>();
	    // addList1.add(add2);

	     emp2.setAddress(new EmployeeAddress[] {add2});
	     empList.add(emp2);
	     data.setEmployee(empList);

	     Employee emp3=new Employee();
	     emp3.setId(3);
	     emp3.setName("Anirban Roy");
	     emp3.setAge(30);
	     emp3.setExperience(7);
	     emp3.setOrganization("CTS");
	     emp3.setSkill("java");

	     EmployeeAddress add3=new EmployeeAddress();
	     add3.setCity("KOLKATA");
	     add3.setPin(712267);
	     add3.setState("West Bangal");
	     add3.setCountry("India");
	     //List<EmployeeAddress> addList2 =new ArrayList<>();
	    // addList2.add(add3);

	     emp3.setAddress(new EmployeeAddress[] {add3});
	     empList.add(emp3);
	     data.setEmployee(empList);



	    return  data;
	  }

}
