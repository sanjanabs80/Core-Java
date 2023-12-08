package com.xworkz.DTO;

public class Medicine {
	
	    private String name;
	    private String manufacturer;
	    private double price;
	    private int quantity;
	    private String description;
	    private boolean prescriptionRequired;
	    private String manufactureDate;
	    private String dosageForm;
	    private String expiryDate;
	    private boolean isGeneric;
  
	    
	public Medicine(){
	    }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean isPrescriptionRequired() {
		return prescriptionRequired;
	}


	public void setPrescriptionRequired(boolean prescriptionRequired) {
		this.prescriptionRequired = prescriptionRequired;
	}


	public String getManufactureDate() {
		return manufactureDate;
	}


	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}


	public String getDosageForm() {
		return dosageForm;
	}


	public void setDosageForm(String dosageForm) {
		this.dosageForm = dosageForm;
	}


	public String getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}


	public boolean isGeneric() {
		return isGeneric;
	}


	public void setGeneric(boolean isGeneric) {
		this.isGeneric = isGeneric;
	}


	@Override
	public String toString() {
		return "Medicine [name=" + name + ", manufacturer=" + manufacturer + ", price=" + price + ", quantity="
				+ quantity + ", description=" + description + ", prescriptionRequired=" + prescriptionRequired
				+ ", manufactureDate=" + manufactureDate + ", dosageForm=" + dosageForm + ", expiryDate=" + expiryDate
				+ ", isGeneric=" + isGeneric + "]";
	}
	    
	   

}
