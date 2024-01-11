package com.xworkz.practice.dto;

import lombok.*;

import java.io.Serializable;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Paper  implements Serializable {

     private String type;
    private double cost;
    private double size;
    private String color;
}





