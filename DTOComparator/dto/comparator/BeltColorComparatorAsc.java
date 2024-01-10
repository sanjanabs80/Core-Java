package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Belt;
import com.xworkz.practice.dto.Charcoal;

import java.util.Comparator;

public class BeltColorComparatorAsc implements Comparator<Belt> {

    @Override
    public int compare(Belt o1, Belt o2)

    {
        return o1.getColor().compareTo(o2.getColor());
    }



}
