package com.xworkz.practice.dto;

import com.xworkz.practice.dto.comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SensorRunner {
    public static void main(String[] args) {
        Sensors sensors = new Sensors("Ultrasonic", "scanning", 1000, 2);
        Sensors sensors1 = new Sensors("color sensor", "light sensors", 600, 6);
        Sensors sensors2 = new Sensors("sound sensor", "hall sensor", 400, 2);
        Sensors sensors3 = new Sensors("electrical sensors", "temperature", 500, 9);
        Sensors sensors4 = new Sensors("gyroscope", "level sensors", 700, 3);

        List<Sensors> list = new ArrayList<>();
        list.add(sensors);
        list.add(sensors1);
        list.add(sensors2);
        list.add(sensors3);
        list.add(sensors4);

        for (Sensors ref : list) {
            System.out.println(ref);

        }
        Comparator comparator = new SensorsCostComparatorAsc();
        Collections.sort(list, comparator);
        System.out.println("=================");
        System.out.println("ascending order of cost");
        System.out.println("=================");
        for (Sensors ref1 : list) {
            System.out.println(ref1);
        }
        Comparator comparator1 = new SensorsCostComparatorDesc();
        Collections.sort(list, comparator1);
        System.out.println("=================");
        System.out.println("descending order of cost");
        System.out.println("=================");
        for (Sensors ref2 : list) {
            System.out.println(ref2);

        }
        Comparator comparator2 = new SensorsTypeComparatorAsc();
        Collections.sort(list, comparator2);
        System.out.println("=================");
        System.out.println("ascending order");
        System.out.println("=================");
        for (Sensors ref3 : list) {
            System.out.println(ref3);
        }
        Comparator comparator3 = new SensorsTypeComparatorDesc();
        Collections.sort(list, comparator3);
        System.out.println("=================");
        System.out.println("decending order");
        System.out.println("=================");
        for (Sensors ref3 : list) {
            System.out.println(ref3);


        }
        Comparator comparator4 = new SensorsNameComparatorAsc();
        Collections.sort(list, comparator4);
        System.out.println("=================");
        System.out.println("ascending order");
        System.out.println("=================");
        for (Sensors ref3 : list) {
            System.out.println(ref3);
        }
        Comparator comparator5 = new SensorsNameComparatorDesc();
        Collections.sort(list, comparator5);
        System.out.println("=================");
        System.out.println("decending order");
        System.out.println("=================");
        for (Sensors ref3 : list) {
            System.out.println(ref3);
        }
        Comparator comparator6 = new SensorsDistanceComparatorAsc();
        Collections.sort(list, comparator6);
        System.out.println("=================");
        System.out.println("ascending order");
        System.out.println("=================");
        for (Sensors ref3 : list) {
            System.out.println(ref3);
        }
        Comparator comparator7 = new SensorsDistanceComparatorDesc();
        Collections.sort(list, comparator7);
        System.out.println("=================");
        System.out.println("decending order");
        System.out.println("=================");
        for (Sensors ref3 : list) {
            System.out.println(ref3);
        }
    }
}

