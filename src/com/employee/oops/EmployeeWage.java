package com.employee.oops;
/*
 * calculating employee wage
 */
public class EmployeeWage {
	//Constants
	static final int FULL_TIME = 1;
	static final int PART_TIME = 2;
	static final int WAGE_PER_HR = 20;
	static final int MAX_WORK_DAYS = 20;
	static final int MAX_WORK_HRS = 100;
	
	//method for checking employee attendance 
	public static void attendance() {
		int workingHrs = 0;
		int workDays = 0;
		
		while (workingHrs <= MAX_WORK_HRS && workDays < MAX_WORK_DAYS) {
			workDays++;
		//checking attendance using random function
			int attendance = (int) Math.floor(Math.random() * 10 % 3);
		
			switch(attendance) {
				case FULL_TIME:
					workingHrs += 8;
					break;
	
				case PART_TIME:
					workingHrs += 4;
					break;
				
				default:
					workingHrs += 0;	
					break;
			}
			System.out.println("Employee is present for day: " + workDays + " Working Hrs: " + workingHrs);
		}
		int wage = workingHrs * WAGE_PER_HR;
		System.out.println("Empoyee wage for the month is: " + wage);
	}
}
