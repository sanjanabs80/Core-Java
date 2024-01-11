package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Parking;

import java.util.Comparator;

public class ParkingNameComparatorDesc implements Comparator<Parking>

{

    @Override
    public int compare(Parking o1, Parking o2) {
        return o2.getName().compareTo(o1.getName());
    }



}
