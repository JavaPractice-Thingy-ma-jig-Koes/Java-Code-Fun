package Art;

import Art.buttons.ReadyButton;
import Art.buttons.SwordBowButton;
import Art.buttons.WeaponButton;
import Art.labels.Label;
import Art.labels.healthDisplays.PlayerHealthDisplay;
import characters.playerStats.Player;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.LayoutManager2;
import java.awt.Rectangle;
import Art.TextArea;


import javax.swing.*;
/**@see notes This class is a container for general GUI stuff
 * @see notesCont to bring up GUI stuff instantiate a GeneralGUI object.
 */
public class GeneralGUI {

    private TextArea t = new TextArea("");
    private SwordBowButton sbB = new SwordBowButton();
    private Player player;

    


    private ConfigureFrame f = new ConfigureFrame(600,800);
    private ReadyButton r;
    private JPanel p = new JPanel();
    private PlayerHealthDisplay phd;
    
    public GeneralGUI(Player player){

        phd = new PlayerHealthDisplay(player);
        r = new ReadyButton(player);
        this.player=player;
        sbB.setBorder(BorderFactory.createLineBorder(Color.blue,5,true));

        p.add(t);


        p.add(sbB);
        p.add(r);
        p.add(phd);
        p.setLayout(new BorderLayout());
        f.setContentPane(p);
        
        f.setBackground(new Color(20,190,255));
        p.setBackground(new Color(190, 215, 250));
        

        t.setBounds(20,20,f.getWidth()-40,50);

        r.setBounds(120,80,80,30);


        sbB.setBounds(20,80,80,30);
        sbB.setMaximumSize(new Dimension(80,30));
        phd.setBounds(50,100+sbB.getHeight(),200,20);


        

    }

    public void print(String info){
        t.print(info);
    }
    public void clear(){
        t.clear();
    }
    public void println(String info){
        t.println(info);
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
    public void enter(){
        t.enter();
    }
    public void update(){
        phd.update();
        //ehd.update();
    }


    

    

    
}
