package com.xworkz.practice.comparable.dto;


    import lombok.*;

import java.io.Serializable;
    @AllArgsConstructor@Getter@Setter@NoArgsConstructor@ToString
    public class RopeDTO implements Serializable,Comparable<RopeDTO> {
        private Double length;
        private String material;
        private String Color ;


        @Override
        public int compareTo(RopeDTO o) {
            return this.getMaterial().compareTo(o.getMaterial());
        }
    }

