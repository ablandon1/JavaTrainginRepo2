package com.RevatureTraining.day03.SerializableDemo;

import java.io.*;

public class WriteReadEmployee {
	
	 public static Employee emp;
	

	public static void main(String[] args) {
		Employee.employeeGenerator();
		serializeEmployee(emp);
		deserializeEmployee(emp);	
		
	}
	public static void serializeEmployee(Employee emp) {
		
		try {
			FileOutputStream fileOut = new FileOutputStream("employees.dat");
			ObjectOutputStream objWrite = new ObjectOutputStream(fileOut);
			objWrite.writeObject(emp);
			objWrite.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void deserializeEmployee(Employee emp) {
		try {
			FileInputStream fileIn = new FileInputStream("employees.dat");
			ObjectInputStream objRead = new ObjectInputStream(fileIn);

			Employee emp1 = (Employee) objRead.readObject();
			emp1.toString();
			Employee emp2 = (Employee) objRead.readObject();
			emp2.toString();
			Employee emp3 = (Employee) objRead.readObject();
			emp3.toString();


			objRead.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
