package com.xworkz.practice.dto;

import com.xworkz.practice.dto.comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CoverRunner {
    public static void main(String[] args) {
        Cover cover=new Cover("black",10,2,"small");
        Cover cover1=new Cover("white",20,3,"big");
        Cover cover2=new Cover("yellow",8,5,"medium");
        Cover cover3=new Cover("blue",25,1,"small");
        Cover cover4=new Cover("pink",5,4,"big");

        List<Cover> list=new ArrayList<>();
        list.add(cover);
        list.add(cover1);
        list.add(cover2);
        list.add(cover3);
        list.add(cover4);
        for (Cover dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order");
        Comparator<Cover> comparator = new CoverColorComparatorAsc();
        Collections.sort(list, comparator);
        for (Cover dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order");
        Comparator<Cover> comparator1 = new CoverColorComparatorDesc();
        Collections.sort(list, comparator1);
        for (Cover dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order");
        Comparator<Cover> comparator2 = new CoverQuantityComparatorAsc();
        Collections.sort(list, comparator2);
        for (Cover dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order");
        Comparator<Cover> comparator3 = new CoverQuantityComparatorDesc();
        Collections.sort(list, comparator3);
        for (Cover dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order");
        Comparator<Cover> comparator4 = new CoverSizeComparatorAsc();
        Collections.sort(list, comparator4);
        for (Cover dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order");
        Comparator<Cover> comparator5 = new CoverSizeComparatorDesc();
        Collections.sort(list, comparator5);
        for (Cover dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order");
        Comparator<Cover> comparator6 = new CoverTypeComparatorAsc();
        Collections.sort(list, comparator6);
        for (Cover dto : list) {
            System.out.println(dto);

        }
        System.out.println("decending order");
        Comparator<Cover> comparator7 = new CoverTypeComparatorDesc();
        Collections.sort(list, comparator7);
        for (Cover dto : list) {
            System.out.println(dto);
        }

    }
}
