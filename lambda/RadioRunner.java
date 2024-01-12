package com.xworkz.practice.lambda;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    public class RadioRunner {
        public static void main(String[] args) {

            RadioDTO radioDTO = new RadioDTO("samsung", "black", 2000, "shimoga");
            RadioDTO radioDTO1 = new RadioDTO("lg", "white", 3000, "banglore");
            RadioDTO radioDTO2 = new RadioDTO("onida", "grey", 1000, "mysore");
            RadioDTO radioDTO3 = new RadioDTO("sony", "brown", 2500, "hassan");
            RadioDTO radioDTO4 = new RadioDTO("philips", "black", 2200, "tumkur");

            List<RadioDTO> list = new ArrayList<>();
            list.add(radioDTO);
            list.add(radioDTO1);
            list.add(radioDTO2);
            list.add(radioDTO3);
            list.add(radioDTO4);

            System.out.println("Ascending ");
            Comparator<RadioDTO> radioDTOComparatorNameAsce = (o1, o2) -> {
                return o1.getName().compareTo(o2.getName());
            };
            Collections.sort(list, radioDTOComparatorNameAsce);
            for (RadioDTO dto : list) {
                System.out.println(dto);
            }
            System.out.println("Descending ");
            Comparator<RadioDTO> radioDTOComparatorNameDesc = (o1, o2) -> {
                return o2.getName().compareTo(o1.getName());
            };
            Collections.sort(list, radioDTOComparatorNameDesc);
            for (RadioDTO dto : list) {
                System.out.println(dto);
            }
            System.out.println("Ascending ");
            Comparator<RadioDTO> radioDTOComparatorColorAsce = (o1, o2) -> {
                return o1.getColor().compareTo(o2.getColor());
            };
            Collections.sort(list, radioDTOComparatorColorAsce);
            for (RadioDTO dto : list) {
                System.out.println(dto);
            }
            System.out.println("Descending ");
            Comparator<RadioDTO> radioDTOComparatorColorDesc = (o1, o2) -> {
                return o2.getColor().compareTo(o1.getColor());
            };
            Collections.sort(list, radioDTOComparatorColorDesc);
            for (RadioDTO dto : list) {
                System.out.println(dto);
            }
            System.out.println("Ascending ");
            Comparator<RadioDTO> radioDTOComparatorCostAsce = (o1, o2) -> {
                return Double.compare(o1.getCost(), o2.getCost());
            };
            Collections.sort(list, radioDTOComparatorCostAsce);
            for (RadioDTO dto : list) {
                System.out.println(dto);
            }
            System.out.println("Descending ");
            Comparator<RadioDTO> radioDTOComparatorCostDesc = (o1, o2) -> {
                return Double.compare(o2.getCost(), o1.getCost());
            };
            Collections.sort(list, radioDTOComparatorCostDesc);
            for (RadioDTO dto : list) {
                System.out.println(dto);
            }
            System.out.println("Ascending ");
            Comparator<RadioDTO> radioDTOComparatorLocationAsce = (o1, o2) -> {
                return o1.getLocation().compareTo(o2.getLocation());
            };
            Collections.sort(list, radioDTOComparatorLocationAsce);
            for (RadioDTO dto : list) {
                System.out.println(dto);
            }
            System.out.println("Descending ");
            Comparator<RadioDTO> radioDTOComparatorLocationDesc = (o1, o2) -> {
                return o2.getLocation().compareTo(o1.getLocation());
            };
            Collections.sort(list, radioDTOComparatorLocationDesc);
            for (RadioDTO dto : list) {
                System.out.println(dto);
            }


        }
    }



