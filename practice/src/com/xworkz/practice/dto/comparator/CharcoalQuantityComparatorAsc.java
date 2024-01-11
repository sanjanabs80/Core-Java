package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Charcoal;
import com.xworkz.practice.dto.Paper;

import java.util.Comparator;

public class CharcoalQuantityComparatorAsc implements Comparator<Charcoal> {

    @Override
    public int compare(Charcoal o1, Charcoal o2)

    {
        return Integer.compare(o1.getQuantity(), o2.getQuantity());
    }

}
