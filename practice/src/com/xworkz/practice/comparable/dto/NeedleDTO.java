package com.xworkz.practice.comparable.dto;


    import lombok.*;

import java.io.Serializable;
    @Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
    public class NeedleDTO implements Serializable,Comparable<NeedleDTO> {

        private String material;
        private int size;
        private int cost;
        @Override
        public int compareTo(NeedleDTO o) {
            return this.getMaterial().compareTo(o.getMaterial());
        }
    }
