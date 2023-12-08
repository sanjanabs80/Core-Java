package com.xworkz.DTO;

public class Nurse {
	
	    private String name;
	    private int age;
	    private String gender;
	    private String specialization;
	    private String licenseNumber;
	    private String phoneNumber;
	    private String address;
	    private double yearsOfExperience;
	    private boolean isRegistered;
	    private String shift;

      public Nurse(){
	   	  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(double yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	@Override
	public String toString() {
		return "Nurse [name=" + name + ", age=" + age + ", gender=" + gender + ", specialization=" + specialization
				+ ", licenseNumber=" + licenseNumber + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", yearsOfExperience=" + yearsOfExperience + ", isRegistered=" + isRegistered + ", shift=" + shift
				+ "]";
	}
	   	  
}
