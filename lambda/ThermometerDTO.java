package com.xworkz.practice.lambda;


    import lombok.*;

import java.io.Serializable;
    @ToString@Getter@NoArgsConstructor@AllArgsConstructor@Setter
    public class ThermometerDTO implements Serializable {

        private String Name;
        private int cost;
        private String color;
        private int maxtemp;
    }

