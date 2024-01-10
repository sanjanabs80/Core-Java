package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.WaterPurifierDTO;

import java.util.Comparator;

public class WaterPurifierNameComparatorDesc implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return (o2.getName().compareTo(o1.getName()));
    }



}
