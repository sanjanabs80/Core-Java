package com.xworkz.practice.lambda;


    import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    public class TelescopeRunner {
        public static void main(String[] args) {

            TelescopeDTO telescopeDTO=new TelescopeDTO("hershel space","black",10.5,2100);
            TelescopeDTO telescopeDTO1=new TelescopeDTO("james webb space","white",20.6,1800);
            TelescopeDTO telescopeDTO2=new TelescopeDTO("large binocular","brown",15.2,3000);
            TelescopeDTO telescopeDTO3=new TelescopeDTO("nasmyth","blue",22.5,1200);
            TelescopeDTO telescopeDTO4=new TelescopeDTO("chandra","violet",30.2,3200);

            List<TelescopeDTO> list=new ArrayList<>();
            list.add(telescopeDTO);
            list.add(telescopeDTO1);
            list.add(telescopeDTO2);
            list.add(telescopeDTO3);
            list.add(telescopeDTO4);
            System.out.println("ascending");
            Comparator<TelescopeDTO> telescopeDTOComparatorLengthAcse=(o1,o2)->{
                return Double.compare(o1.getLength(),o2.getLength());
            };
            Collections.sort(list,telescopeDTOComparatorLengthAcse);
            for(TelescopeDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("decending");
            Comparator<TelescopeDTO> telescopeDTOComparatorLengthDesc=(o1,o2)->{
                return Double.compare(o2.getLength(),o1.getLength());
            };
            Collections.sort(list,telescopeDTOComparatorLengthDesc);
            for(TelescopeDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("ascending");
            Comparator<TelescopeDTO> telescopeDTOComparatorNameAcse=(o1,o2)->{
                return o1.getName().compareTo(o2.getName());
            };
            Collections.sort(list,telescopeDTOComparatorNameAcse);
            for(TelescopeDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("decending");
            Comparator<TelescopeDTO> telescopeDTOComparatorNameDesc=(o1,o2)->{
                return o2.getName().compareTo(o1.getName());
            };
            Collections.sort(list,telescopeDTOComparatorNameDesc);
            for(TelescopeDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("ascending");
            Comparator<TelescopeDTO> telescopeDTOComparatorColorAsc=(o1,o2)->{
                return o1.getColor().compareTo(o2.getColor());
            };
            Collections.sort(list,telescopeDTOComparatorColorAsc);
            for(TelescopeDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("decending");
            Comparator<TelescopeDTO> telescopeDTOComparatorColorDesc=(o1,o2)->{
                return o2.getColor().compareTo(o1.getColor());
            };
            Collections.sort(list,telescopeDTOComparatorColorDesc);
            for(TelescopeDTO dto:list){
                System.out.println(dto);
            }
            System.out.println("ascending");
            Comparator<TelescopeDTO> telescopeDTOComparatorDistanceAcse=(o1,o2)->{
                return Double.compare(o1.getDistance(),o2.getDistance());
            };
            Collections.sort(list,telescopeDTOComparatorDistanceAcse);
            for(TelescopeDTO dto:list){
                System.out.println(dto);
            }

            System.out.println("decending");
            Comparator<TelescopeDTO> telescopeDTOComparatorDistanceDesc=(o1,o2)->{
                return Double.compare(o2.getDistance(),o1.getDistance());
            };
            Collections.sort(list,telescopeDTOComparatorDistanceDesc);
            for(TelescopeDTO dto:list){
                System.out.println(dto);
            }

        }
    }

