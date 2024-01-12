package com.xworkz.practice.lambda;




import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    public class GeyserRunner {
        public static void main(String[] args) {

            GeyserDTO geyserDTO=new GeyserDTO("a.o.smith","grey",2099,8);
            GeyserDTO geyserDTO1=new GeyserDTO("bajaj","white",3099,5);
            GeyserDTO geyserDTO2=new GeyserDTO("Crompton","black",2599,10);
            GeyserDTO geyserDTO3=new GeyserDTO("lg","red",8599,12);
            GeyserDTO geyserDTO4=new GeyserDTO("havells","blue",6799,15);

            List<GeyserDTO> list=new ArrayList<>();
            list.add(geyserDTO);
            list.add(geyserDTO1);
            list.add(geyserDTO2);
            list.add(geyserDTO3);
            list.add(geyserDTO4);

            System.out.println("Ascending" );
            Comparator<GeyserDTO> geyserDTOComparatorNameAsce=(o1,o2)->{
                return o1.getName().compareTo(o2.getName());
            };
            Collections.sort(list,geyserDTOComparatorNameAsce);
            for(GeyserDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("Descendiong ");
            Comparator<GeyserDTO> geyserDTOComparatorBrandDesc=(o1,o2)->{
                return o2.getName().compareTo(o1.getName());
            };
            Collections.sort(list,geyserDTOComparatorBrandDesc);
            for(GeyserDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("Ascending ");
            Comparator<GeyserDTO> geyserDTOComparatorColorAsce=(o1,o2)->{
                return o1.getColor().compareTo(o2.getColor());
            };
            Collections.sort(list,geyserDTOComparatorColorAsce);
            for(GeyserDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("Descending ");
            Comparator<GeyserDTO> geyserDTOComparatorColorDesc=(o1,o2)->{
                return o1.getColor().compareTo(o2.getColor());
            };
            Collections.sort(list,geyserDTOComparatorColorDesc);
            for(GeyserDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("Ascending ");
            Comparator<GeyserDTO> geyserDTOComparatorCostAsce=(o1,o2)->{
                return Integer.compare(o1.getCost(),o2.getCost());
            };
            Collections.sort(list,geyserDTOComparatorCostAsce);
            for(GeyserDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("descending ");
            Comparator<GeyserDTO> geyserDTOComparatorCostDesc=(o1,o2)->{
                return Integer.compare(o1.getCost(),o1.getCost());
            };
            Collections.sort(list,geyserDTOComparatorCostDesc);
            for(GeyserDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("Ascending ");
            Comparator<GeyserDTO> geyserDTOComparatorCapacityAsce=(o1,o2)->{
                return Integer.compare(o1.getCapacity(),o2.getCapacity());
            };
            Collections.sort(list,geyserDTOComparatorCapacityAsce);
            for(GeyserDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("Descending ");
            Comparator<GeyserDTO> geyserDTOComparatorCapacityDesc=(o1,o2)->{
                return Integer.compare(o2.getCapacity(),o1.getCapacity());
            };
            Collections.sort(list,geyserDTOComparatorCapacityDesc);
            for(GeyserDTO dto:list){
                System.out.println(dto);
            }


        }
    }

