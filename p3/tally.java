/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author nat
 */
public class tally {
    
    public static p2.player pc = new p2.player();
    public static p2.dealer dc = new p2.dealer();
    
    public static int player = 0;
    public static int dealer = 0;
    public static int tie = 0;
    
    public static void conditions(){
        if(pc.cardsum == 21 && dc.dcardsum != 21){
            player += 1;
            System.out.println("player wins");
        }
        else if(pc.cardsum != 21 && dc.dcardsum == 21){
            dealer += 1;
            System.out.println("dealer wins");
        }
        else if(pc.cardsum < 21 && dc.dcardsum > 21){
            player += 1;
            System.out.println("player wins");
        }
        else if(pc.cardsum > 21 && dc.dcardsum < 21){
            dealer += 1;
            System.out.println("dealer wins");
        }
        else if(pc.cardsum < 21 && dc.dcardsum < 21){
            if(pc.cardsum > dc.dcardsum){
                player += 1;
                System.out.println("player wins");
            }
            else if(dc.dcardsum > pc.cardsum){
                dealer += 1;
                System.out.println("dealer wins");
            }
            else if(pc.cardsum == dc.dcardsum){
                tie += 1;
                System.out.println("draw");
            }
        }
        else if(pc.cardsum > 21 && dc.dcardsum > 21){
            tie += 1;
            System.out.println("draw");
        }
    }
}
