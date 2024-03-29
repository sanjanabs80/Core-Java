package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.RefillDTO;

import java.util.Comparator;

public class RefillQuantityComparatorDesc implements Comparator<RefillDTO> {

    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
}
}

