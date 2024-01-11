package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.WaterPurifierDTO;

import java.util.Comparator;

public class WaterPurifierCostComparatorAsc implements Comparator<WaterPurifierDTO> {
@Override
public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return Double.compare(o1.getCost(),o2.getCost());
        }


}
