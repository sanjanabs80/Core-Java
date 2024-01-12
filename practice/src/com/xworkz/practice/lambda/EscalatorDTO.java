package com.xworkz.practice.lambda;

import lombok.*;

        import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class EscalatorDTO implements Serializable {
    private String place;
    private boolean electric;
    private String direction;
    private int capacity;

}
