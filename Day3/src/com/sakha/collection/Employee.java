package com.sakha.collection;

import java.io.Serializable;

public class Employee implements Serializable {
	long empId;
	String empName;
	transient long empSalary;
	
	public Employee(long empId, String empName, long empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	

}
