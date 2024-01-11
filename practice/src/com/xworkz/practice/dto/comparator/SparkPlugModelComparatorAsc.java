package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.SparkPlug;

import java.util.Comparator;

public class SparkPlugModelComparatorAsc implements Comparator<SparkPlug>

    {

@Override
public int compare(SparkPlug o1, SparkPlug o2) {
        return o1.getModel().compareTo(o2.getModel());
        }


}
