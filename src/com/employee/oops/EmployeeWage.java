package com.employee.oops;
/*
 * calculating employee wage
 */
public class EmployeeWage {
	//Constants
	static final int FULL_TIME = 1;
	static final int PART_TIME = 2;
	static final int WAGE_PER_HR = 20;
	
	//method for checking employee attendance 
	public static void attendance() {
		//checking attendance using random function
		int attendance = (int) Math.floor(Math.random() * 10 % 3);
		int workingHrs = 0;
		if(attendance == FULL_TIME) {
			System.out.println("Employee is Present for full day:");
			workingHrs = 8;
		}
		else if(attendance == PART_TIME) {
			System.out.println("Employee is Present for half day:");
			workingHrs = 4;
		}
			
		else {
			System.out.println("Employee is Absent for day:");
			workingHrs = 0;
		}
		
		int dailyWage = workingHrs * WAGE_PER_HR;
		System.out.println("Empoyee wage for the day is: " + dailyWage);
	}
}
