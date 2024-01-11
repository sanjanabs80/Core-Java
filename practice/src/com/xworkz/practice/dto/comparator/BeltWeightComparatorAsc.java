package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Belt;

import java.util.Comparator;

public class BeltWeightComparatorAsc implements Comparator<Belt> {

    @Override
    public int compare(Belt o1, Belt o2)

    {
        return Double.compare(o1.getWeight(), o2.getWeight());
    }



}
