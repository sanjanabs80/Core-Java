package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Charcoal;

import java.util.Comparator;

public class CharcoalWeightComparatorDesc implements Comparator<Charcoal>

    {

        @Override
        public int compare(Charcoal o1, Charcoal o2)

        {
            return Double.compare(o2.getWeight(), o1.getWeight());
        }



    }

