package com.xworkz.DTO;

public class Patient {
	
	    private String name;
	    private int age;
	    private String gender;
	    private String address;
	    private String phoneNumber;
	    private String bloodType;
	    private String diseaseType;
	    private double weight;
	    private boolean hasInsurance;
	    private int BP;
	    
	public  Patient(){
	    	
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getDiseaseType() {
		return diseaseType;
	}

	public void setDiseaseType(String diseaseType) {
		this.diseaseType = diseaseType;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isHasInsurance() {
		return hasInsurance;
	}

	public void setHasInsurance(boolean hasInsurance) {
		this.hasInsurance = hasInsurance;
	}

	public int getBP() {
		return BP;
	}

	public void setBP(int bP) {
		BP = bP;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", bloodType=" + bloodType + ", diseaseType=" + diseaseType
				+ ", weight=" + weight + ", hasInsurance=" + hasInsurance + ", BP=" + BP + "]";
	}
	
}