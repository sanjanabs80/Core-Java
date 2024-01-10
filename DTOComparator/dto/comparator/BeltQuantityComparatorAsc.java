package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Belt;

import java.util.Comparator;

public class BeltQuantityComparatorAsc implements Comparator<Belt> {

    @Override
    public int compare(Belt o1, Belt o2)

    {
        return Integer.compare(o1.getQuantity(), o2.getQuantity());
    }



}
