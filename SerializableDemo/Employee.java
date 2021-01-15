package com.RevatureTraining.day03.SerializableDemo;

public class Employee {
	private String employeesName;
	private int employeeID;
	
	public Employee() {
		super();
	}
	
	public Employee(String employeesName, int employeeID) {
		super();
		this.employeesName = employeesName;
		this.employeeID = employeeID;
	}
	public static void employeeGenerator() {
		Employee[] employees = {
		new Employee("Employee1", 1), new Employee("Employee2", 2), new Employee("Employee1", 3)
		};
	

}
}
