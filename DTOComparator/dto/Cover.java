package com.xworkz.practice.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cover {
    private String color;
    private int quantity;
    private int type;
    private  String size;
}
