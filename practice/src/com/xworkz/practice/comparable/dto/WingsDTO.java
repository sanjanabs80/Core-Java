package com.xworkz.practice.comparable.dto;


    import lombok.*;

import java.io.Serializable;
    @Setter@ToString@Getter@NoArgsConstructor@AllArgsConstructor
    public class WingsDTO implements Serializable,Comparable<WingsDTO> {
        private String name;
        private String color;


        @Override
        public int compareTo(WingsDTO o) {
            return this.getName().compareTo(o.getName());
        }
    }

