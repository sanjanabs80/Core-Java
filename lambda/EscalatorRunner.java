package com.xworkz.practice.lambda;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    public class EscalatorRunner {
        public static void main(String[] args) {

            EscalatorDTO escalatorDTO=new EscalatorDTO("citycenter",true,"up",20);
            EscalatorDTO escalatorDTO1=new EscalatorDTO("forum mall",true,"down",10);
            EscalatorDTO escalatorDTO2=new EscalatorDTO("metro",true,"ground",5);
            EscalatorDTO escalatorDTO3=new EscalatorDTO("hospital",true,"1st floor",15);
            EscalatorDTO escalatorDTO4=new EscalatorDTO("vega city",true,"second floor",25);

            List<EscalatorDTO> list=new ArrayList<>();
            list.add(escalatorDTO);
            list.add(escalatorDTO1);
            list.add(escalatorDTO2);
            list.add(escalatorDTO3);
            list.add(escalatorDTO4);

            System.out.println("Ascending ");
            Comparator<EscalatorDTO> escalatorDTOComparatorPlaceAsce=(o1,o2)->{
                return o1.getPlace().compareTo(o2.getPlace());
            };
            Collections.sort(list,escalatorDTOComparatorPlaceAsce);
            for (EscalatorDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("Descending  ");
            Comparator<EscalatorDTO> escalatorDTOComparatorPlaceDesc=(o1,o2)->{
                return o1.getPlace().compareTo(o2.getPlace());
            };
            Collections.sort(list,escalatorDTOComparatorPlaceDesc);
            for (EscalatorDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("Ascending ");
            Comparator<EscalatorDTO> escalatorDTOComparatorElectricAsce=(o1,o2)->{
                return Boolean.compare(o1.isElectric(),o2.isElectric());
            };
            Collections.sort(list,escalatorDTOComparatorElectricAsce);
            for (EscalatorDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("Descending ");
            Comparator<EscalatorDTO> escalatorDTOComparatorElectricDesc=(o1,o2)->{
                return Boolean.compare(o2.isElectric(),o1.isElectric());
            };
            Collections.sort(list,escalatorDTOComparatorElectricDesc);
            for (EscalatorDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("Ascending ");
            Comparator<EscalatorDTO> escalatorDTOComparatorDirectionAsce=(o1,o2)->{
                return o1.getDirection().compareTo(o2.getDirection());
            };
            Collections.sort(list,escalatorDTOComparatorDirectionAsce);
            for (EscalatorDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("Descending ");
            Comparator<EscalatorDTO> escalatorDTOComparatorDirectionDesc=(o1,o2)->{
                return o2.getDirection().compareTo(o1.getDirection());
            };
            Collections.sort(list,escalatorDTOComparatorDirectionDesc);
            for (EscalatorDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("Ascending ");
            Comparator<EscalatorDTO> escalatorDTOComparatorCapacityAsce=(o1,o2)->{
                return Integer.compare(o1.getCapacity(),o2.getCapacity());
            };
            Collections.sort(list,escalatorDTOComparatorCapacityAsce);
            for (EscalatorDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("Descending ");
            Comparator<EscalatorDTO> escalatorDTOComparatorCapacityDesc=(o1,o2)->{
                return Integer.compare(o2.getCapacity(),o1.getCapacity());
            };
            Collections.sort(list,escalatorDTOComparatorCapacityDesc);
            for (EscalatorDTO dto:list){
                System.out.println(dto);
            }


        }
    }

