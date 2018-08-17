package com.abstraction.employee;

public class FullTimeEmployee extends Employee{
	private int workingHour;
	
	public FullTimeEmployee(String empName, int paymentPerHour,int workingHour) {
		super(empName, paymentPerHour);
		this.workingHour = workingHour;
		
	}
	
	public int getWorkingHour() {
		return workingHour;
	}

	public void setWorkingHour(int workingHour) {
		this.workingHour = workingHour;
	}

	@Override
	public int calculateSalary() {
		return getPaymentPerHour() * workingHour;
	}
	
}
