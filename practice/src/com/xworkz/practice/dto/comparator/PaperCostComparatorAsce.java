package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Paper;

import java.util.Comparator;

public class PaperCostComparatorAsce  implements Comparator<Paper> {

    @Override
    public int compare(Paper o1, Paper o2)

    {

        return Double.compare(o1.getCost(), o2.getCost());
    }
}

