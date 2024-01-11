package com.xworkz.practice.dto;

import com.xworkz.practice.collections.Park;
import com.xworkz.practice.dto.comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ParkingRunner {
    public static void main(String[] args) {
        Parking parking = new Parking("quick park", 100, 50, "bike");
        Parking parking1 = new Parking("city park", 25, 90, "car");
        Parking parking2 = new Parking("park hub", 20, 60, "scooter");
        Parking parking3 = new Parking("park pro", 15, 100, "auto");
        Parking parking4 = new Parking("park solution", 18, 70, "cycle");

   List<Parking> list=new ArrayList<>();
          list.add(parking);
        list.add(parking1);
        list.add(parking2);
        list.add(parking3);
        list.add(parking4);

        for(Parking dto:list){
            System.out.println(dto);
        }
        System.out.println("ascending order ");
        Comparator<Parking> comparator=new ParkingCapacityComparatorAsc();
        Collections.sort(list,comparator);
        for(Parking dto:list){
            System.out.println(dto);
        }
        System.out.println("decending order ");
        Comparator<Parking> comparator1=new ParkingCapacityComparatorDesc();
        Collections.sort(list,comparator1);
        for(Parking dto:list){
            System.out.println(dto);
        }
        System.out.println("ascending order ");
        Comparator<Parking> comparator2=new ParkingNameComparatorAsc();
        Collections.sort(list,comparator2);
        for(Parking dto:list){
            System.out.println(dto);
        }
        System.out.println("decending order ");
        Comparator<Parking> comparator3=new ParkingNameComparatorDesc();
        Collections.sort(list,comparator3);
        for(Parking dto:list){
            System.out.println(dto);
        }
        System.out.println("ascending order ");
        Comparator<Parking> comparator4=new ParkingAmountComparatorAsc();
        Collections.sort(list,comparator4);
        for(Parking dto:list){
            System.out.println(dto);
        }
        System.out.println("decending order ");
        Comparator<Parking> comparator5=new ParkingAmountComparatorDesc();
        Collections.sort(list,comparator4);
        for(Parking dto:list){
            System.out.println(dto);
        }
        System.out.println("ascending order ");
        Comparator<Parking> comparator6=new ParkingVehicleTypeComparatorAsc();
        Collections.sort(list,comparator4);
        for(Parking dto:list){
            System.out.println(dto);
        }
        System.out.println("decending order ");
        Comparator<Parking> comparator7=new ParkingVehicleTypeComparatorDesc();
        Collections.sort(list,comparator7);
        for(Parking dto:list){
            System.out.println(dto);
        }



    }
}