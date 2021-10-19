package com.employee.oops;
/*
 * calculating employee wage
 */
public class EmployeeWage {
	//Constants
	static final int FULL_TIME = 1;
	
	//method for checking employee attendance 
	public static void attendance() {
		//checking attendance using random function
		int attendance = (int) Math.floor(Math.random() * 10 % 2);
		if(attendance == FULL_TIME) {
			System.out.println("Employee is Present for day:");
		}
		else {
			System.out.println("Employee is Absent for day:");
		}
	}
}
