package com.xworkz.practice.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreetRunner {
    public static void main(String[] args) {

        StreetDTO streetDTO = new StreetDTO("jyothi nagar","shimoga","karnataka","india");
        StreetDTO streetDTO1 = new StreetDTO("mrs circle","mysore","karnataka","india");
        StreetDTO streetDTO2 = new StreetDTO("sagar road","tirthalli","Andhra","india");
        StreetDTO streetDTO3 = new StreetDTO("vijanagar","bdvt","karnataka","india");
        StreetDTO streetDTO4 = new StreetDTO("gandhi street","shimoga","karnataka","india");

        List<StreetDTO> list=new ArrayList<>();
        list.add(streetDTO);
        list.add(streetDTO1);
        list.add(streetDTO2);
        list.add(streetDTO3);
        list.add(streetDTO4);

        System.out.println("Ascending" );
        Comparator<StreetDTO> streetDTOComparatorNameAsce=(o1, o2)->{
            return o1.getName().compareTo(o2.getName());
        };
        Collections.sort(list,streetDTOComparatorNameAsce);
        for(StreetDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending ");
        Comparator<StreetDTO> streetDTOComparatorNameDesc=(o1,o2)->{
            return o2.getName().compareTo(o1.getName());
        };
        Collections.sort(list,streetDTOComparatorNameDesc);
        for(StreetDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending ");
        Comparator<StreetDTO> streetDTOComparatorCityAsce=(o1,o2)->{
            return o1.getCity().compareTo(o2.getCity());
        };
        Collections.sort(list,streetDTOComparatorCityAsce);
        for(StreetDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending ");
        Comparator<StreetDTO> streetDTOComparatorCityDesc=(o1,o2)->{
            return o2.getCity().compareTo(o1.getCity());
        };
        Collections.sort(list,streetDTOComparatorCityDesc);
        for(StreetDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending ");
        Comparator<StreetDTO> streetDTOComparatorStateAsce=(o1,o2)->{
            return o1.getState().compareTo(o2.getState());
        };
        Collections.sort(list,streetDTOComparatorStateAsce);
        for(StreetDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending ");
        Comparator<StreetDTO> streetDTOComparatorStateDesc=(o1,o2)->{
            return o2.getState().compareTo(o1.getState());
        };
        Collections.sort(list,streetDTOComparatorStateDesc);
        for(StreetDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending ");
        Comparator<StreetDTO> streetDTOComparatorCountryAsce=(o1,o2)->{
            return o1.getCountry().compareTo(o2.getCountry());
        };
        Collections.sort(list,streetDTOComparatorCountryAsce);
        for(StreetDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending");
        Comparator<StreetDTO> streetDTOComparatorCountryDesc=(o1,o2)->{
            return o2.getCountry().compareTo(o1.getCountry());
        };
        Collections.sort(list,streetDTOComparatorCountryDesc);
        for(StreetDTO dto:list){
            System.out.println(dto);
        }


    }
}

