package com.xworkz.practice.lambda;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ShipDTO {
   private String name;
    private String type;
    private int capacity;
    private String location;
}
