package com.xworkz.practice.lambda;


    import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    public class LiftRunner {
        public static void main(String[] args) {

            LiftDTO liftDTO = new LiftDTO(8, "railway", 1, true);
            LiftDTO liftDTO1 = new LiftDTO(10, "hospital", 4, true);
            LiftDTO liftDTO2 = new LiftDTO(5, "metro station", 2, false);
            LiftDTO liftDTO3 = new LiftDTO(9, "mall", 3, true);
            LiftDTO liftDTO4 = new LiftDTO(2, "pg", 6, false);

            List<LiftDTO> list = new ArrayList<>();
            list.add(liftDTO);
            list.add(liftDTO1);
            list.add(liftDTO2);
            list.add(liftDTO3);
            list.add(liftDTO4);

            System.out.println("Ascending ");
            Comparator<LiftDTO> liftDTOComparatorCapacityAsce = (o1, o2) -> {

                return Integer.compare(o1.getCapacity(), o2.getCapacity());
            };
            Collections.sort(list, liftDTOComparatorCapacityAsce);
            for (LiftDTO dto : list) {
                System.out.println(dto);
            }
            System.out.println("Descending ");
            Comparator<LiftDTO> liftDTOComparatorCapacityDesc = (o1, o2) -> {

                return Integer.compare(o2.getCapacity(), o1.getCapacity());
            };
            Collections.sort(list, liftDTOComparatorCapacityDesc);
            for (LiftDTO dto : list) {
                System.out.println(dto);
            }
            System.out.println("Ascending ");
            Comparator<LiftDTO> liftDTOComparatorPlaceAsce = (o1, o2) -> {

                return o1.getPlace().compareTo(o2.getPlace());
            };
            Collections.sort(list, liftDTOComparatorPlaceAsce);
            for (LiftDTO dto : list) {
                System.out.println(dto);
            }
            System.out.println("Descending ");
            Comparator<LiftDTO> liftDTOComparatorPlaceDesc = (o1, o2) -> {

                return o2.getPlace().compareTo(o1.getPlace());
            };
            Collections.sort(list, liftDTOComparatorPlaceDesc);
            for (LiftDTO dto : list) {
                System.out.println(dto);
            }
            System.out.println("Ascending ");
            Comparator<LiftDTO> liftDTOComparatorNoOfFloorsAsce = (o1, o2) -> {

                return Integer.compare(o1.getNoOfFloors(), o2.getNoOfFloors());
            };
            Collections.sort(list, liftDTOComparatorNoOfFloorsAsce);
            for (LiftDTO dto : list) {
                System.out.println(dto);
            }
            System.out.println("Descending ");
            Comparator<LiftDTO> liftDTOComparatorNoOfFloorsDesc = (o1, o2) -> {

                return Integer.compare(o2.getNoOfFloors(), o1.getNoOfFloors());
            };
            Collections.sort(list, liftDTOComparatorNoOfFloorsDesc);
            for (LiftDTO dto : list) {
                System.out.println(dto);
            }
            System.out.println("Ascending ");
            Comparator<LiftDTO> liftDTOComparatorDoubleDoorAsce = (o1, o2) -> {

                return Boolean.compare(o1.isDoubleDoor(), o2.isDoubleDoor());
            };
            Collections.sort(list, liftDTOComparatorDoubleDoorAsce);
            for (LiftDTO dto : list) {
                System.out.println(dto);
            }

            System.out.println("Descending");
            Comparator<LiftDTO> liftDTOComparatorDoubleDoorDesc = (o1, o2) -> {

                return Boolean.compare(o2.isDoubleDoor(), o1.isDoubleDoor());
            };
            Collections.sort(list, liftDTOComparatorDoubleDoorDesc);
            for (LiftDTO dto : list) {
                System.out.println(dto);
            }
        }

        }


