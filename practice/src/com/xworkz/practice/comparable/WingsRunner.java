package com.xworkz.practice.comparable;

import com.xworkz.practice.comparable.dto.ToyDTO;
import com.xworkz.practice.comparable.dto.WingsDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WingsRunner {
    public static void main(String[] args) {
        WingsDTO wingsRunner=new WingsDTO("flying fish","blue");
        WingsDTO wingsRunner1=new WingsDTO("peacock","GREEN");
        WingsDTO wingsRunner2=new WingsDTO("bats","brown");
        WingsDTO wingsRunner3=new WingsDTO("butterfly","yellow");
        WingsDTO wingsRunner4=new WingsDTO("bee","brown");
         List<WingsDTO> list=new ArrayList<>();
         list.add(wingsRunner);
        list.add(wingsRunner1);
        list.add(wingsRunner2);
        list.add(wingsRunner3);
        list.add(wingsRunner4);

        Collections.sort(list);
        for(WingsDTO dto:list){
            System.out.println(dto);
        }


    }
}
