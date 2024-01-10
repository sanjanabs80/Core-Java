package com.xworkz.practice.dto;

import lombok.*;

import java.io.Serializable;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Sensors  implements Serializable {


    private String name;
    private String type;
    private int cost;
    private int distance;


}
