package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Cover;
import com.xworkz.practice.dto.RefillDTO;

import java.util.Comparator;

public class CoverColorComparatorAsc implements Comparator<Cover> {

    @Override
    public int compare(Cover o1, Cover o2) {
        return o1.getColor().compareTo(o2.getColor());
    }


}
