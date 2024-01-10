package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.SparkPlug;

import java.util.Comparator;

public class SparkPlugSizeComparatorDesc implements Comparator<SparkPlug>

{

    @Override
    public int compare(SparkPlug o1, SparkPlug o2) {
        return Double.compare(o2.getSize(),o1.getSize());
    }





}
