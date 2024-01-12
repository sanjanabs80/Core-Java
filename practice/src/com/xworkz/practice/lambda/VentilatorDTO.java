package com.xworkz.practice.lambda;

import lombok.*;

import java.io.Serializable;
@Setter@Getter@ToString@AllArgsConstructor@NoArgsConstructor
public class VentilatorDTO implements Serializable {
    private String brand;
    private int maxAirflow;
    private String portable;
    private int cost;

}

