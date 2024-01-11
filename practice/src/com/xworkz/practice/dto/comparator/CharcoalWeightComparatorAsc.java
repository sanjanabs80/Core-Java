package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Charcoal;

import java.util.Comparator;

public class CharcoalWeightComparatorAsc implements Comparator<Charcoal> {

    @Override
    public int compare(Charcoal o1, Charcoal o2)

    {
        return Double.compare(o1.getWeight(), o2.getWeight());
    }



}
