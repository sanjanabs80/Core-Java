package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.RefillDTO;

import java.util.Comparator;

public class RefillQuantityComparatorAsc implements Comparator<RefillDTO> {

    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Integer.compare(o1.getQuantity(), o2.getQuantity());
    }

}
