package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Cover;

import java.util.Comparator;

public class CoverTypeComparatorDesc implements Comparator<Cover> {

    @Override
    public int compare(Cover o1, Cover o2)

    {

        return Integer.compare(o2.getType(), o1.getType());
    }



}
