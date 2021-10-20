package com.employee.oops;
/*
 * Class for saving all the company data
 */
public class EmpWageBuilder {

	//Constants
	public static final int FULL_TIME = 1;
	public static final int PART_TIME = 2;
	
	private int numOfCompanies = 0;
    private EmployeeWage[] employeeWage;
    
    //Wage Computation method
    public EmpWageBuilder(){
    	employeeWage = new EmployeeWage[5];
    }
    
    // adding new company data
    void addCompany(String company, int wagePerHr, int maxWorkDays, int maxWorkHrs) {
    	employeeWage[numOfCompanies] = new EmployeeWage(company, wagePerHr, maxWorkDays, maxWorkHrs);
        numOfCompanies++;
    }
    
    void calculateSalary(){
    	for(int i = 0; i < numOfCompanies; i++){
            employeeWage[i].setEmpWage(this.calculateSalary(employeeWage[i]));
            System.out.println(employeeWage[i]);
        }
    }
    

	//method for calculating employee salary 
	private int calculateSalary(EmployeeWage employeeWage) {
		
		int workingHrs = 0, workDays = 0;
		while (workingHrs <= employeeWage.maxWorkHrs && workDays < employeeWage.maxWorkDays) {
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
		employeeWage.empWage = workingHrs * employeeWage.wagePerHr;
		System.out.println("Total employee wage for company: " + employeeWage.company + " is: " + employeeWage.empWage);
		return employeeWage.empWage;
	}
    
}
