package com.xworkz.DTO;

public class DTORunner {

		
		public static void main(String[] args) {
			
			System.out.println("starting main in dto runner");
			System.out.println("======================================");
			
			Hospital hospital=new Hospital();
			hospital.setName("Apollo");
			hospital.setDisease("cough");
			hospital.setLocation("banglore");
			hospital.setHasEmergencyServices(false);
			hospital.setNoOfFloors(4);
			hospital.setNoOfWards(35);
			hospital.setNumberOfDoctors(30);
			hospital.setPatientAge("40");
			hospital.setPatientName("sudha");
			hospital.setRating(5);
			System.out.println("hospital info:"+hospital); 
			System.out.println("======================================");
			
			BloodGroup bg=new BloodGroup();
			bg.setAntibodyType("A");
			bg.setAntigenType("B");
			bg.setCompatibleWithOType(true);
			bg.setGroupType("AB+ve");
			bg.setHemoglobinLevel(5.4);
			bg.setPlasmaType("AB");
			bg.setPlateletCount(150.000);
			bg.setRedBloodCellCount(4);
			bg.setRhFactor(false);
			bg.setWhiteBloodCellCount(4500);
			System.out.println("Bloodgroup info:"+bg);
		    System.out.println("======================");
		    
		    
		    Medical medical=new Medical();
		    medical.setAdmitted(true);
		    medical.setBloodType("A");
		    medical.setDiagnosis("eye");
		    medical.setDoctorName("pavan");
		    medical.setHospitalName("Shankara");
		    medical.setMedication("tablet");
		    medical.setPatientAge(20);
		    medical.setPatientGender("female");
		    medical.setPatientName("savitha");
		    medical.setTemperature(97.5);
		    System.out.println("Bloodgroup info:"+bg);
		    System.out.println("======================");
		    
		    Medicine medicine=new Medicine();
		    medicine.setDescription("fever");
		    medicine.setDosageForm("650");
		    medicine.setExpiryDate("20dec");
		    medicine.setGeneric(true);
            medicine.setManufactureDate("15oct");
            medicine.setManufacturer("microlab");
            medicine.setName("dolo");
            medicine.setPrescriptionRequired(false);
            medicine.setPrice(50);
            medicine.setQuantity(10);
            System.out.println("medicine info:"+medicine);
		    System.out.println("======================");
            
		   Nurse nurse=new Nurse();
		   nurse.setAddress("shimoga");
		   nurse.setAge(30);
		   nurse.setGender("female");
		   nurse.setLicenseNumber("abc24");
		   nurse.setName("sonu");
		   nurse.setPhoneNumber("9876555255");
		   nurse.setRegistered(true);
		   nurse.setShift("morning");
		   nurse.setSpecialization("icu");
		   nurse.setYearsOfExperience(4.5);
		   System.out.println("nurse info:"+nurse);
		    System.out.println("======================");
		    
		    
		    Patient patient=new Patient();
		    patient.setAddress("banglore");
		    patient.setAge(25);
		    patient.setBloodType("AB+VE");
		    patient.setBP(80);
		    patient.setDiseaseType("cold");
		    patient.setGender("female");
		    patient.setHasInsurance(true);
		   	patient.setName("ankitha");
		   	patient.setPhoneNumber("9865325672");
		   	patient.setWeight(45.7);
		    System.out.println("patient info:"+patient);
		    System.out.println("======================");
		    
		    System.out.println("ending main in dto runner");
		   			    		
		  
		    }

	}
		
		



