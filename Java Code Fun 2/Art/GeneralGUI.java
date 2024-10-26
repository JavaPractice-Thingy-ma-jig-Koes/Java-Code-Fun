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

public class GeneralGUI implements Runnable {

    private Label l = new Label("");
    private SwordBowButton sbB = new SwordBowButton();
    private JTextField input = new JTextField("Hello There");
    private ConfigureFrame f = new ConfigureFrame(400,500);
    private ReadyButton r = new ReadyButton();
    
    public GeneralGUI(){

        
        sbB.setBorder(BorderFactory.createLineBorder(Color.blue,5,true));
        f.add(l);
        f.add(input);
        f.add(sbB);
        f.add(r);
        f.setLayout(new BorderLayout());

        l.setBounds(20,20,90,20);

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
}
