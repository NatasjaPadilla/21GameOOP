/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author nat
 */
public class player {
    
    public static String card = "";
    public static int cardValue = 0;
    public static int cardsum = 0;
    public static Scanner in = new Scanner(System.in);
    public static String s = "";
    
    public static int switchCase(){
        switch(card) { 
            case "A": 
                System.out.println("pick a value (1 or 11): "); 
                s = in.nextLine(); cardValue = Integer.parseInt(s); 
                break; 
            case "J": 
                cardValue = 10; 
                break; 
            case "Q": 
                cardValue = 10; 
                break; 
            case "K": 
                cardValue = 10; 
                break; 
        }
        return cardValue;
    }
    
    public static void giveCard(Stack<String> theStack){
        for(int i = 0; i < 2; i++){
        System.out.println("your card: ");
		
		card = theStack.pop();
		System.out.println(card);
		
		System.out.println();
		
		if(card.length() == 4)
		{
			card = "10";
		}
		else
		{
			String[] temp = card.split("");
			card = temp[2];
		}
		try
		{
			cardValue = Integer.parseInt(card);
		}
		catch(Exception e)
		{
			switchCase();
		}
                
                cardsum += cardValue;
        }
        
                System.out.println("your total: " + cardsum);
    }
}
