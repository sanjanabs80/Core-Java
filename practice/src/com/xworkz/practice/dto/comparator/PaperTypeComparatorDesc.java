package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Paper;

import java.util.Comparator;

public class PaperTypeComparatorDesc implements Comparator<Paper> {

    @Override
    public int compare(Paper o1, Paper o2) {
        return o2.getType().compareTo(o1.getType());
    }
}

