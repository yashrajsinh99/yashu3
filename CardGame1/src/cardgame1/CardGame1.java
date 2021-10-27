/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ronak
 */
public class CardGame1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       
    //now ask user for a card
    System.out.println("pick a suit from : ENter 0 to 3");
    int suit = input.nextInt();

    System.out.println("pick a value from : ENter 1 to 13");
int value = input.nextInt();

Card userGuess =new Card(value, Card.SUITS[suit]);

//now check for a match
boolean match = false;
for (Card card: hand){
if(card.getValue() == userGuess.getValue() && card.getSuit().equals(userGuess.getSuit())){
match = true;
break;
}
}//for loop ends

if(match){
System.out.println("You guesedit right");
}
else
System.out.println("You guesed it wrong");



        }
        
    }
    

