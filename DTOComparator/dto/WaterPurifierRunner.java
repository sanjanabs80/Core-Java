package com.xworkz.practice.dto;

import com.xworkz.practice.dto.comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WaterPurifierRunner {
    public static void main(String[] args) {


        WaterPurifierDTO waterPurifierDTO = new WaterPurifierDTO("pureit", "black", 10000, 12);
        WaterPurifierDTO waterPurifierDTO1 = new WaterPurifierDTO("Aquaguard", "white", 20000, 15);
        WaterPurifierDTO waterPurifierDTO2 = new WaterPurifierDTO("Kent", "blue", 30000, 10);
        WaterPurifierDTO waterPurifierDTO3 = new WaterPurifierDTO("livpure", "silver", 40000, 13);
        WaterPurifierDTO waterPurifierDTO4 = new WaterPurifierDTO("Eureka", "black", 50000, 14);
        List<WaterPurifierDTO> list = new ArrayList<>();
        list.add(waterPurifierDTO);
        list.add(waterPurifierDTO1);
        list.add(waterPurifierDTO2);
        list.add(waterPurifierDTO3);
        list.add(waterPurifierDTO4);


        for (WaterPurifierDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order");
        Comparator<WaterPurifierDTO> comparator = new WaterPurifierNameComparatorAsc();
        Collections.sort(list, comparator);
        for (WaterPurifierDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order ");
        Comparator<WaterPurifierDTO> comparator1 = new WaterPurifierNameComparatorDesc();
        Collections.sort(list, comparator1);
        for (WaterPurifierDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order");
        Comparator<WaterPurifierDTO> comparator2 = new WaterPurifierCostComparatorAsc();
        Collections.sort(list, comparator2);
        for (WaterPurifierDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order");
        Comparator<WaterPurifierDTO> comparator3 = new WaterPurifierCostComparatorDesc();
        Collections.sort(list, comparator3);
        for (WaterPurifierDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order ");
        Comparator<WaterPurifierDTO> comparator4 = new WaterPurifierColorComparatorAsc();
        Collections.sort(list, comparator4);
        for (WaterPurifierDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order ");
        Comparator<WaterPurifierDTO> comparator5 = new WaterPurifierColorComparatorDesc();
        Collections.sort(list, comparator);
        for (WaterPurifierDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("ascending order ");
        Comparator<WaterPurifierDTO> comparator6 = new WaterPurifierCapacityComparatorAsc();
        Collections.sort(list, comparator6);
        for (WaterPurifierDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("decending order ");
        Comparator<WaterPurifierDTO> comparator7 = new WaterPurifierCapacityComparatorDesc();
        Collections.sort(list, comparator7);
        for (WaterPurifierDTO dto : list) {
            System.out.println(dto);
        }
    }
}