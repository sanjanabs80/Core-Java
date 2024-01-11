package com.xworkz.practice.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Parking {
    private String Name;
    private int capacity;
    private int amount;
    private String vehicleType;

}
