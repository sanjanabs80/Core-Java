package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Parking;

import java.util.Comparator;

public class ParkingVehicleTypeComparatorAsc implements Comparator<Parking>

{

    @Override
    public int compare(Parking o1, Parking o2) {
        return o1.getVehicleType().compareTo(o2.getVehicleType());
    }



}
