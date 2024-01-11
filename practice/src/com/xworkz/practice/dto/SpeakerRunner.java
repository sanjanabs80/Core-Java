package com.xworkz.practice.dto;

import com.xworkz.practice.dto.comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SpeakerRunner  {
    public static void main(String[] args) {

    SpeakerDTO speakerDTO=new SpeakerDTO("Boat",2,699,true);
    SpeakerDTO speakerDTO1=new SpeakerDTO("ferons",1,599,false);
    SpeakerDTO speakerDTO2=new SpeakerDTO("jbl",2,499,true);
    SpeakerDTO speakerDTO3=new SpeakerDTO("bose",1,1499,false);
    SpeakerDTO speakerDTO4=new SpeakerDTO("tribit",0,299,false);

    List<SpeakerDTO> list=new ArrayList<>();
    list.add(speakerDTO);
    list.add(speakerDTO1);
    list.add(speakerDTO2);
    list.add(speakerDTO3);
    list.add(speakerDTO4);

    for(SpeakerDTO dto:list){
        System.out.println(dto);
    }
    System.out.println("Ascending order in Bluetooth");
    Comparator<SpeakerDTO> comparator=new SpeakerBluetoothComparatorAsc();
    Collections.sort(list,comparator);
    for(SpeakerDTO dto:list){
        System.out.println(dto);
    }
    System.out.println("Descending order in Bluetooth");
    Comparator<SpeakerDTO> comparator1=new SpeakerBluetoothComparatorDesc();
    Collections.sort(list,comparator1);
    for(SpeakerDTO dto:list){
        System.out.println(dto);
    }
    System.out.println("Ascending order in Name");
    Comparator<SpeakerDTO> comparator2=new SpeakerNameComparatorAsc();
    Collections.sort(list,comparator2);
    for(SpeakerDTO dto:list){
        System.out.println(dto);
    }
    System.out.println("Descending order in Name");
    Comparator<SpeakerDTO> comparator3=new SpeakerNameComparatorDesc();
    Collections.sort(list,comparator3);
    for(SpeakerDTO dto:list){
        System.out.println(dto);
    }
    System.out.println("Ascending order in cost");
    Comparator<SpeakerDTO> comparator4=new SpeakerCostComparatorAsc();
    Collections.sort(list,comparator4);
    for(SpeakerDTO dto:list){
        System.out.println(dto);
    }
    System.out.println("Descending order in cost");
    Comparator<SpeakerDTO> comparator5=new SpeakerCostComparatorDesc();
    Collections.sort(list,comparator5);
    for(SpeakerDTO dto:list){
        System.out.println(dto);
    }
    System.out.println("Ascending order in warranty");
    Comparator<SpeakerDTO> comparator6=new SpeakerWarrantyComparatorAsc();
    Collections.sort(list,comparator6);
    for(SpeakerDTO dto:list){
        System.out.println(dto);
    }
    System.out.println("Descending order in warranty");
    Comparator<SpeakerDTO> comparator7=new SpeakerWarrantyComparatorDesc();
    Collections.sort(list,comparator7);
    for(SpeakerDTO dto:list){
        System.out.println(dto);
    }

}
}


