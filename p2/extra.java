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
public class extra {
    
    public static Scanner in = new Scanner(System.in);
    public static p2.player pc = new p2.player();
    public static p2.dealer dc = new p2.dealer();
    
    public static void extraCard(Stack<String> theStack){
        boolean playerExtra = true;
        boolean dealerExtra = true;
        
        do{
        System.out.println("would you like to draw another card?(y/n): ");
        String ans = in.nextLine();
        
        if(ans.equalsIgnoreCase("y")){
            System.out.println("your card: ");
            pc.card = theStack.pop();
            System.out.println(pc.card);
            System.out.println();
		
		if(pc.card.length() == 4)
		{
			pc.card = "10";
		}
		else
		{
			String[] temp = pc.card.split("");
			pc.card = temp[2];
		}
		try
		{
			pc.cardValue = Integer.parseInt(pc.card);
		}
		catch(Exception e)
		{
			pc.switchCase();
		}
                
                pc.cardsum += pc.cardValue;
                System.out.println("your total: " + pc.cardsum);
        }
        else{
            playerExtra = false;
        }
        
        if(dc.dcardsum < 18){
            System.out.println("dealer's card: ");
            dc.dcard = theStack.pop();
            System.out.println(dc.dcard);
            System.out.println();
		
		if(dc.dcard.length() == 4)
		{
			dc.dcard = "10";
		}
		else
		{
			String[] temp = dc.dcard.split("");
			dc.dcard = temp[2];
		}
		try
		{
			dc.dcardValue = Integer.parseInt(dc.dcard);
		}
		catch(Exception e)
		{
			dc.dswitchCase();
		}
                
                dc.dcardsum += dc.dcardValue;
                //System.out.println("dealer's total: " + dcardsum);
        }
        else{
            dealerExtra = false;
        }
        }
        while(playerExtra || dealerExtra);
        
        if(!playerExtra && !dealerExtra){
            System.out.println("player's total: " + pc.cardsum);
            System.out.println("dealer's total: " + dc.dcardsum);
        }
    }
}
