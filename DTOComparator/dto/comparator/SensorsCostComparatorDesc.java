package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.Sensors;

import java.util.Comparator;

    public class SensorsCostComparatorDesc implements Comparator<Sensors> {


        @Override
        public int compare(Sensors o1, Sensors o2) {
            int cost=o1.getCost();
            int cost1=o2.getCost();
            return Integer.compare(cost1, cost);
        }

    }
