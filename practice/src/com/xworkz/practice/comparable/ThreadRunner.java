package com.xworkz.practice.comparable;


    import com.xworkz.practice.comparable.dto.ThreadDTO;

    import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class ThreadRunner {
        public static void main(String[] args) {

            ThreadDTO threadDTO=new ThreadDTO("cotton","white",5);
            ThreadDTO threadDTO1=new ThreadDTO("nylon","black",7);
            ThreadDTO threadDTO2=new ThreadDTO("silk","blue",8);
            ThreadDTO threadDTO3=new ThreadDTO("ployester","pink",2);
            ThreadDTO threadDTO4=new ThreadDTO("rayon","light green",4);

            List<ThreadDTO> list=new ArrayList<>();
            list.add(threadDTO);
            list.add(threadDTO1);
            list.add(threadDTO2);
            list.add(threadDTO3);
            list.add(threadDTO4);

            Collections.sort(list);
            for(ThreadDTO dto:list){
                System.out.println(dto);
            }
        }
    }

