package javafxmltestapp;

public class Appointment {
	
	private String appointmentID, patientID, doctorID, date, time, description;

	public String getAppointmentID() {
		return appointmentID;
	}
	
	public void setAppointmentID(String appointmentID) {
		this.appointmentID = appointmentID;
	}
	
	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public String getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(String doctorID) {
		this.doctorID = doctorID;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
