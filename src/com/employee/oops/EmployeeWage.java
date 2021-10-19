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
		
		switch(attendance) {
			case FULL_TIME:
				System.out.println("Employee is Present for full day:");
				workingHrs = 8;
				break;
	
			case PART_TIME:
				System.out.println("Employee is Present for half day:");
				workingHrs = 4;
				break;
				
			default:
				System.out.println("Employee is Absent for day:");
				workingHrs = 0;	
				break;
		}

		int dailyWage = workingHrs * WAGE_PER_HR;
		System.out.println("Empoyee wage for the day is: " + dailyWage);
	}
}
