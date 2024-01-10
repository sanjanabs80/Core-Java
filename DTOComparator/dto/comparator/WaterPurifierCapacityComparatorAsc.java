package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.WaterPurifierDTO;

import java.util.Comparator;

public class WaterPurifierCapacityComparatorAsc implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return Integer.compare(o1.getCapacity(),o2.getCapacity());
    }

}
