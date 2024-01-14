package com.xworkz.practice.comparable;


    import com.xworkz.practice.comparable.dto.ToyDTO;

    import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class ToyRunner {

        public static void main(String[] args) {

            ToyDTO toyDTO=new ToyDTO("bicycle","blue",3000d);
            ToyDTO toyDTO1=new ToyDTO("train","red",500d);
            ToyDTO toyDTO2=new ToyDTO("doll","pink",250d);
            ToyDTO toyDTO3=new ToyDTO("kite","violet",100d);
            ToyDTO toyDTO4=new ToyDTO("teddy bear","black",350d);

            List<ToyDTO> list=new ArrayList<>();
            list.add(toyDTO);
            list.add(toyDTO1);
            list.add(toyDTO2);
            list.add(toyDTO3);
            list.add(toyDTO4);

            Collections.sort(list);
            for(ToyDTO dto:list){
                System.out.println(dto);
            }
        }
    }

