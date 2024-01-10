package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Parking;

import java.util.Comparator;

public class ParkingCapacityComparatorDesc implements Comparator<Parking>

{

    @Override
    public int compare(Parking o1, Parking o2) {
        return Integer.compare(o2.getCapacity(), o1.getCapacity());
    }


}
