package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.SparkPlug;

import java.util.Comparator;

public class SparkPlugPriceComparatorDesc implements Comparator<SparkPlug>

{

    @Override
    public int compare(SparkPlug o1, SparkPlug o2) {
        return Integer.compare(o2.getPrice(),o1.getPrice());
    }




}
