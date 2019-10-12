package com.abstraction.employee;

public class EmployeeMain {

	public static void main(String[] args) {
		 FullTimeEmployee fullEmp = new FullTimeEmployee("Bappi", 8,8);
		//FullTimeEmployee fullEmp = new FullTimeEmployee();
		fullEmp.setEmpName("Bappi");
		fullEmp.setPaymentPerHour(10);
		fullEmp.setWorkingHour(120);
		fullEmp.calculateSalary();
		System.out.println("Employee Name: "+fullEmp.getEmpName());
		System.out.println("Employee Payment Per Hour: "+fullEmp.getPaymentPerHour());
		System.out.println("Employee Working Hour: "+fullEmp.getWorkingHour());
		System.out.println("Employee Salary: "+fullEmp.calculateSalary());

	}

}
