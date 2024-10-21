package Art;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.tools.Tool;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import Art.*;

public class PrintArt extends Canvas {
    //public static final String[] playerArt = {" O ","-|-"," ∏ "};
    

    @Override
    public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("stickFigure.png");  
        g.drawImage(i, 120,100,this);  
          
    }  


    

    //private static String[] temp;
    public static void printArt(String[] artName){

        
    }
}
