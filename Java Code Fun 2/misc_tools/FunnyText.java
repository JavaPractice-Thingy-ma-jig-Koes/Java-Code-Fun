package misc_tools;

import java.util.Timer;

public class FunnyText {


/** @param info the text to slowly be printed */
    public static void print(String info) throws InterruptedException{
        System.out.print("\u001b[0m");
        for(int length = info.length();length>0;length--){
            System.out.print(info.substring(info.length()-length,info.length()-length+1));
            Thread.sleep(75);

        }

    }
    /**  
        *   @param info the text desired to be printed
        *   @param waitTime the amount of time between to be waited between the printing of each character
        */
    public static void print(String info, int waitTime) throws InterruptedException{
        System.out.print("\u001B[0m");
        for(int length = info.length();length>0;length--){
            System.out.print(info.substring(info.length()-length,info.length()-length+1));
            Thread.sleep(waitTime);
}
    }
        /**  
        *   @param info the text desired to be printed
        *   @param color the desired color (background can be added as well of the color) Black: 30 Red: 31 Green: 32 Yellow: 33 Blue: 34 Magenta: 35 Cyan: 36 White: 37, Backgrounds Background Black: 40 Background Red: 41 Background Green: 42 Background Yellow: 43 Background Blue: 44 Background Magenta: 45 Background Cyan: 46 Background White: 47.
        */
    public static void print(String info, String color) throws InterruptedException{
  
        System.out.print("\u001b["+color+"m");
        

        for(int length = info.length();length>0;length--){
            System.out.print(info.substring(info.length()-length,info.length()-length+1));
            Thread.sleep(75);
        }
        System.out.print("\u001b[0m");
    }
    
        /**  
        *   @param info the text desired to be printed
        *   @param waitTime the amount of time between to be waited between the printing of each character
        *   @param color the desired color (background can be added as well of the color) Black: 30 Red: 31 Green: 32 Yellow: 33 Blue: 34 Magenta: 35 Cyan: 36 White: 37, Backgrounds Background Black: 40 Background Red: 41 Background Green: 42 Background Yellow: 43 Background Blue: 44 Background Magenta: 45 Background Cyan: 46 Background White: 47.
        */
    public static void print(String info, int waitTime, String color) throws InterruptedException{
        
        System.out.print(color);

        for(int length = info.length();length>0;length--){
            System.out.print(info.substring(info.length()-length,info.length()-length+1));
            Thread.sleep(waitTime);
    
        }
        System.out.print("\u001b[0m");
    }
    /** @param info the text to slowly be printed */
    public static void println(String info) throws InterruptedException{
        CleanUp.enter();
        System.out.print("\u001b[0m");
        for(int length = info.length();length>0;length--){
            System.out.print(info.substring(info.length()-length,info.length()-length+1));
            Thread.sleep(75);


        }

    }
    /**  
        *   @param info the text desired to be printed
        *   @param waitTime the amount of time between to be waited between the printing of each character
        */
    public static void println(String info, int waitTime) throws InterruptedException{
        CleanUp.enter();
        System.out.print("\u001B[0m");
        for(int length = info.length();length>0;length--){
            System.out.print(info.substring(info.length()-length,info.length()-length+1));
            Thread.sleep(waitTime);
}

    }
        /**  
        *   @param info the text desired to be printed
        *   @param color the desired color (background can be added as well of the color) Black: 30 Red: 31 Green: 32 Yellow: 33 Blue: 34 Magenta: 35 Cyan: 36 White: 37, Backgrounds Background Black: 40 Background Red: 41 Background Green: 42 Background Yellow: 43 Background Blue: 44 Background Magenta: 45 Background Cyan: 46 Background White: 47.
        */
    public static void println(String info, String color) throws InterruptedException{
        CleanUp.enter();
        System.out.print("\u001b["+color+"m");
        

        for(int length = info.length();length>0;length--){
            System.out.print(info.substring(info.length()-length,info.length()-length+1));
            Thread.sleep(75);
        }
        System.out.print("\u001b[0m");
    }
    
        /**  
        *   @param info the text desired to be printed
        *   @param waitTime the amount of time between to be waited between the printing of each character
        *   @param color the desired color (background can be added as well of the color) Black: 30 Red: 31 Green: 32 Yellow: 33 Blue: 34 Magenta: 35 Cyan: 36 White: 37, Backgrounds Background Black: 40 Background Red: 41 Background Green: 42 Background Yellow: 43 Background Blue: 44 Background Magenta: 45 Background Cyan: 46 Background White: 47.
        */
    public static void println(String info, int waitTime, String color) throws InterruptedException{
        CleanUp.enter();
        System.out.print(color);

        for(int length = info.length();length>0;length--){
            System.out.print(info.substring(info.length()-length,info.length()-length+1));
            Thread.sleep(waitTime);
    
        }
        System.out.print("\u001b[0m");
    }

/**@param in this instance, iteration refers to the number of times ""..." will be printed. timeBetweenThumbs refers to the time between the printing of each period. 
 * @throws InterruptedException */
    public static void twiddleThumbs(int iterations) throws InterruptedException{
        CleanUp.enter();
        while (iterations>0) {
            FunnyText.print("abc");
            //System.out.print("\r");
            for(int x=3; x>0; x--)
            {
            System.out.print("\r\b");
            Thread.sleep(100);
            }
            iterations--;
        }
    }




/**@param in this instance, iteration refers to the number of times ""..." will be printed. timeBetweenThumbs refers to the time between the printing of each period. 
 * @throws InterruptedException */
    public static void twiddleThumbs(int iterations, int timeBetweenThumbs) throws InterruptedException{
        while (iterations>0) {
            FunnyText.print("...",timeBetweenThumbs);
            System.out.print("\r");
            System.out.print("   ");
            iterations--;
        }
    }

}
