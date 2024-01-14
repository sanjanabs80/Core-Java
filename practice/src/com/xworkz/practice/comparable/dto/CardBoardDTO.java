package com.xworkz.practice.comparable.dto;


    import lombok.*;

    import java.io.Serializable;
    @AllArgsConstructor
    @Setter@Getter@NoArgsConstructor@ToString
    public class CardBoardDTO implements Serializable,Comparable<CardBoardDTO> {

        private String color;
        private String type;
        private int size;

        @Override
        public int compareTo(CardBoardDTO o) {
            return this.getType().compareTo(o.getType());
        }
    }

