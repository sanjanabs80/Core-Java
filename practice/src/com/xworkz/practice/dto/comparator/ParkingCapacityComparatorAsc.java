package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Parking;

import java.util.Comparator;

public class ParkingCapacityComparatorAsc implements Comparator<Parking>

{

    @Override
    public int compare(Parking o1, Parking o2) {
        return Integer.compare(o1.getCapacity(), o2.getCapacity());
    }


}
