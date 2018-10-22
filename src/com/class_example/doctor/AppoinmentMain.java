package com.class_example.doctor;

public class AppoinmentMain {

	public static void main(String[] args) {
		Admin admin = new Admin(1, "admin");
		Doctor doctor = new Doctor(1102, "Harun Ar Rashid", "yes");
		Doctor doctor2 = new Doctor(1103, "Syed Atiqul Haq", "no");
		PersonalSecretary personalSecretary = new PersonalSecretary(1, "Kamal");
		Patient patient = new Patient(1, "Mahfuz");
		Patient patient2 = new Patient(2, "Kabir");
		Appointment appointment = new Appointment(1, "available");
		// print doctor info
		admin.doctorInfo(doctor);
		// print 2nd doctor info
		// admin.doctorInfo(doctor2);
		// print patient info & assigned to doctor
		admin.patientInfo(patient, doctor2);
		// print personal secretary info
		//admin.personalSecretaryInfo(personalSecretary);
		// print doctor patient list
		//doctor.patientList(patient2);
		// print
		// appointment.checkAvailable(admin, doctor);
		personalSecretary.available(appointment, doctor);
		// check patient appointment
		patient.checkAppoinment(doctor);
		

	}

}
