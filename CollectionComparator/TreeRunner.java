package com.xworkz.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TreeRunner {

        public static void main(String[] args) {

            List<Integer> list=new ArrayList<>();
            list.add(900);
            list.add(1000);
            list.add(200);
            list.add(100);
            list.add(80);
            list.add(1200);
            list.add(1500);
            list.add(2000);
            list.add(800);
            list.add(150);
            Collections.sort(list);
            System.out.println("Ascending order");
            System.out.println("====================");
            for(Integer ref: list){
                System.out.println(ref);
            }

            Comparator comparator=new TreeComparator();
            Collections.sort(list,comparator);
            System.out.println("=================");
            System.out.println("Descending order");
            System.out.println("=================");
            for(Integer ref: list){
                System.out.println(ref);
            }

        }
    }


