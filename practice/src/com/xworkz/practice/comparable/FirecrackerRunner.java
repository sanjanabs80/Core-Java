package com.xworkz.practice.comparable;


    import com.xworkz.practice.comparable.dto.FirecrackerDTO;

    import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class FirecrackerRunner {
        public static void main(String[] args) {

            FirecrackerDTO fireCrackerDTO = new FirecrackerDTO("ground spinner", 250d, "golden");
            FirecrackerDTO fireCrackerDTO1 = new FirecrackerDTO("twinkiling stars", 35d, "pink");
            FirecrackerDTO fireCrackerDTO2 = new FirecrackerDTO("sparklers", 40d, "green");
            FirecrackerDTO fireCrackerDTO3 = new FirecrackerDTO("3d fireworks", 50d, "yellow");
            FirecrackerDTO fireCrackerDTO4 = new FirecrackerDTO("crackers", 100d, "blue");

            List<FirecrackerDTO> list = new ArrayList<>();
            list.add(fireCrackerDTO);
            list.add(fireCrackerDTO1);
            list.add(fireCrackerDTO2);
            list.add(fireCrackerDTO3);
            list.add(fireCrackerDTO4);

            Collections.sort(list);
            for (FirecrackerDTO dto : list) {
                System.out.println(dto);
            }
        }
    }

