package Art;

import Art.buttons.ReadyButton;
import Art.buttons.SwordBowButton;
import Art.labels.healthDisplays.PlayerHealthDisplay;
import characters.playerStats.Player;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.*;
/**@see notes This class is a container for general GUI stuff
 * @see notesCont to bring up GUI stuff instantiate a GeneralGUI object.
 */
public class GeneralGUI {

    private TextArea t = new TextArea("");
    private Player player;
    private SwordBowButton sbB;




    private ConfigureFrame f = new ConfigureFrame(600,800);
    private ReadyButton r;
    private JPanel p = new JPanel();
    private PlayerHealthDisplay phd;
    
    public GeneralGUI(Player player){
        sbB= new SwordBowButton(player,this);
        phd = new PlayerHealthDisplay(player);
        r = new ReadyButton(player);
        this.player=player;
        sbB.setBorder(BorderFactory.createLineBorder(Color.blue,5,true));
        f.setTitle("Java Code Fun");

        p.add(t);

        p.setLayout(new FlowLayout());
        p.add(sbB);
        p.add(r);
        p.add(phd);
        p.setLayout(new BorderLayout());
        f.setContentPane(p);

        f.setBackground(new Color(20,190,255));
        p.setBackground(new Color(190, 215, 250));
        

        t.setBounds(20,20,f.getWidth()-40,50);
        t.setPreferredSize(t.getSize());

        r.setBounds(120,80,80,30);
        r.setPreferredSize(r.getSize());

        
        sbB.setBounds(20,80,80,30);
        sbB.setPreferredSize(sbB.getSize());
        phd.setBounds(50,100+sbB.getHeight(),200,20);
        phd.setPreferredSize(phd.getSize());
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setPreferredSize(f.getSize());
        p.setPreferredSize(p.getSize());

        f.pack();

    }

    public void print(String info){
        System.out.println("GUI.TEXTAREA - "+info);
        t.print(info);

    }
    public void clear(){
        System.out.println("GUI.TEXTAREA has been cleared");
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
        f.pack();
        //ehd.update();
    }



    

    

    
}
