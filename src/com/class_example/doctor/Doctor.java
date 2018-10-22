package com.class_example.doctor;

public class Doctor extends BasicInfo {
	public String availableDate;

	public Doctor(int id, String name, String availableDate) {
		super(id, name);
		this.availableDate = availableDate;
	}

	public void patientList(Patient patient) {
		System.out.println("Patient's Id:" + patient.getId());
		System.out.println("Patient's name:" + patient.getName());
	}
}
