/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.Scanner;

/**
 *
 * @author nat
 */
public class main {
    
    public static p2.player pc = new p2.player();
    public static p2.dealer dc = new p2.dealer();
    public static shuffle sc = new shuffle();
    public static p3.tally tc = new p3.tally();
    public static Scanner in = new Scanner(System.in);
    public static int rounds = 0;
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
                String ans = "";
                boolean play = true;
                do{
                    System.out.println("do you want to play?(y/n): ");
                    ans = in.nextLine();
                    if(ans.equalsIgnoreCase("y")){
                        pc.cardsum = 0;
                        dc.dcardsum = 0;
		String[] typeCards = new String[]
				{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] classCards = new String[]
				{"S", "D", "C", "H"};
		
                
                String[] deck = new String[52];
		int count = 0;
		
		for(int i = 0; i < classCards.length; i++)
		{
			for(int j = 0; j < typeCards.length; j++)
			{
				deck[count] = classCards[i] + "-" + typeCards[j];
				count++;
			}
		}
		
		sc.shuffle(deck);
		tc.conditions();
                rounds += 1;
                }
                    else if(ans.equalsIgnoreCase("n")){
                        play = false;
                    System.out.println("rounds played: " + rounds);
                    System.out.println("win\tlose\tdraw");
                    System.out.println(tc.player +"\t"+ tc.dealer +"\t"+ tc.tie);
                }
                }
                while(play);
                
                
                }
}
