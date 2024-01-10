package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.SparkPlug;

import java.util.Comparator;

public class SparkPlugModelComparatorDesc implements Comparator<SparkPlug>

{

    @Override
    public int compare(SparkPlug o1, SparkPlug o2) {
        return o2.getModel().compareTo(o1.getModel());
    }



}
