/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame1;

/**
 *
 * @author Ronak
 */
public class Card {
    
    private int value;
    private String suit;
    
    public static final String[] SUITS = {"Hearts","Diamons","Spades","Clubs"};
    
    public Card(int v, String s){
        this.value = v;
        suit=s;
    
     }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
    
    
}
