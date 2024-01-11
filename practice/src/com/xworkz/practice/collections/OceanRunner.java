package com.xworkz.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OceanRunner {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("southern ocean");
        list.add("pacific ocean");
        list.add("atlantic ocean");
        list.add("arctic ocean");
        list.add("indian ocean");
        list.add("arabian sea");
        list.add("baga beach");
        list.add("calangute beach");
        list.add("anjuna beach");
        list.add("colva beach");
        Collections.sort(list);
        System.out.println("Ascending order");
        System.out.println("====================");
        for(String ref: list){
            System.out.println(ref);
        }

        Comparator comparator=new OceanComparator();
        Collections.sort(list,comparator);
        System.out.println("=================");
        System.out.println("Descending order");
        System.out.println("=================");
        for(String ref: list){
            System.out.println(ref);
        }

    }
}

