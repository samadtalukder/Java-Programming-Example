package com.class_example.doctor;

public class PersonalSecretary extends BasicInfo {

	public PersonalSecretary(int id, String name) {
		super(id, name);
	}
	public void available(BasicInfo basicInfo,Doctor doctor) {
		if (basicInfo.equals("Available")) {
			if (doctor.availableDate.equals("yes")) {
				System.out.println("Appointment Available");
			}
		}else {
			System.out.println("Wrong Input");
		}
	}
	public void patientList(Patient patient) {
		System.out.println("Patient's Id:"+patient.getId());
		System.out.println("Patient's Name:"+patient.getName());
	}

}
