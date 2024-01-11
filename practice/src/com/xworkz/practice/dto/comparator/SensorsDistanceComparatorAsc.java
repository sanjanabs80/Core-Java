package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Sensors;

import java.util.Comparator;

public class SensorsDistanceComparatorAsc  implements Comparator<Sensors> {


    @Override
    public int compare(Sensors o1, Sensors o2) {
        int distance = o1.getDistance();
        int distance1 = o2.getDistance();
        return Integer.compare(distance,distance1);
    }


}

