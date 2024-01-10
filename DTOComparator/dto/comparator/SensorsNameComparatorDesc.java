package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Sensors;

import java.util.Comparator;

public class SensorsNameComparatorDesc implements Comparator<Sensors> {


    @Override
    public int compare(Sensors o1, Sensors o2) {
        String name = o1.getType();
        String name1 = o2.getType();
        return name1.compareTo(name);
    }

}

