package com.capgemini.day3;

public class EmployeeDetails {
	private long empId;
	private String empName;
	private double empBasicSalary,empMedical,empHRA,empPF,empGrossSalary,empNetSalary;
	public static final double empPT=200; 
	
	public static long noOfEmp;
	
	public EmployeeDetails() {
		noOfEmp++;
	}
	public EmployeeDetails(long empId, String empName, double empBasicSalary, double empMedical) {
		this.empId=empId;
		this.empName=empName;
		this.empBasicSalary=empBasicSalary;
		this.empMedical=empMedical;
		//a+=empId;
		noOfEmp++;
	}
	public double calculateNetSalary(double empBasicSalary, double empMedical) {
		this.empBasicSalary=empBasicSalary;
		empHRA=empBasicSalary/2;
		empPF=(empBasicSalary*12)/100;
		empGrossSalary=empHRA+empBasicSalary+empMedical;
		empNetSalary=empGrossSalary-(empPF+empPT);
		return empNetSalary;
	}
}
