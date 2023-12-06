package com.demo.beans;

public class Employee {
 private int empid;       // Employee class
 private String flname;
 private String gender;
public Employee() {
	super();
}
public Employee(int empid, String flname, String gender) {
	super();
	this.empid = empid;
	this.flname = flname;
	this.gender = gender;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getFlname() {
	return flname;
}
public void setFlname(String flname) {
	this.flname = flname;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", flname=" + flname + ", gender=" + gender + "]";
}
}
