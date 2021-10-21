package com.employee.oops;
/*
 * calculating employee wage
 */
public class EmployeeWage {

	public final String company;
	public final int wagePerHr;
	public final int maxWorkDays;
	public final int maxWorkHrs;
	public int empWage;

	EmployeeWage(String company, int wagePerHr, int maxWorkDays, int maxWorkHrs) {
		this.company = company;
		this.wagePerHr = wagePerHr;
		this.maxWorkDays = maxWorkDays;
		this.maxWorkHrs = maxWorkHrs;

	}

	@Override
	public String toString() {
		return "Total employee wage for company: " + company + " is: " + empWage;
	}

	public int getEmpWage() {
		return empWage;
	}

	public void setEmpWage(int empWage) {
		this.empWage = empWage;
	}

	public String getCompany() {
		return company;
	}

	public int getWagePerHr() {
		return wagePerHr;
	}

	public int getMaxWorkDays() {
		return maxWorkDays;
	}

	public int getMaxWorkHrs() {
		return maxWorkHrs;
	}
	
	

	
}
