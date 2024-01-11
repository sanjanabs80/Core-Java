package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Parking;

import java.util.Comparator;

public class ParkingAmountComparatorDesc implements Comparator<Parking>

{

    @Override
    public int compare(Parking o1, Parking o2) {
        return Integer.compare(o2.getAmount(), o1.getAmount());
    }


}
