package com.xworkz.practice;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RadioStation {
    public static void main(String[] args) {


        Collection<String> radioStation = new ArrayList<String>();
        radioStation.add("Big FM");
       radioStation.add("Radio Mirchi");


       Iterator<String> iterator=radioStation.iterator();
       while(iterator.hasNext()){
          String ref= iterator.next();
           System.out.println("radio station name:"+ref);
           System.out.println("============================");
           if(ref.endsWith("M")) {
               System.out.println("radio station name ends with:" + ref);
           }
           else{
               System.out.println("return false");

           }

           }
       }

    }
