package com.class_example2;

public class Admin extends BasicInfo {

	public Admin(int id, String name) {
		super(id, name);
	}
	public void doctorInfo(Doctor doctor) {
		System.out.println("Doctor's Id: "+doctor.getId());
		System.out.println("Doctor's Name: "+doctor.getName());
	}
	public void personalSecretaryInfo(PersonalSecretary personalSecretary) {
		System.out.println("Personal Secretary Id: "+personalSecretary.getId());
		System.out.println("Personal Secretary Name: "+personalSecretary.getName());
	}
	public void patientInfo(Patient patient,Doctor doctor) {
		System.out.println("Patient Id: "+patient.getId());
		System.out.println("Patient Name: "+patient.getName());
		System.out.println("Assigned to Doctor :"+doctor.getName());
	}

}
