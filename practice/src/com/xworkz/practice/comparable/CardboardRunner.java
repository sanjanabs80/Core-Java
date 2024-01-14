package com.xworkz.practice.comparable;


    import com.xworkz.practice.comparable.dto.CardBoardDTO;

    import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class CardBoardRunner {
        public static void main(String[] args) {

            CardBoardDTO cardBoardDTO = new CardBoardDTO("blue", "plastic", 20);
            CardBoardDTO cardBoardDTO1 = new CardBoardDTO("violet", "wood", 30);
            CardBoardDTO cardBoardDTO2 = new CardBoardDTO("white", "fibre", 25);
            CardBoardDTO cardBoardDTO3 = new CardBoardDTO("orange", "plastic", 10);
            CardBoardDTO cardBoardDTO4 = new CardBoardDTO("pink", "wood", 15);

            List<CardBoardDTO> list = new ArrayList<>();
            list.add(cardBoardDTO);
            list.add(cardBoardDTO1);
            list.add(cardBoardDTO2);
            list.add(cardBoardDTO3);
            list.add(cardBoardDTO4);

            Collections.sort(list);
            for (CardBoardDTO dto : list) {
                System.out.println(dto);
            }
        }
    }
