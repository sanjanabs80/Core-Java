package com.xworkz.practice.comparable.dto;


    import lombok.*;

import java.io.Serializable;
    @ToString@NoArgsConstructor@AllArgsConstructor@Setter@Getter
    public class ThreadDTO implements Serializable,Comparable<ThreadDTO> {
        private String material;
        private String color;
        private int quantity;


        @Override
        public int compareTo(ThreadDTO o) {
            return this.getMaterial().compareTo(o.getMaterial());
        }
    }

