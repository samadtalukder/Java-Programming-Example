package com.class_example.doctor;

public class Patient extends BasicInfo {
	public int desiredDate;

	public Patient(int id, String name) {
		super(id, name);
	}
	public void checkAppoinment(Doctor doctor) {
		if(doctor.availableDate.equals("yes")) {
			System.out.println("*** Doctor is available ***");
			System.out.println("Patient is assigned to Dr. "+doctor.getName());
		}else {
			System.out.println("Doctor is not available at this time");
		}
	}

}
