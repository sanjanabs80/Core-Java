package com.xworkz.practice.comparable.dto;


    import lombok.*;

import java.io.Serializable;
    @Getter@AllArgsConstructor@NoArgsConstructor@ToString@Setter
    public class ToyDTO implements Serializable, Comparable<ToyDTO> {

        private String name;
        private String color;
        private double cost;
        @Override
        public int compareTo(ToyDTO o) {
            return this.getName().compareTo(o.getName());
        }
    }

