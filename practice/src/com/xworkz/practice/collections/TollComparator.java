package com.xworkz.practice.collections;

import java.util.Comparator;

public class TollComparator implements Comparator<Double> {

    @Override
    public int compare(Double o1, Double o2) {
        int no=o2.compareTo(o1);
        return no;
    }
}