package com.xworkz.practice.lambda;


    import lombok.*;

import java.io.Serializable;
    @AllArgsConstructor@Setter@NoArgsConstructor@Getter@ToString

    public class TelescopeDTO implements Serializable {
        private String name;
        private String color;
        private double length;
        private double distance;
    }

