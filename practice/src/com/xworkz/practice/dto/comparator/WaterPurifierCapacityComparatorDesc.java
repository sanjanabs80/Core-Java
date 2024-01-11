package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.WaterPurifierDTO;

import java.util.Comparator;

public class WaterPurifierCapacityComparatorDesc implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return Integer.compare(o2.getCapacity(),o1.getCapacity());
    }


}
