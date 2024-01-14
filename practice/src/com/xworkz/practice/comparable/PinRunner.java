package com.xworkz.practice.comparable;


    import com.xworkz.practice.comparable.dto.PinDTO;

    import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class PinRunner {
        public static void main(String[] args) {

            PinDTO pinDTO = new PinDTO("dressmaker pin", "silver", 10);
            PinDTO pinDTO1 = new PinDTO("pleating pins", "gold", 15);
            PinDTO pinDTO2 = new PinDTO("sewing pin", "purple", 5);
            PinDTO pinDTO3 = new PinDTO("brooch", "gold", 20);
            PinDTO pinDTO4 = new PinDTO("safety pin", "silver", 10);

            List<PinDTO> list = new ArrayList<>();
            list.add(pinDTO);
            list.add(pinDTO1);
            list.add(pinDTO2);
            list.add(pinDTO3);
            list.add(pinDTO4);

            Collections.sort(list);
            for (PinDTO dto : list) {
                System.out.println(dto);
            }
        }

        }
