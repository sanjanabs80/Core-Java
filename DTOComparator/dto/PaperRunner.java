package com.xworkz.practice.dto;

import com.xworkz.practice.dto.comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PaperRunner {
    public static void main(String[] args) {

        Paper paperDTO=new Paper("sheets",4,15,"orange");
        Paper paperDTO1=new Paper("a4",6,9,"white");
        Paper paperDTO2=new Paper("drawing sheet",7,10,"yellow");
        Paper paperDTO3=new Paper("buff",4,10,"light green");
        Paper paperDTO4=new Paper("thin paper",8,5,"black");

        List<Paper> list=new ArrayList<>();
        list.add(paperDTO);
        list.add(paperDTO1);
        list.add(paperDTO2);
        list.add(paperDTO3);
        list.add(paperDTO4);

        for(Paper dto:list){
            System.out.println(dto);
        }
        System.out.println("ascending order of cost");
        Comparator<Paper> comparator=new PaperCostComparatorAsce();
        Collections.sort(list,comparator);
        for(Paper dto:list){
            System.out.println(dto);
        }
        System.out.println("descending order of cost");
        Comparator<Paper> comparator1=new PaperCostComparatorDesc();
        Collections.sort(list,comparator1);
        for(Paper dto:list){
            System.out.println(dto);
        }
        System.out.println("ascending order of type");
        Comparator<Paper> comparator2=new PaperTypeComapratorAsce();
        Collections.sort(list,comparator2);
        for(Paper dto:list){
            System.out.println(dto);
        }

        System.out.println("Descending order of type");
        Comparator<Paper> comparator3=new PaperTypeComparatorDesc();
        Collections.sort(list,comparator3);
        for(Paper dto:list){
            System.out.println(dto);
        }

        System.out.println("Ascending order of size");
        Comparator<Paper> comparator4=new PaperSizeComparatorAsec();
        Collections.sort(list,comparator4);
        for(Paper dto:list){
            System.out.println(dto);
        }

        System.out.println("Descending order of size");
        Comparator<Paper> comparator5=new PaperSizeComparatorDesc();
        Collections.sort(list,comparator5);
        for(Paper dto:list){
            System.out.println(dto);
        }

        System.out.println("Ascending order of Color");
        Comparator<Paper> comparator6=new PaperColorComparatorAsce();
        Collections.sort(list,comparator6);
        for(Paper dto:list){
            System.out.println(dto);
        }

        System.out.println("Ascending order of Color");
        Comparator<Paper> comparator7=new PaperColorComparatorDesc();
        Collections.sort(list,comparator7);
        for(Paper dto:list){
            System.out.println(dto);
        }

    }
}

