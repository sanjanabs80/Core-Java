package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Belt;

import java.util.Comparator;

public class BeltPriceComparatorDesc implements Comparator<Belt> {

    @Override
    public int compare(Belt o1, Belt o2)

    {
        return Integer.compare(o2.getPrice(), o1.getPrice());
    }



}
