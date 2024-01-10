package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Charcoal;

import java.util.Comparator;

public class CharcoalTypeComparatorDesc implements Comparator<Charcoal> {

    @Override
    public int compare(Charcoal o1, Charcoal o2)

    {
        return o2.getType().compareTo(o1.getType());
    }



}
