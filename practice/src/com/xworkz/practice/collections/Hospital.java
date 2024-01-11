package com.xworkz.practice.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Hospital {
    public static void main(String[] args) {

        Collection<String> hospital= new ArrayList<String>();
        hospital.add("Apollo");
        hospital.add("Max");
        hospital.add("Manipal");
        hospital.add("Marengo");
        hospital.add("Jayadeva");
        hospital.add("Fortis");
        hospital.add("Abhaya");
        hospital.add("narayana");
        hospital.add("victoria");
        hospital.add("Columbia");
        hospital.add("Ayurveda");
        hospital.add("Marigold");
        hospital.add("Sparsh");
        hospital.add("life care");
        hospital.add("Marvel");
        hospital.add("Gangotri");
        hospital.add("Mediscope");
        hospital.add("Suguna");
        hospital.add("Nu");
        hospital.add("BMS");
        Iterator<String> iterator=hospital.iterator();
        while(iterator.hasNext()){
            String ref= iterator.next();
            System.out.println("hospital name:"+ref);
            if(ref.endsWith("o")) {
                System.out.println("Hopsital  name ends with:" + ref);
                System.out.println("=====================================");
            }


        }
    }


}



