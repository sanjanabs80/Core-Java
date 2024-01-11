package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Paper;

import java.util.Comparator;

public class PaperColorComparatorAsce implements Comparator<Paper> {

    @Override
    public int compare(Paper o1, Paper o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}

