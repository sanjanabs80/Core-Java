package com.xworkz.DTO;

public class Hospital {
	

	    private String name;
	    private String location;
	    private String patientName;
	    private int numberOfDoctors;
	    private int noOfWards;
	    private String disease;
	    private boolean hasEmergencyServices;
	    private String patientAge;
	    private double rating;
	    private int noOfFloors ;

	   
	public   Hospital ()
	{
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getPatientName() {
		return patientName;
	}


	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}


	public int getNumberOfDoctors() {
		return numberOfDoctors;
	}


	public void setNumberOfDoctors(int numberOfDoctors) {
		this.numberOfDoctors = numberOfDoctors;
	}


	public int getNoOfWards() {
		return noOfWards;
	}


	public void setNoOfWards(int noOfWards) {
		this.noOfWards = noOfWards;
	}


	public String getDisease() {
		return disease;
	}


	public void setDisease(String disease) {
		this.disease = disease;
	}


	public boolean isHasEmergencyServices() {
		return hasEmergencyServices;
	}


	public void setHasEmergencyServices(boolean hasEmergencyServices) {
		this.hasEmergencyServices = hasEmergencyServices;
	}


	public String getPatientAge() {
		return patientAge;
	}


	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	public int getNoOfFloors() {
		return noOfFloors;
	}


	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}


	@Override
	public String toString() {
		return "Hospital [name=" + name + ", location=" + location + ", patientName=" + patientName
				+ ", numberOfDoctors=" + numberOfDoctors + ", noOfWards=" + noOfWards + ", disease=" + disease
				+ ", hasEmergencyServices=" + hasEmergencyServices + ", patientAge=" + patientAge + ", rating=" + rating
				+ ", noOfFloors=" + noOfFloors + "]";
	}
	
	}

	    	        