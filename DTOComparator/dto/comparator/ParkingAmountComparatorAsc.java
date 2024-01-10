package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Parking;
import com.xworkz.practice.dto.RefillDTO;

import java.util.Comparator;

public class ParkingAmountComparatorAsc implements Comparator<Parking>

    {

        @Override
        public int compare(Parking o1, Parking o2) {
        return Integer.compare(o1.getAmount(), o2.getAmount());
    }

    }


