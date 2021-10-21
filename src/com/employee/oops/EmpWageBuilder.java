package com.employee.oops;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/*
 * Class for saving all the company data
 */
public class EmpWageBuilder implements IComputeWage {

	//Constants
	public static final int FULL_TIME = 1;
	public static final int PART_TIME = 2;
	
    private LinkedList<EmployeeWage> employeeWageList;
    private Map<String, EmployeeWage> companyToEmpMap;
    
    //Wage Computation method
    public EmpWageBuilder(){
    	employeeWageList = new LinkedList<>();
    	companyToEmpMap = new HashMap<>();
    }
    
    public // adding new company data
    void addCompany(String company, int wagePerHr, int maxWorkDays, int maxWorkHrs) {
    	EmployeeWage employeeWage = new EmployeeWage(company, wagePerHr, maxWorkDays, maxWorkHrs);
    	employeeWageList.add(employeeWage);
    	companyToEmpMap.put(company, employeeWage);
    	
    }
    
    //storing data to array list
    public void calculateSalary(){
    	for(int i = 0; i < employeeWageList.size(); i++){
    		EmployeeWage employeeWage = employeeWageList.get(i);
            employeeWage.setEmpWage(this.calculateSalary(employeeWage));
            System.out.println(employeeWage);
        }
    }
    
	@Override
	public int companyToEmpMap(String company) {
		return companyToEmpMap.get(company).empWage;
		
	}

	//method for calculating employee salary 
	private int calculateSalary(EmployeeWage employeeWage) {
		
		int workingHrs = 0, workDays = 0, totalWorkingHrs = 0;
		while (workingHrs <= employeeWage.maxWorkHrs && workDays < employeeWage.maxWorkDays) {
			
		//checking attendance using random function
			int attendance = (int) Math.floor(Math.random() * 10 % 3);
		
			switch(attendance) {
				case FULL_TIME:
					workingHrs = 8;
					break;
	
				case PART_TIME:
					workingHrs = 4;
					break;
				
				default:
					workingHrs = 0;	
					break;
			}
			int dailyWage = workingHrs * employeeWage.wagePerHr; 		
			System.out.println("Employee is present for day: " + workDays + " Working Hrs: " + workingHrs + " Dailywage: " + dailyWage);
			totalWorkingHrs += workingHrs;
			
			workDays++;
		}
		employeeWage.empWage = totalWorkingHrs * employeeWage.wagePerHr;
		System.out.println("Total employee wage for company: " + employeeWage.company + " is: " + employeeWage.empWage);
		return employeeWage.empWage;
	}
    
}
