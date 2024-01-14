package com.xworkz.practice.comparable.dto;


    import lombok.*;

import java.io.Serializable;
    @AllArgsConstructor@NoArgsConstructor@Setter@Getter@ToString
    public class JoyStickDTO implements Serializable,Comparable<JoyStickDTO> {

        private String type;
        private String connectivityType;;
        private int numberOfButtons;
        @Override
        public int compareTo(JoyStickDTO o) {
            return Integer.compare(this.getNumberOfButtons(),o.getNumberOfButtons());
        }
    }

