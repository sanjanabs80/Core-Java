package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Cover;

import java.util.Comparator;

public class CoverSizeComparatorAsc implements Comparator<Cover> {

    @Override
    public int compare(Cover o1, Cover o2)

    {

        return o1.getSize().compareTo(o2.getSize());
    }


}
