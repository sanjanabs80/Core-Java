package com.xworkz.practice.dto;
import com.xworkz.practice.dto.comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class RefillRunner {
    public static void main(String[] args) {
        RefillDTO refill = new RefillDTO("cello", 5, 1, 4);
        RefillDTO refill1 = new RefillDTO("ball", 10, 2, 3);
        RefillDTO refill2 = new RefillDTO("doms", 50, 10, 2);
        RefillDTO refill3 = new RefillDTO("reynolds", 20, 20, 6);
        RefillDTO refill4 = new RefillDTO("gel", 25, 15, 7);
        List<RefillDTO> list = new ArrayList<>();
        list.add(refill);
        list.add(refill1);
        list.add(refill2);
        list.add(refill3);
        list.add(refill4);
        for (RefillDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order");
        Comparator<RefillDTO> comparator = new RefillNameComparatorAsc();
        Collections.sort(list, comparator);
        for (RefillDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order");
        Comparator<RefillDTO> comparator1 = new RefillNameComparatorDesc();
        Collections.sort(list, comparator1);
        for (RefillDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order");
        Comparator<RefillDTO> comparator2 = new RefillQuantityComparatorAsc();
        Collections.sort(list, comparator2);
        for (RefillDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order");
        Comparator<RefillDTO> comparator3 = new RefillQuantityComparatorAsc();
        Collections.sort(list, comparator3);
        for (RefillDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order");
        Comparator<RefillDTO> comparator4 = new RefillPriceComparatorAsc();
        Collections.sort(list, comparator4);
        for (RefillDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order");
        Comparator<RefillDTO> comparator5 = new RefillPriceComparatorAsc();
        Collections.sort(list, comparator5);
        for (RefillDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order");
        Comparator<RefillDTO> comparator6 = new RefillUsageDaysComparatorAsc();
        Collections.sort(list, comparator6);
        for (RefillDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order");
        Comparator<RefillDTO> comparator7 = new RefillUsageDaysComparatorAsc();
        Collections.sort(list, comparator7);
        for (RefillDTO dto : list) {
            System.out.println(dto);
        }
    }
}

