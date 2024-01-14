package com.xworkz.practice.comparable;

import com.xworkz.practice.comparable.dto.RopeDTO;

import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;

public class RopeRunner {
    public static void main(String[] args) {

        RopeDTO ropeDTO=new RopeDTO(25d,"linen","brown");
        RopeDTO ropeDTO1=new RopeDTO(30d,"sisal","black");
        RopeDTO ropeDTO2=new RopeDTO(45d,"cotton","white");
        RopeDTO ropeDTO3=new RopeDTO(50d,"jute","blue");
        RopeDTO ropeDTO4=new RopeDTO(20d,"nylon","brown");

        List<RopeDTO> list=new ArrayList<>();
        list.add(ropeDTO);
        list.add(ropeDTO1);
        list.add(ropeDTO2);
        list.add(ropeDTO3);
        list.add(ropeDTO4);

        Collections.sort(list);
        for(RopeDTO dto:list){
            System.out.println(dto);
        }
    }

}
