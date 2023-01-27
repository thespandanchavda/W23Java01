package com.example.w23java01;

public class Main {
    public static void main(String[] args) {
        Card aceOfSpades = new Card("queen","diamonds");
        System.out.println("Value of " +aceOfSpades +":"+ aceOfSpades.getValue());
        System.out.println("color: "+aceOfSpades.color());

        DeckofCards deck = new DeckofCards();
        System.out.println(deck);
    }
}
