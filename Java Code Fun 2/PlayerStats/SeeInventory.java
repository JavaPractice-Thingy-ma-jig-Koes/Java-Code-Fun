package PlayerStats;

import java.util.Scanner;

import misc_tools.FunnyText;
import misc_tools.RNG;

public class SeeInventory extends Player implements Runnable{

    private static String y = "";
    @Override
    public void run() {
        Scanner x = new Scanner(System.in);
        
        while(true){
          y=x.nextLine();
          if(y.toLowerCase().equals("show inventory")){
            printInventory();
          }
          
          
            
          else if (y.toLowerCase().equals("show hp")){
            try {
            FunnyText.println("Your HP : "+RNG.RIG(1,10));
            
              FunnyText.println("Enemy HP : "+RNG.RIG(1,10));
            } catch (InterruptedException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
            }
          }

        }
    }
    
}
