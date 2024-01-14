package com.xworkz.practice.comparable.dto;


    import lombok.*;

import java.io.Serializable;
    @Getter@Setter@ToString@NoArgsConstructor@AllArgsConstructor
    public class FirecrackerDTO implements Serializable,Comparable<FirecrackerDTO> {

        private String name;
        private Double cost;
        private String color;
        @Override
        public int compareTo(FirecrackerDTO o) {
            return this.getName().compareTo(o.getColor());
        }
    }

