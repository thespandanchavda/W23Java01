package com.example.w23java01;

import java.util.ArrayList;
import java.util.List;

public class DeckofCards {
    private ArrayList<Card> deck;
    /** This is a constructor and dont need any instruction or argument */
    public DeckofCards()
    {
        deck = new ArrayList<>();
        List<String> faceNames= Card.getValidFaceNames();
        List<String> suits = Card.getSuits();

       for(String suit: suits)
       {
           for(String faceName: faceNames) {
               deck.add(new Card(faceName, suit));
           }
       }
    }
}
