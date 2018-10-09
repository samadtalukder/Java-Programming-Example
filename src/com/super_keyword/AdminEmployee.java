package com.super_keyword;

public class AdminEmployee extends Employee {

	public AdminEmployee() {
		super();
	}

	public static void main(String[] args) {
		AdminEmployee adminEmployee = new AdminEmployee();
		adminEmployee.displayData();
	}

	public void displayData() {
		System.out.println("\n" + "Name: " + super.empName + "\n" + "Salary: " + super.empSalary);
	}

}
