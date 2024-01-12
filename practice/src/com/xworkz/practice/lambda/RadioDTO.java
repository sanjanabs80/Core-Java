package com.xworkz.practice.lambda;


    import lombok.*;

    import java.io.Serializable;
    @NoArgsConstructor@AllArgsConstructor@Setter
    @ToString@Getter
    public class RadioDTO implements Serializable {

        private String Name;
        private String color;
        private double cost;
        private String location;
    }

