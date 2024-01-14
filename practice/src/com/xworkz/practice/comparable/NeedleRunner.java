package com.xworkz.practice.comparable;


    import com.xworkz.practice.comparable.dto.NeedleDTO;

    import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class NeedleRunner {
        public static void main(String[] args) {

            NeedleDTO needleDTO=new NeedleDTO("embroidery",10,5);
            NeedleDTO needleDTO1=new NeedleDTO("leather",6,10);
            NeedleDTO needleDTO2=new NeedleDTO("denim",5,15);
            NeedleDTO needleDTO3=new NeedleDTO("stretch",8,7);
            NeedleDTO needleDTO4=new NeedleDTO("steel",2,20);

            List<NeedleDTO> list=new ArrayList<>();
            list.add(needleDTO);
            list.add(needleDTO1);
            list.add(needleDTO2);
            list.add(needleDTO3);
            list.add(needleDTO4);

            Collections.sort(list);
            for (NeedleDTO dto:list){
                System.out.println(dto);
            }

        }
    }

