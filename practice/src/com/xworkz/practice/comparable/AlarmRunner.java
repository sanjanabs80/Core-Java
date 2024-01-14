package com.xworkz.practice.comparable;


    import com.xworkz.practice.comparable.dto.AlarmDTO;

    import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class AlarmRunner {
        public static void main(String[] args) {

            AlarmDTO alarmDTO=new AlarmDTO(100,"circle",9.20);
            AlarmDTO alarmDTO1=new AlarmDTO(200,"square",10.15);
            AlarmDTO alarmDTO2=new AlarmDTO(500,"rectangle",11.30);
            AlarmDTO alarmDTO3=new AlarmDTO(250,"oval",12.04);
            AlarmDTO alarmDTO4=new AlarmDTO(1000,"diamond",1.30);

            List<AlarmDTO> list=new ArrayList<>();
            list.add(alarmDTO);
            list.add(alarmDTO1);
            list.add(alarmDTO2);
            list.add(alarmDTO3);
            list.add(alarmDTO4);

            Collections.sort(list);
            for(AlarmDTO dto:list){
                System.out.println(dto);
            }
        }
    }

