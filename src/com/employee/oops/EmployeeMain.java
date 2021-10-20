package com.employee.oops;
/*
 * main method for the employee wage computation
 */
public class EmployeeMain {

	public static void main(String[] args) {
		
		//creating objects

		EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompany("Dmart", 20, 2, 20);
        empWageBuilder.addCompany("Ekart", 30, 5, 50);
        empWageBuilder.calculateSalary();

	
	}

}
