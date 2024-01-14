package com.xworkz.practice.comparable.dto;
import lombok.*;

import java.io.Serializable;
    @Getter@ToString@Setter@AllArgsConstructor@NoArgsConstructor
    public class AlarmDTO implements Serializable,Comparable<AlarmDTO>{

        private int cost;
        private String shape;
        private double time;


        @Override
        public int compareTo(AlarmDTO o) {
            return Integer.compare(this.getCost(),o.getCost());
        }
    }

