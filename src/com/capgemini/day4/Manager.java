package com.capgemini.day4;

public class Manager {
	private int employeeId;
	private String employeeName;
	private String employeeAddress;
	private double employeephone;
	private double basicSalary;
	
	public Manager(int Id, String Name, String Address, double phone, double salary){
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress = Address;
		this.employeephone = phone;
		this.basicSalary = salary;
	}
}
