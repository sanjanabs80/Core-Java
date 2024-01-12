package com.xworkz.practice.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class SkyWalkRunner {
    public static void main(String[] args) {

        SkyWalkDTO skyWalkDTO=new SkyWalkDTO("Glacier","Kormagala",43,100);
        SkyWalkDTO skyWalkDTO1=new SkyWalkDTO("tianmen mountain","madiwala",40,80);
        SkyWalkDTO skyWalkDTO2=new SkyWalkDTO("ngong ping","btm",86,40);
        SkyWalkDTO skyWalkDTO3=new SkyWalkDTO("East taihang glass walk","China",18,120);
        SkyWalkDTO skyWalkDTO4=new SkyWalkDTO("Zhangjiajie","czech",350,10);

        List<SkyWalkDTO> list=new ArrayList<>();
        list.add(skyWalkDTO);
        list.add(skyWalkDTO1);
        list.add(skyWalkDTO2);
        list.add(skyWalkDTO3);
        list.add(skyWalkDTO4);
        System.out.println("Ascending ");
        Comparator<SkyWalkDTO> skyWalkDTOComparatorAsce = (name1, name2) -> {
            return name1.getName().compareTo(name2.getName());
        };
        Collections.sort(list,skyWalkDTOComparatorAsce);
        for(SkyWalkDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending ");
        Comparator<SkyWalkDTO> skyWalkDTOComparatorDesc=(name1,name2)->{
            return name2.getName().compareTo(name1.getName());
        };
        Collections.sort(list,skyWalkDTOComparatorDesc);
        for(SkyWalkDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending ");
        Comparator<SkyWalkDTO> skyWalkDTOCollectionsPlaceAsce=(o1,o2)->{
            return o1.getPlace().compareTo(o2.getPlace());
        };
        Collections.sort(list,skyWalkDTOCollectionsPlaceAsce);
        for(SkyWalkDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending ");
        Comparator<SkyWalkDTO> skyWalkDTOCollectionsPlaceDesc=(o1,o2)->{
            return o2.getPlace().compareTo(o1.getPlace());
        };
        Collections.sort(list,skyWalkDTOCollectionsPlaceDesc);
        for(SkyWalkDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending");
        Comparator<SkyWalkDTO> skyWalkDTOCollectionsLengthAsce=(o1,o2)->{
            return Double.compare(o1.getLength(),o2.getLength());
        };
        Collections.sort(list,skyWalkDTOCollectionsLengthAsce);
        for(SkyWalkDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending");
        Comparator<SkyWalkDTO> skyWalkDTOCollectionsLengthDesc=(o1,o2)->{
            return Double.compare(o2.getLength(),o1.getLength());
        };
        Collections.sort(list,skyWalkDTOCollectionsLengthDesc);
        for(SkyWalkDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending ");
        Comparator<SkyWalkDTO> skyWalkDTOCollectionsCapacityAsce=(o1,o2)->{
            return Double.compare(o1.getCapacity(),o2.getCapacity());
        };
        Collections.sort(list,skyWalkDTOCollectionsCapacityAsce);
        for(SkyWalkDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending ");
        Comparator<SkyWalkDTO> skyWalkDTOCollectionsCapacityDesc=(o1,o2)->{
            return Double.compare(o2.getCapacity(),o1.getCapacity());
        };
        Collections.sort(list,skyWalkDTOCollectionsCapacityDesc);
        for(SkyWalkDTO dto:list){
            System.out.println(dto);
        }



    }
}

