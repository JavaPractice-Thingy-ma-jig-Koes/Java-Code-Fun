package Art;

//import java.awt.Component;

import javax.swing.*;

public class ConfigureFrame extends JFrame {

    private JFrame frame = new JFrame("Java Code Fun");
    
    public ConfigureFrame(int height, int width){

        
setSize(height,width);
setVisible(true);

    }
    public ConfigureFrame(int height, int width, boolean isVisible){
        JFrame frame = this.frame;
        
setSize(height,width);
setVisible(isVisible);

    }
    public ConfigureFrame(int height, int width, JButton b1){

        
setSize(height,width);
        
add(b1);
setVisible(true);
    }
    public ConfigureFrame(int height, int width, JButton b1, JButton b2){

        
setSize(height,width);
setVisible(true);
add(b1);
add(b2);
setBounds(10,20,80,50);
setBounds(100,20,80,50);

    }



    
}
