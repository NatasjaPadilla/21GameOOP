/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.Stack;

/**
 *
 * @author nat
 */
public class shuffle {
    
    public static p2.player pc = new p2.player();
    public static p2.dealer dc = new p2.dealer();
    public static p2.extra ec = new p2.extra();
    
    public static void shuffle(String[] deck){
        Stack<String> theStack = new Stack<String>();
        for(int i = 0; i < deck.length; i++)
		{
			int j = (int)(Math.random() * deck.length);
			if(deck[j].equals(" "))
			{
				i--;
			}
			else
			{
				theStack.push(deck[j]);
				//System.out.print(deck[j] + " ");
				deck[j] = " ";
			}
		}
        pc.giveCard(theStack);
        dc.dealerCard(theStack);
        ec.extraCard(theStack);
    }
}
