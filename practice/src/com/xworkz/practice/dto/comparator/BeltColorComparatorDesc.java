package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Belt;

import java.util.Comparator;

public class BeltColorComparatorDesc implements Comparator<Belt> {

    @Override
    public int compare(Belt o1, Belt o2)

    {
        return o2.getColor().compareTo(o1.getColor());
    }




}
