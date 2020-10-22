package com.example.shetter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {
 String empName;
 String empId;
 String empDep;
 @Autowired
 Address add;
 
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String empName, String empId, String empDep) {
	super();
	this.empName = empName;
	this.empId = empId;
	this.empDep = empDep;
}
public String getEmpName() {
	return empName;
}
@Value("${employee.empName}")
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpId() {
	return empId;
}
@Value("${employee.empId}")
public void setEmpId(String empId) {
	this.empId = empId;
}
public String getEmpDep() {
	return empDep;
}
@Value("${employee.empDep}")
public void setEmpDep(String empDep) {
	this.empDep = empDep;
}
@Override
public String toString() {
	return "Employee [empName=" + empName + ", empId=" + empId + ", empDep=" + empDep + ", add=" + add + "]";
}


}
