package com.xworkz.practice.collections;

import java.util.Comparator;

public class TreeComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            int no=o2.compareTo(o1);
            return no;
        }
    }


