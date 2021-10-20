package com.employee.oops;
/*
 * calculating employee wage
 */
public class EmployeeWage {
	//Constants
	static final int FULL_TIME = 1;
	static final int PART_TIME = 2;
	
	//method for checking employee attendance 
	public static int calculateSalary(String company, int wagePerHr, int maxWorkDays, int maxWorkHrs) {
		
		int workingHrs = 0, workDays = 0;
		
		while (workingHrs <= maxWorkHrs && workDays < maxWorkDays) {
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
		//	System.out.println("Employee is present for day: " + workDays + " Working Hrs: " + workingHrs);
		}
		int wage = workingHrs * wagePerHr;
		System.out.println("Total employee wage for company: " + company + " is: " + wage);
		return wage;
	}


}
