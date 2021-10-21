/**
 * 
 */
package com.employee.oops;

/**
 * @author SAB
 *
 */
public interface IComputeWage {
	
	public void addCompany(String company, int wagePerHr, int maxWorkDays, int maxWorkHrs);
	public void calculateSalary();
	int companyToEmpMap(String company);
	
}
