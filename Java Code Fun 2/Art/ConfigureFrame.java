package Art;

import javax.swing.*;

public class ConfigureFrame {

    private JFrame frame = new JFrame("Java Code Fun");
    
    public ConfigureFrame(int height, int width){
        JFrame frame = this.frame;
        
        frame.setSize(height,width);
        frame.setVisible(true);
        frame.pack();
    }
    public ConfigureFrame(int height, int width, boolean isVisible){
        JFrame frame = this.frame;
        
        frame.setSize(height,width);
        frame.setVisible(isVisible);
        frame.pack();
    }
    public ConfigureFrame(int height, int width, JButton b1){
        JFrame frame = this.frame;
        
        frame.setSize(height,width);
        frame.setVisible(true);
        frame.add(b1);
        frame.pack();
    }
    public ConfigureFrame(int height, int width, JButton b1, JButton b2){
        JFrame frame = this.frame;
        
        frame.setSize(height,width);
        frame.setVisible(true);
        frame.add(b1);
        frame.add(b2);
        b2.setAlignmentX(width/2);
        frame.pack();
    }

    
}
