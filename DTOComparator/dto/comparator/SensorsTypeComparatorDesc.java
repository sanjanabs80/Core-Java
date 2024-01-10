package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Sensors;

import java.util.Comparator;

public class SensorsTypeComparatorDesc implements Comparator<Sensors> {


    @Override
    public int compare(Sensors o1, Sensors o2) {
        String type = o1.getType();
        String type1 = o2.getType();
        return type1.compareTo(type);
    }

}
