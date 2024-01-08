package com.xworkz.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SeedsRunner {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("flax seeds");
        list.add("sunflower seeds");
        list.add("bean");
        list.add("peas");
        list.add("coffee");
        list.add("peanuts");
        list.add("corn seeds");
        list.add("pumpkin");
        list.add("cucumber seeds");
        list.add("wheat");
        Collections.sort(list);
        System.out.println("Ascending order");
        System.out.println("====================");
        for(String ref: list){
            System.out.println(ref);
        }

        Comparator comparator=new SeedsComparator();
        Collections.sort(list,comparator);
        System.out.println("=================");
        System.out.println("Descending order");
        System.out.println("=================");
        for(String ref: list){
            System.out.println(ref);
        }

    }
}





