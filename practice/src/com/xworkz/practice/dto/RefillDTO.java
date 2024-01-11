package com.xworkz.practice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RefillDTO {
    private String name;
    private int price;
    private int quantity;
    private  int usageDays;

}
