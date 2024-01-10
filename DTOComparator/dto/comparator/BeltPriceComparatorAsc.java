package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Belt;
import com.xworkz.practice.dto.Charcoal;

import java.util.Comparator;

public class BeltPriceComparatorAsc implements Comparator<Belt> {

    @Override
    public int compare(Belt o1, Belt o2)

    {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }


}

