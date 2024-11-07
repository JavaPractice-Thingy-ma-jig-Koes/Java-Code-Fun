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
    //private Player player;
    private SwordBowButton sbB;




    private ConfigureFrame f = new ConfigureFrame(600,800);
    private ReadyButton r;
    private JTabbedPane mainPane = new JTabbedPane(JTabbedPane.TOP,JTabbedPane.WRAP_TAB_LAYOUT);
    private JPanel combatPane = new JPanel();
    private JPanel centerPanel = new JPanel();
    private PlayerHealthDisplay phd;
    private Dimension butt =new Dimension(80,30);
    

    public GeneralGUI(Player player){
        f.setTitle("Java Code Fun");


        sbB= new SwordBowButton(player,this);
        phd = new PlayerHealthDisplay(player);
        r = new ReadyButton(player);
        //this.player=player;
        setLayouts();
        centerPanel.setSize(600,500);
        addThings();
        setColors();
        sbB.setBorder(BorderFactory.createLineBorder(Color.blue,5,true));

        r.setPreferredSize(butt);
        sbB.setPreferredSize(butt);


        mainPane.add("Stats",new JLabel("unfinished"));
        mainPane.add("TBD",new JLabel("unfinished"));
        mainPane.setEnabledAt(mainPane.indexOfTab("TBD"),false);
        





        mainPane.setBorder(BorderFactory.createEtchedBorder(new Color(5,5,10),new Color(10,15,25)));
        mainPane.add("Combat",combatPane);

        mainPane.setPreferredSize(new Dimension(800,700));
        combatPane.setPreferredSize(mainPane.getSize());
        mainPane.setLocation(10,10);



        phd.setPreferredSize(new Dimension(200,20));


        makeViewable();
    }

    private void setLayouts(){
        f.setLayout(new BorderLayout());

        combatPane.setLayout(new BorderLayout(5,5));
        centerPanel.setLayout(new GridLayout(12,8,10,10));
    }

    private void addThings(){
        f.add(mainPane);

        centerPanel.add(sbB);
        centerPanel.add(r);
        centerPanel.add(phd);

        combatPane.add(t, BorderLayout.NORTH);
        combatPane.add(centerPanel,BorderLayout.CENTER);
    }
    private void makeViewable(){
        combatPane.setVisible(true);
        centerPanel.setVisible(true);
        mainPane.setVisible(true);
    }

    public void print(String info){
        System.out.println("gui.TextArea - "+info);
        t.print(info);
    }
    private void setColors(){

        mainPane.setBackground(new Color(20,190,255));
        centerPanel.setBackground(new Color(190, 215, 250));
        combatPane.setBackground(new Color(190, 215, 250));
    }
    public void clear(){
        System.out.println("gui.TextArea has been cleared");
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
    public void chooseClass()
    {
        setPvis(false);
        ClassPicker.chooseClass(mainPane);
    }
    public void setPvis(boolean visible){
        //mainPane.setVisible(visible);

        centerPanel.setVisible(visible);
        combatPane.setVisible(visible);

    }





    

    

    
}
