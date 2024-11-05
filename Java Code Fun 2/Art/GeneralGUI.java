package Art;

import Art.buttons.ReadyButton;
import Art.buttons.SwordBowButton;
import Art.labels.healthDisplays.PlayerHealthDisplay;
import characters.playerStats.Player;





import java.awt.*;
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
    private Dimension butt =new Dimension(80,30);
    
    public GeneralGUI(Player player){
        f.setLayout(new BorderLayout());
        p.setLayout(new FlowLayout());
        sbB= new SwordBowButton(player,this);
        phd = new PlayerHealthDisplay(player);
        r = new ReadyButton(player);
        this.player=player;
        sbB.setBorder(BorderFactory.createLineBorder(Color.blue,5,true));
        f.setTitle("Java Code Fun");
        r.setPreferredSize(butt);
        p.add(t);

        
        p.add(sbB);
        p.add(r);
        p.add(phd);

        f.add(p,BorderLayout.CENTER);

        f.setBackground(new Color(20,190,255));
        p.setBackground(new Color(190, 215, 250));
        


    
        t.setPreferredSize(new Dimension(1200,50));



        

        sbB.setPreferredSize(butt);

        phd.setPreferredSize(new Dimension(200,20));
        //f.setExtendedState(JFrame.MAXIMIZED_BOTH);


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
