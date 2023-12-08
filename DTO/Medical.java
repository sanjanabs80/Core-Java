package com.xworkz.DTO;

public class Medical {
	
	    private String patientName;
	    private int patientAge;
	    private String patientGender;
	    private String diagnosis;
	    private String medication;
	    private String doctorName;
	    private String hospitalName;
	    private String bloodType;
	    private double temperature;
	    private boolean isAdmitted;
	    
	    Medical(){
	    	
	    }

		public String getPatientName() {
			return patientName;
		}

		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}

		public int getPatientAge() {
			return patientAge;
		}

		public void setPatientAge(int patientAge) {
			this.patientAge = patientAge;
		}

		public String getPatientGender() {
			return patientGender;
		}

		public void setPatientGender(String patientGender) {
			this.patientGender = patientGender;
		}

		public String getDiagnosis() {
			return diagnosis;
		}

		public void setDiagnosis(String diagnosis) {
			this.diagnosis = diagnosis;
		}

		public String getMedication() {
			return medication;
		}

		public void setMedication(String medication) {
			this.medication = medication;
		}

		public String getDoctorName() {
			return doctorName;
		}

		public void setDoctorName(String doctorName) {
			this.doctorName = doctorName;
		}

		public String getHospitalName() {
			return hospitalName;
		}

		public void setHospitalName(String hospitalName) {
			this.hospitalName = hospitalName;
		}

		public String getBloodType() {
			return bloodType;
		}

		public void setBloodType(String bloodType) {
			this.bloodType = bloodType;
		}

		public double getTemperature() {
			return temperature;
		}

		public void setTemperature(double temperature) {
			this.temperature = temperature;
		}

		public boolean isAdmitted() {
			return isAdmitted;
		}

		public void setAdmitted(boolean isAdmitted) {
			this.isAdmitted = isAdmitted;
		}

		@Override
		public String toString() {
			return "Medical [patientName=" + patientName + ", patientAge=" + patientAge + ", patientGender="
					+ patientGender + ", diagnosis=" + diagnosis + ", medication=" + medication + ", doctorName="
					+ doctorName + ", hospitalName=" + hospitalName + ", bloodType=" + bloodType + ", temperature="
					+ temperature + ", isAdmitted=" + isAdmitted + "]";
		}
	    

}
