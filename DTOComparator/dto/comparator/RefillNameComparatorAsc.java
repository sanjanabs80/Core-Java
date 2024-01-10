package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.RefillDTO;

import java.util.Comparator;

public class RefillNameComparatorAsc implements Comparator<RefillDTO> {

    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
