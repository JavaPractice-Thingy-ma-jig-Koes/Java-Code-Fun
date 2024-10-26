package misc_tools;

import java.util.Timer;

public class CleanUp {
    /**@see erases all text from the console */
    public static void clearScreen(){
        System.out.print(" \033[H\033[2J");
        System.out.flush();
    }
    /**@see makes a new line */
    public static void enter(){
        System.out.println("");
    }
    public static void safeSleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (Exception e) {
            System.err.println("Something went wrong with sleep");
        }
    }


}
