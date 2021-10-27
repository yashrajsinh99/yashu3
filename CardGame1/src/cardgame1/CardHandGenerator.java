/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame1;

import java.util.Random;

/**
 *
 * @author Ronak
 */
public class CardHandGenerator {
    public static Card[] generateHand(){
     //create an array to hold 7 cards;
        Card[] hand = new Card[7];
        
        //we will use randon to generate randon numbers
        Random random = new Random();
        
        for(int i =0;i<hand.length;i++){
            int value =random.nextInt(13)+1;
            //System.out.println(value);
            String suit = Card.SUITS[random.nextInt(4)];
            Card card =new Card(value,suit);
            hand[i]= card;
        }//end of for loop
        return hand;
    }
    
}
