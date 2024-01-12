package com.xworkz.practice.lambda;


    import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    public class ThermometerRunner {

        public static void main(String[] args) {

            ThermometerDTO thermometerDTO=new ThermometerDTO("digital stick ",100,"white",80);
            ThermometerDTO thermometerDTO1=new ThermometerDTO("tympanic",200,"white",86);
            ThermometerDTO thermometerDTO2=new ThermometerDTO("infrared",500,"white",95);
            ThermometerDTO thermometerDTO3=new ThermometerDTO("strip type",1000,"white",101);
            ThermometerDTO thermometerDTO4=new ThermometerDTO("mercury",1200,"transparent",92);

            List<ThermometerDTO> list=new ArrayList<>();
            list.add(thermometerDTO);
            list.add(thermometerDTO1);
            list.add(thermometerDTO2);
            list.add(thermometerDTO3);
            list.add(thermometerDTO4);

            System.out.println("Ascending ");
            Comparator<ThermometerDTO> thermometerDTOComparatorCostAsce=(o1,o2)->{
                return Double.compare(o1.getCost(),o2.getCost());
            };
            Collections.sort(list,thermometerDTOComparatorCostAsce);
            for(ThermometerDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("Descending ");
            Comparator<ThermometerDTO> thermometerDTOComparatorCostDesc=(o1,o2)->{
                return Double.compare(o2.getCost(),o1.getCost());
            };
            Collections.sort(list,thermometerDTOComparatorCostDesc);
            for(ThermometerDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("Ascending ");
            Comparator<ThermometerDTO> thermometerDTOComparatorColorAsce=(o1,o2)->{
                return o1.getColor().compareTo(o2.getColor());
            };
            Collections.sort(list,thermometerDTOComparatorColorAsce);
            for(ThermometerDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("Descending ");
            Comparator<ThermometerDTO> thermometerDTOComparatorColorDesc=(o1,o2)->{
                return o2.getColor().compareTo(o1.getColor());
            };
            Collections.sort(list,thermometerDTOComparatorColorDesc);
            for(ThermometerDTO dto:list){
                System.out.println(dto);
            }

            System.out.println("Ascending by type");
            Comparator<ThermometerDTO> thermometerDTOComparatorNameAsce=(o1,o2)->{
                return o1.getName().compareTo(o2.getName());
            };
            Collections.sort(list,thermometerDTOComparatorNameAsce);
            for(ThermometerDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("Descending ");
            Comparator<ThermometerDTO> thermometerDTOComparatorNameDesc=(o1,o2)->{
                return o2.getName().compareTo(o1.getName());
            };
            Collections.sort(list,thermometerDTOComparatorNameDesc);
            for(ThermometerDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("Ascending by maxtemp");
            Comparator<ThermometerDTO> thermometerDTOComparatorMaxTempAsce=(o1,o2)->{
                return Integer.compare(o1.getMaxtemp(),o2.getMaxtemp());
            };
            Collections.sort(list,thermometerDTOComparatorMaxTempAsce);
            for(ThermometerDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("Descending by maxtemp");
            Comparator<ThermometerDTO> thermometerDTOComparatorMaxTempDesc=(o1,o2)->{
                return Integer.compare(o2.getMaxtemp(),o1.getMaxtemp());
            };
            Collections.sort(list,thermometerDTOComparatorMaxTempDesc);
            for(ThermometerDTO dto:list){
                System.out.println(dto);
            }



        }
    }

