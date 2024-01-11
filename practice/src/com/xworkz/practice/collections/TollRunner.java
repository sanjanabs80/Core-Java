package com.xworkz.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TollRunner {
    public static void main(String[] args) {

        List<Double> list=new ArrayList<>();
        list.add(450d);
        list.add(250d);
        list.add(380d);
        list.add(500d);
        list.add(550d);
        list.add(625d);
        list.add(120d);
        list.add(220d);
        list.add(80d);
        list.add(750d);
        Collections.sort(list);
        System.out.println("Ascending order");
        System.out.println("====================");
        for(Double ref: list){
            System.out.println(ref);
        }

        Comparator comparator=new TollComparator();
        Collections.sort(list,comparator);
        System.out.println("=================");
        System.out.println("Descending order");
        System.out.println("=================");
        for(Double ref: list){
            System.out.println(ref);
        }

    }
}





