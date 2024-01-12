package com.xworkz.practice.lambda;

import com.xworkz.practice.dto.RefillDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShipRunner  {
    public static void main(String[] args) {
        ShipDTO shipDTO=new ShipDTO("aircraft","container",20,"banglore");
        ShipDTO shipDTO1=new ShipDTO("battleship","tanker",10,"manglore");
        ShipDTO shipDTO2=new ShipDTO("corvette","bulk carrier",20,"goa");
        ShipDTO shipDTO3=new ShipDTO("frigate","passenger",25,"mysore");
        ShipDTO shipDTO4=new ShipDTO("ironclad","boat",15,"karkala");
          List<ShipDTO> list=new ArrayList<>();
          list.add(shipDTO);
        list.add(shipDTO1);
        list.add(shipDTO2);
        list.add(shipDTO3);
        list.add(shipDTO4);

        System.out.println("Ascending by name");
        Comparator<ShipDTO> shipDTOComparatorNameAsce=(o1,o2)->{
            return o1.getName().compareTo(o2.getName());
        };
        Collections.sort(list,shipDTOComparatorNameAsce);
        for(ShipDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descendong by name");
        Comparator<ShipDTO> shipDTOComparatorNameDesc=(o1,o2)->{
            return o2.getName().compareTo(o1.getName());
        };
        Collections.sort(list,shipDTOComparatorNameDesc);
        for(ShipDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending order");
        Comparator<ShipDTO> shipDTOComparatorCapacityAsce=(o1,o2)->{
            return Integer.compare(o1.getCapacity(),o2.getCapacity());
        };

        Collections.sort(list,shipDTOComparatorCapacityAsce);
        for(ShipDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending ");
        Comparator<ShipDTO> shipDTOComparatorCapacityDesc=(o1,o2)->{
            return Integer.compare(o2.getCapacity(),o1.getCapacity());
        };
        Collections.sort(list,shipDTOComparatorCapacityDesc);
        for(ShipDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by location");
        Comparator<ShipDTO> shipDTOComparatorLocationAsce=(o1,o2)->{
            return o1.getLocation().compareTo(o2.getLocation());
        };
        Collections.sort(list,shipDTOComparatorLocationAsce);
        for(ShipDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by location");
        Comparator<ShipDTO> shipDTOComparatorLocationDesc=(o1,o2)->{
            return o2.getLocation().compareTo(o1.getLocation());
        };
        Collections.sort(list,shipDTOComparatorLocationDesc);
        for(ShipDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by type");
        Comparator<ShipDTO> shipDTOComparatorTypeAsce=(o1,o2)->{
            return o1.getType().compareTo(o2.getType());
        };
        Collections.sort(list,shipDTOComparatorTypeAsce);
        for(ShipDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by type");
        Comparator<ShipDTO> shipDTOComparatorTypeDesc=(o1,o2)->{
            return o1.getType().compareTo(o2.getType());
        };
        Collections.sort(list,shipDTOComparatorTypeDesc);
        for(ShipDTO dto:list){
            System.out.println(dto);
        }
    }
}
