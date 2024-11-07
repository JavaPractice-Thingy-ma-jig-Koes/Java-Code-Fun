package Art.buttons;

import java.awt.*;




import javax.swing.Icon;
import javax.swing.JButton;

public class BaseButton extends JButton{

    private boolean isGradient;
    private Color colorGradient;
    public BaseButton(){super();}
    public BaseButton(String info){super(info);}
    public BaseButton(String info, Icon icon){super(info,icon);}
    public BaseButton(Color colorGradient){super();this.isGradient=true; this.colorGradient=colorGradient;}
    public BaseButton(String info,Color colorGradient){super(info);this.isGradient=true; this.colorGradient=colorGradient;}
    public BaseButton(String info, Icon icon,Color colorGradient){super(info,icon);this.isGradient=true; this.colorGradient=colorGradient;}

    @Override
    protected void paintComponent(Graphics g) {     
      
        int h = this.getHeight();
        final int DEFAULT_H = 26;
        double resizal = ((double)h) / DEFAULT_H;
    
        String t = getText();
        setText("<html><span style='font-size:" + (resizal*11) + "'>" + t);

        setText(t);
        if(isGradient)
{        final Graphics2D g2 = (Graphics2D) g.create();
            g2.setPaint(new GradientPaint(
                    new Point(0, 0), 
                    Color.WHITE, 
                    new Point(0, getHeight()), 
                    colorGradient.darker()));
            g2.fillRect(0, 0, getWidth(), getHeight());
            g2.dispose();

            
    }
    super.paintComponent(g);
}


}
