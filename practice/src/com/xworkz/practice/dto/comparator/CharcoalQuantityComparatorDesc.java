package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Charcoal;

import java.util.Comparator;

public class CharcoalQuantityComparatorDesc implements Comparator<Charcoal> {

    @Override
    public int compare(Charcoal o1, Charcoal o2)

    {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }


}
