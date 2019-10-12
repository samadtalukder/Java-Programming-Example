package com.abstraction.employee;

public abstract class Employee {
	private String empName;
	private int paymentPerHour;
	
	public Employee(String empName,int paymentPerHour) {
		this.empName = empName;
		this.paymentPerHour = paymentPerHour;
	}
	// abstract method
	public abstract int calculateSalary();
	// getter & setter method
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getPaymentPerHour() {
		return paymentPerHour;
	}
	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}
	

}
