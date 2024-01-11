package com.xworkz.practice.dto;

import com.xworkz.practice.dto.comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SparkPlugRunner {
    public static void main(String[] args) {
        SparkPlug sparkplug=new SparkPlug("copper",10,2.5,100);
        SparkPlug sparkplug1=new SparkPlug("iridium",20,1.5,200);
        SparkPlug sparkplug2=new SparkPlug("platinum",15,3.5,255);
        SparkPlug sparkplug3=new SparkPlug("ngk",1,4.5,150);
        SparkPlug sparkplug4=new SparkPlug("autolite",7,1.5,90);
        List<SparkPlug> list = new ArrayList<>();

        list.add(sparkplug);
        list.add(sparkplug1);
        list.add(sparkplug2);
        list.add(sparkplug3);
        list.add(sparkplug4);

        for (SparkPlug dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order");
        Comparator<SparkPlug> comparator = new SparkPlugModelComparatorAsc();
        Collections.sort(list, comparator);
        for(SparkPlug dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order");
        Comparator<SparkPlug> comparator1 = new SparkPlugModelComparatorDesc();
        Collections.sort(list, comparator1);
        for(SparkPlug dto : list) {
            System.out.println(dto);

        }
        System.out.println("ascending order");
        Comparator<SparkPlug> comparator2 = new SparkPlugPriceComparatorAsc();
        Collections.sort(list, comparator2);
        for(SparkPlug dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order");
        Comparator<SparkPlug> comparator3 = new SparkPlugPriceComparatorDesc();
        Collections.sort(list, comparator3);
        for(SparkPlug dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order");
        Comparator<SparkPlug> comparator4 = new SparkPlugSizeComparatorAsc();
        Collections.sort(list, comparator4);
        for(SparkPlug dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order");
        Comparator<SparkPlug> comparator5 = new SparkPlugSizeComparatorDesc();
        Collections.sort(list, comparator5);
        for(SparkPlug dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order");
        Comparator<SparkPlug> comparator6= new SparkPlugSerialNumberComparatorAsc();
        Collections.sort(list, comparator6);
        for(SparkPlug dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order");
        Comparator<SparkPlug> comparator7 = new SparkPlugSerialNumberComparatorAsc();
        Collections.sort(list, comparator7);
        for(SparkPlug dto : list) {
            System.out.println(dto);
        }



    }
}
