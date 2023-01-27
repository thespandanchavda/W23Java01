package com.example.w23java01;


import java.util.Arrays;
import java.util.List;

public class Card {
    private String faceName;
    private String suit;

    /**
     * This is called constructor.
     * faceName= "2,3,4,5,6,7,8,....J,Q,K,A
     * suit= "spades, hearts,clubs and diamonds
     */
    public Card(String faceName, String suit) {

        setFaceName(faceName);
        setSuit(suit);
    }

    public String toString() {
        return faceName + " " + "of" + suit;
    }

    public String getFaceName() {
        return faceName;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        suit = suit.toLowerCase();
        List<String> validSuits = getSuits() ;
        if (validSuits.contains(suit))
            this.suit = suit;

        else
            throw new IllegalArgumentException(suit + "was recieved, Valid Options are:" + validSuits);

    }

    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();
        List<String> validfaceNames = getValidFaceNames();
        if (validfaceNames.contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException(faceName + " " + "was recieved it must be one of:" + validfaceNames);
    }
    public int getValue() {
        return getValidFaceNames().indexOf(faceName) +2;
    }

    /**
     * This method returns a list of valid Facenames
     */
    public static List<String> getValidFaceNames() {
        return Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10","jack", "king", "queen", "ace");
    }
    public static List<String> getSuits(){
        return Arrays.asList("hearts", "spades", "clubs", "diamonds");
    }
    public String color()
    {
        if (suit.equals("hearts")||suit.equals("diamonds"))
            return "red";
        else
            return "black";
    }

        /** This method represent the images of cards
        Visually */
        
}
