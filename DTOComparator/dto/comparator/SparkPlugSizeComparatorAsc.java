package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.SparkPlug;

import java.util.Comparator;

public class SparkPlugSizeComparatorAsc implements Comparator<SparkPlug>

{

    @Override
    public int compare(SparkPlug o1, SparkPlug o2) {
        return Double.compare(o1.getSize(),o2.getSize());
    }




}
