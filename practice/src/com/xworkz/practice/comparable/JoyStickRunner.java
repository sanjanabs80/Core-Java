package com.xworkz.practice.comparable;


    import com.xworkz.practice.comparable.dto.JoyStickDTO;

    import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class JoyStickRunner {

        public static void main(String[] args) {

            JoyStickDTO joyStickDTO=new JoyStickDTO("digital joystick","usb",5);
            JoyStickDTO joyStickDTO1=new JoyStickDTO("paddle controller","wireless",10);
            JoyStickDTO joyStickDTO2=new JoyStickDTO("analogue joystick","wired",6);
            JoyStickDTO joyStickDTO3=new JoyStickDTO("pc analogue","usb",7);
            JoyStickDTO joyStickDTO4=new JoyStickDTO("bluetooth","wired",4);

            List<JoyStickDTO> list=new ArrayList<>();
            list.add(joyStickDTO);
            list.add(joyStickDTO1);
            list.add(joyStickDTO2);
            list.add(joyStickDTO3);
            list.add(joyStickDTO4);

            Collections.sort(list);
            for(JoyStickDTO dto:list){
                System.out.println(dto);
            }

        }
    }

