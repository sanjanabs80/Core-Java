package com.xworkz.practice.lambda;

import lombok.*;

import java.io.Serializable;
    @Setter@Getter@NoArgsConstructor@AllArgsConstructor@ToString
    public class GeyserDTO implements Serializable {

        private String Name;
        private String color;
        private int  cost;
        private  int capacity;
    }

