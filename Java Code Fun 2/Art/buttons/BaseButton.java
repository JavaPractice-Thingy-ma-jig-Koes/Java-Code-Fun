package Art.buttons;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JButton;

public class BaseButton extends JButton{

    
    public BaseButton(){super();}
    public BaseButton(String info){super(info);}
    public BaseButton(String info, Icon icon){super(info,icon);}

    @Override
    protected void paintComponent(Graphics g) {     
      
        int h = this.getHeight();
        final int DEFAULT_H = 26;
        double resizal = ((double)h) / DEFAULT_H;
    
        String t = getText();
        setText("<html><span style='font-size:" + (resizal*11) + "'>" + t);
        super.paintComponent(g);
        setText(t);
    }


}
