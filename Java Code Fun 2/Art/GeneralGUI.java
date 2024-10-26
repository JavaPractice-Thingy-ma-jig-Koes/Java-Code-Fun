package Art;

import Art.buttons.ReadyButton;
import Art.buttons.SwordBowButton;
import Art.buttons.WeaponButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.LayoutManager2;
import java.awt.Rectangle;

import javax.swing.*;
/**@see notes This class is a container for general GUI stuff
 * @see notesCont to bring up GUI stuff instantiate a GeneralGUI object.
 */
public class GeneralGUI implements Runnable {

    private Label l = new Label("");
    private SwordBowButton sbB = new SwordBowButton();
    private JTextField input = new JTextField("Hello There");
    private ConfigureFrame f = new ConfigureFrame(600,800);
    private ReadyButton r = new ReadyButton();
    private JPanel p = new JPanel();
    
    public GeneralGUI(){

        
        sbB.setBorder(BorderFactory.createLineBorder(Color.blue,5,true));
        p.add(l);
        p.add(input);
        p.add(sbB);
        p.add(r);
        p.setLayout(new BorderLayout());
        f.setContentPane(p);
        
        f.setBackground(Color.BLUE);
        p.setBackground(new Color(190, 215, 250));

        l.setBounds(20,20,760,20);

        r.setBounds(20,200,80,30);
        input.setBounds(20,50,100,30);

        sbB.setBounds(20,120,200,60);
        sbB.setMaximumSize(new Dimension(200,100));



        
        

    }

    public void print(String info){
        l.print(info);
    }
    public void clear(){
        l.clear();
    }

    @Override
    public void run() {
        GeneralGUI g = new GeneralGUI();
    }
    public boolean getIsReady(){
        return r.getIsReady();
    }
    public void prepare(){
        r.prepare();
    }
    public boolean getSwordBow(){
        return sbB.getSwordBow();
    }

    
}
