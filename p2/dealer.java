/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.Stack;

/**
 *
 * @author nat
 */
public class dealer {
    
    public static String dcard = "";
    public static int dcardValue = 0;
    public static int dcardsum = 0;
    
    public static int dswitchCase(){
        switch(dcard) { 
            case "A": 
                if(dcardsum + 11 < 21){
                    dcardValue = 11;
                }
                else{
                    dcardValue = 1;
                }
                break; 
            case "J": 
                dcardValue = 10; 
                break; 
            case "Q": 
                dcardValue = 10; 
                break; 
            case "K": 
                dcardValue = 10; 
                break; 
        }
        return dcardValue;
    }
    
    public static void dealerCard(Stack<String> theStack){
        for(int i = 0; i < 2; i++){
        System.out.println("dealer's card: ");
		
		dcard = theStack.pop();
		System.out.println(dcard);
		
		System.out.println();
		
		if(dcard.length() == 4)
		{
			dcard = "10";
		}
		else
		{
			String[] temp = dcard.split("");
			dcard = temp[2];
		}
		try
		{
			dcardValue = Integer.parseInt(dcard);
		}
		catch(Exception e)
		{
			dswitchCase();
		}
                
                dcardsum += dcardValue;
        }
                //System.out.println("dealer's total: " + dcardsum);
    }
    
}
