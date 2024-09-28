package PlayerStats;

import java.util.Scanner;

public class SeeInventory extends Player implements Runnable{

    private static String y = "";
    @Override
    public void run() {
        Scanner x = new Scanner(System.in);
        
        while(true){
          y=x.nextLine();
          if(y.toLowerCase().equals("show inventory")){
            
          }
          
          printInventory();
            
        }
    }
    
}
