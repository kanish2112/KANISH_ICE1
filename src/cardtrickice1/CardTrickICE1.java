/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * MADE BY- KANISH KRUPALKUMAR BHAVSAR STUDENT ID-991666094
 */
package cardtrickice1;

import java.util.Arrays;
import java.util.Scanner;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue((int)Math.floor(Math.random()*(13)+1));//use a method to generate random *13
            c1.setSuits((int)Math.floor(Math.random()*(4)));//random method suit 
            System.out.println(c1.getValue()+" "+c1.getSuits());
            magicHand[i]=c1;
            
        }
        //step 2:take input 
        Scanner object=new Scanner(System.in);
        System.out.println("Enter the card value and suit");
        Card c2=new Card();
        c2.setValue(object.nextInt());
        Arrays.sort(Card.SUITS);
        c2.setSuits(Arrays.binarySearch(Card.SUITS,object.next()));
        //step 3: match with array
        int number=0;
        boolean x=false;
        while(number<7){
            if(magicHand[number].getValue()==c2.getValue()&& magicHand[number].getSuits().equals(c2.getSuits())){
                x=true;
            }
            number++;
            }
        if(x==true){
            System.out.println("Card is there");
        }
        else
        {
            System.out.println("Card is not there");
        }
        Card luckyCard=new Card();
         luckyCard.setValue(6);
            luckyCard.setSuits(2);
    }
    
}
