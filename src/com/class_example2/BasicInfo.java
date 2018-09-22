package com.class_example2;

public class BasicInfo {
	private int id;
	private String name;
	private int sitNo;

	public BasicInfo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSitNo() {
		return sitNo;
	}
	private String appointmentAvailableCheck() {
		if(sitNo >= 20) {
			return "Appointment Available";
		}else {
			return "Appointment Not Available";
		}
	}

}
