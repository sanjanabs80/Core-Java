package com.xworkz.DTO;

public class BloodGroup {
	
	    private String groupType;
	    private boolean rhFactor;
	    private int redBloodCellCount;
	    private int whiteBloodCellCount;
	    private double hemoglobinLevel;
	    private double plateletCount;
	    private String plasmaType;
	    private boolean compatibleWithOType;
	    private String antigenType;
	    private String antibodyType;
	    
	public   BloodGroup(){
	    	
	    }

	public String getGroupType() {
		return groupType;
	}

	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public boolean isRhFactor() {
		return rhFactor;
	}

	public void setRhFactor(boolean rhFactor) {
		this.rhFactor = rhFactor;
	}

	public int getRedBloodCellCount() {
		return redBloodCellCount;
	}

	public void setRedBloodCellCount(int redBloodCellCount) {
		this.redBloodCellCount = redBloodCellCount;
	}

	public int getWhiteBloodCellCount() {
		return whiteBloodCellCount;
	}

	public void setWhiteBloodCellCount(int whiteBloodCellCount) {
		this.whiteBloodCellCount = whiteBloodCellCount;
	}

	public double getHemoglobinLevel() {
		return hemoglobinLevel;
	}

	public void setHemoglobinLevel(double hemoglobinLevel) {
		this.hemoglobinLevel = hemoglobinLevel;
	}

	public double getPlateletCount() {
		return plateletCount;
	}

	public void setPlateletCount(double plateletCount) {
		this.plateletCount = plateletCount;
	}

	public String getPlasmaType() {
		return plasmaType;
	}

	public void setPlasmaType(String plasmaType) {
		this.plasmaType = plasmaType;
	}

	public boolean isCompatibleWithOType() {
		return compatibleWithOType;
	}

	public void setCompatibleWithOType(boolean compatibleWithOType) {
		this.compatibleWithOType = compatibleWithOType;
	}

	public String getAntigenType() {
		return antigenType;
	}

	public void setAntigenType(String antigenType) {
		this.antigenType = antigenType;
	}

	public String getAntibodyType() {
		return antibodyType;
	}

	public void setAntibodyType(String antibodyType) {
		this.antibodyType = antibodyType;
	}

	@Override
	public String toString() {
		return "BloodGroup [groupType=" + groupType + ", rhFactor=" + rhFactor + ", redBloodCellCount="
				+ redBloodCellCount + ", whiteBloodCellCount=" + whiteBloodCellCount + ", hemoglobinLevel="
				+ hemoglobinLevel + ", plateletCount=" + plateletCount + ", plasmaType=" + plasmaType
				+ ", compatibleWithOType=" + compatibleWithOType + ", antigenType=" + antigenType + ", antibodyType="
				+ antibodyType + "]";
	}

	
}
