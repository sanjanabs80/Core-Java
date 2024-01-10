package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.RefillDTO;

import java.util.Comparator;

public class RefillUsageDaysComparatorDesc implements Comparator<RefillDTO> {

    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Integer.compare(o2.getUsageDays(), o1.getUsageDays());
    }

}
