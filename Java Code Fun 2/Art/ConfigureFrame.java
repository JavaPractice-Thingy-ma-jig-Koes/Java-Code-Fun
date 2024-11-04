package Art;

//import java.awt.Component;

import javax.swing.*;

public class ConfigureFrame extends JFrame {

    private JFrame frame = new JFrame("Java Code Fun");
    
    
    public ConfigureFrame(int height, int width){
        setLocationRelativeTo(null);
        
setSize(height,width);
setVisible(true);

    }
    public ConfigureFrame(int height, int width, boolean isVisible){
        JFrame frame = this.frame;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
setSize(height,width);
setVisible(isVisible);

    }
    public ConfigureFrame(int height, int width, JButton b1){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
setSize(height,width);
        
add(b1);
setVisible(true);
    }
    public ConfigureFrame(int height, int width, JButton b1, JButton b2){
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
setSize(height,width);
setVisible(true);
add(b1);
add(b2);
setBounds(10,20,80,50);
setBounds(100,20,80,50);

    }

    
}
