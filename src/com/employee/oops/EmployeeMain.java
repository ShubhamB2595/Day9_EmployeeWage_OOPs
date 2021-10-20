package com.employee.oops;
/*
 * main method for the employee wage computation
 */
public class EmployeeMain {

	public static void main(String[] args) {
		
		//create objects
		EmployeeWage dmart = new EmployeeWage("Dmart", 20, 2, 20);
		EmployeeWage ekart = new EmployeeWage("Ekart", 50, 5, 50);
		dmart.calculateSalary();
		System.out.println(dmart);
		ekart.calculateSalary();
		System.out.println(ekart);	

	
	}

}
