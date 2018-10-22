package com.class_example.doctor;

public class Appointment extends BasicInfo{

	public Appointment(int id, String name) {
		super(id, name);
	}
	@SuppressWarnings("unlikely-arg-type")
	public void checkAvailable(BasicInfo basicInfo,Doctor doctor) {
		if (basicInfo.equals("available")) {
			if (doctor.availableDate.equals("yes")) {
				System.out.println("Appointment is Available");
			}
		}else {
			System.out.println("Appointment is not Available");
		}
	}

}
