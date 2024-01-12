package com.xworkz.practice.lambda;

   import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    public class VentilatorRunner {
        public static void main(String[] args) {

            VentilatorDTO ventilatorDTO=new VentilatorDTO("philips",2,"yes",120 );
            VentilatorDTO ventilatorDTO1=new VentilatorDTO("drager",5, "no",80);
            VentilatorDTO ventilatorDTO2=new VentilatorDTO("hamilton",20, "yes",60);
            VentilatorDTO ventilatorDTO3=new VentilatorDTO("havells",30,"no",100);
            VentilatorDTO ventilatorDTO4=new VentilatorDTO("agva",20,"yes",200);

            List<VentilatorDTO> list=new ArrayList<>();
            list.add(ventilatorDTO);
            list.add(ventilatorDTO1);
            list.add(ventilatorDTO2);
            list.add(ventilatorDTO3);
            list.add(ventilatorDTO4);
            System.out.println("ascending");
            Comparator<VentilatorDTO> ventilatorDTOComparatorBrandAsce=(o1,o2)->{
                return o1.getBrand().compareTo(o2.getBrand());
            };
            Collections.sort(list,ventilatorDTOComparatorBrandAsce);
            for (VentilatorDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("decending");
            Comparator<VentilatorDTO> ventilatorDTOComparatorBrandDesc=(o1,o2)->{
                return o2.getBrand().compareTo(o1.getBrand());
            };
            Collections.sort(list,ventilatorDTOComparatorBrandDesc);
            for (VentilatorDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("ascending");
            Comparator<VentilatorDTO> ventilatorDTOComparatorMaxAirflowAsce=(o1,o2)->{
                return Integer.compare( o1.getMaxAirflow(),o2.getMaxAirflow());
            };
            Collections.sort(list,ventilatorDTOComparatorMaxAirflowAsce);
            for (VentilatorDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("decending");
            Comparator<VentilatorDTO> ventilatorDTOComparatorMaxAirflowrDesc=(o1,o2)-> {
                return Integer.compare(o2.getMaxAirflow(), o1.getMaxAirflow());
            };
            Collections.sort(list,ventilatorDTOComparatorMaxAirflowrDesc);
            for (VentilatorDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("ascending");
            Comparator<VentilatorDTO> ventilatorDTOComparatorCostAsce=(o1,o2)->{
                return Integer.compare(o1.getCost(),o2.getCost());
            };
            Collections.sort(list,ventilatorDTOComparatorCostAsce);
            for (VentilatorDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("decending");
            Comparator<VentilatorDTO> ventilatorDTOComparatorCostDesc=(o1,o2)->{
                return Integer.compare(o2.getCost(),o1.getCost());
            };
            Collections.sort(list,ventilatorDTOComparatorCostDesc);
            for (VentilatorDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("ascending");
            Comparator<VentilatorDTO> ventilatorDTOComparatorPortableAsce=(o1,o2)->{
            return o1.getPortable().compareTo(o2.getPortable());
            };
          
            Collections.sort(list,ventilatorDTOComparatorPortableAsce);
            for (VentilatorDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("decending");
            Comparator<VentilatorDTO> ventilatorDTOComparatorPortableDesc=(o1,o2)->{
                return o2.getPortable().compareTo(o1.getPortable());
            };
            Collections.sort(list,ventilatorDTOComparatorPortableDesc);
            for (VentilatorDTO dto:list){
                System.out.println(dto);
            }
        }
    }

