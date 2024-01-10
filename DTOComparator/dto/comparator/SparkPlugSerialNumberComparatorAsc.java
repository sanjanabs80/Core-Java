package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.SparkPlug;

import java.util.Comparator;

public class SparkPlugSerialNumberComparatorAsc implements Comparator<SparkPlug>

{

    @Override
    public int compare(SparkPlug o1, SparkPlug o2) {
        return Integer.compare(o1.getSerialNumber(),o2.getSerialNumber());
    }




}
