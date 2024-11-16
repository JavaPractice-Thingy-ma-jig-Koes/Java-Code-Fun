package misc_tools;

public class Convert {
    
     private static int getColor(String color) throws Exception{
        color = color.toUpperCase();
        //green
        if(color.contains("GREEN")){return 32;}
        //red
        else if(color.contains("RED")){return 31;}
        //blue
        else if(color.contains("BLUE")){return 34;}
        //cyan
        else if(color.contains("CYAN")){return 36;}
        //magenta
        else if(color.contains("MAGENTA")){return 35;}
        //white
        else if(color.contains("WHITE")){return 37;}
        //black
        else if(color.contains("BLACK")){return 30;}
        //remove color
        else{System.out.print("error in color decoding");
            return 0;
            }
        
    }
        public static void printColor(String color, boolean isBackground) throws Exception{
       {
            if(isBackground){
            System.out.print("\u001b["+(getColor(color)+10)+"m");

            }
            else{
            System.out.print("\u001b["+getColor(color)+"m");
            }
        }
    }
}

/*
 * the desired color (background can be added as well of the color) 
 * Black: 30 
 * Red: 31 
 * Green: 32
 *  Yellow: 33
 *  Blue: 34
 *  Magenta: 35
 *  Cyan: 36
 *  White: 37
 * , Backgrounds Background Black: 40 Background Red: 41 Background Green: 42 Background Yellow: 43 Background Blue: 44 Background Magenta: 45 Background Cyan: 46 Background White: 47.
 * 
 */
