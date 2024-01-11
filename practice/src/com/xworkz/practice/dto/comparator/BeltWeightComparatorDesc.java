package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Belt;

import java.util.Comparator;

public class BeltWeightComparatorDesc implements Comparator<Belt> {

    @Override
    public int compare(Belt o1, Belt o2)

    {
        return Double.compare(o2.getWeight(), o1.getWeight());
    }



}
