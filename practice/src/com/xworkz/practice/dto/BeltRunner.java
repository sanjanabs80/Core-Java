package com.xworkz.practice.dto;

import com.xworkz.practice.dto.comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BeltRunner {
    public static void main(String[] args) {
        Belt belt=new Belt(100,2,10,"black");
        Belt belt1=new Belt(200,8,20,"brown");
        Belt belt2=new Belt(300,7,15,"grey");
        Belt belt3=new Belt(250,1,25,"black");
        Belt belt4=new Belt(150,3,12,"brown");

        List<Belt> list=new ArrayList<>();
        list.add(belt);
        list.add(belt1);
        list.add(belt2);
        list.add(belt3);
        list.add(belt4);
        for (Belt dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order");
        Comparator<Belt> comparator = new BeltColorComparatorAsc();
        Collections.sort(list, comparator);
        for (Belt dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order");
        Comparator<Belt> comparator1 = new BeltColorComparatorDesc();
        Collections.sort(list, comparator1);
        for (Belt dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order");
        Comparator<Belt> comparator2 = new BeltPriceComparatorAsc();
        Collections.sort(list, comparator2);
        for (Belt dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order");
        Comparator<Belt> comparator3 = new BeltPriceComparatorDesc();
        Collections.sort(list, comparator3);
        for (Belt dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order");
        Comparator<Belt> comparator4 = new BeltQuantityComparatorAsc();
        Collections.sort(list, comparator4);
        for (Belt dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order");
        Comparator<Belt> comparator5 = new BeltQuantityComparatorAsc();
        Collections.sort(list, comparator5);
        for (Belt dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order");
        Comparator<Belt> comparator6 = new BeltWeightComparatorAsc();
        Collections.sort(list, comparator6);
        for (Belt dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order");
        Comparator<Belt> comparator7 = new BeltWeightComparatorAsc();
        Collections.sort(list, comparator7);
        for (Belt dto : list) {
            System.out.println(dto);
        }


    }
}
