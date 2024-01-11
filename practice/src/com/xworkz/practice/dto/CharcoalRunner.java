package com.xworkz.practice.dto;

import com.xworkz.practice.dto.comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CharcoalRunner {
    public static void main(String[] args) {
        Charcoal charcoal=new Charcoal("lump",4.5,3,2);
        Charcoal charcoal1=new Charcoal("hardwood",2.5,5,4);
        Charcoal charcoal2=new Charcoal("coconut shell",5.5,4,6);
        Charcoal charcoal3=new Charcoal("binchotan",3.2,6,8);
        Charcoal charcoal4=new Charcoal("briquettes",6.5,7,9);
        List<Charcoal> list=new ArrayList<>();
        list.add(charcoal);
        list.add(charcoal1);
        list.add(charcoal2);
        list.add(charcoal3);
        list.add(charcoal4);

        for (Charcoal dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order");
        Comparator<Charcoal> comparator = new CharcoalQuantityComparatorAsc();
        Collections.sort(list, comparator);
        for (Charcoal dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order");
        Comparator<Charcoal> comparator1 = new CharcoalQuantityComparatorDesc();
        Collections.sort(list, comparator1);
        for (Charcoal dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order");
        Comparator<Charcoal> comparator2 = new CharcoalWeightComparatorAsc();
        Collections.sort(list, comparator2);
        for (Charcoal dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order");
        Comparator<Charcoal> comparator3 = new CharcoalWeightComparatorDesc();
        Collections.sort(list, comparator3);
        for (Charcoal dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order");
        Comparator<Charcoal> comparator4 = new CharcoalTypeComparatorAsc();
        Collections.sort(list, comparator4);
        for (Charcoal dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order");
        Comparator<Charcoal> comparator5 = new CharcoalTypeComparatorDesc();
        Collections.sort(list, comparator5);
        for (Charcoal dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order");
        Comparator<Charcoal> comparator6 = new CharcoalSizeComparatorAsc();
        Collections.sort(list, comparator6);
        for (Charcoal dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order");
        Comparator<Charcoal> comparator7 = new CharcoalSizeComparatorDesc();
        Collections.sort(list, comparator7);
        for (Charcoal dto : list) {
            System.out.println(dto);
        }

    }
}
