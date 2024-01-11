package com.xworkz.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VegetableRunner {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("cabbage");
        list.add("radishes");
        list.add("mangolia");
        list.add("cucumber");
        list.add("cauliflower");
        list.add("onion");
        list.add("spinach");
        list.add("potato");
        list.add("pumpkin");
        list.add("mushroom");
        Collections.sort(list);
        System.out.println("Ascending order");
        System.out.println("====================");
        for(String ref: list){
            System.out.println(ref);
        }

        Comparator comparator=new VegetableComparator();
        Collections.sort(list,comparator);
        System.out.println("=================");
        System.out.println("Descending order");
        System.out.println("=================");
        for(String ref: list){
            System.out.println(ref);
        }

    }
}



