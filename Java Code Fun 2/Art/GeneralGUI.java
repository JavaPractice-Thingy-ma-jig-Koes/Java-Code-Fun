package Art;

import Art.buttons.ReadyButton;
import Art.buttons.SwordBowButton;
import Art.labels.healthDisplays.HealthDisplay;
import MainFolder.Main;
import characters.playerStats.Player;





import java.awt.*;
import javax.swing.*;
/**@see notes This class is a container for general GUI stuff
 * @see notesCont to bring up GUI stuff instantiate a GeneralGUI object.
 */
public class GeneralGUI {

    
    //private Player player;
    




    private ConfigureFrame f = new ConfigureFrame(600,800);
    private JTabbedPane mainPane = new JTabbedPane(JTabbedPane.TOP,JTabbedPane.WRAP_TAB_LAYOUT);
    private CombatPane combatPane;
    private Player player = Main.getPlayer();
    private StatsPane stats = new StatsPane(player);
    

    public GeneralGUI(){
        f.setTitle("Java Code Fun");
        combatPane = new CombatPane(player);

        setLayouts();
        addThings();
        setColors();

        mainPane.add("TBD",new JLabel("unfinished"));
        mainPane.add("Stats",stats);
        mainPane.setEnabledAt(mainPane.indexOfTab("TBD"),false);



        mainPane.setBorder(BorderFactory.createEtchedBorder(new Color(5,5,10),new Color(10,15,25)));
        mainPane.add("Combat",combatPane);

        mainPane.setPreferredSize(new Dimension(800,700));
        combatPane.setPreferredSize(mainPane.getSize());
        mainPane.setLocation(10,10);


        makeViewable();
        f.pack();
    }

    private void setLayouts(){
        f.setLayout(new BorderLayout());


    }

    private void addThings(){
        f.add(mainPane);
    }
    private void makeViewable(){
        combatPane.setVisible(true);

        mainPane.setVisible(true);
    }

    public void print(String info){
        System.out.println("gui.TextArea - "+info);
        combatPane.t.print(info);
    }
    private void setColors(){

        mainPane.setBackground(new Color(20,190,255));

        combatPane.setBackground(new Color(190, 215, 250));
    }
    public void clear(){
        System.out.println("gui.TextArea has been cleared");
        combatPane.t.clear();
    }
    public void println(String info){
        combatPane.t.println(info);
    }
    public boolean getIsReady(){
        return combatPane.r.getIsReady();
    }
    public void prepare(){
        combatPane.r.prepare();
    }
    public boolean getSwordBow(){
        return combatPane.sbB.getSwordBow();
    }
    public void enter(){
        combatPane.t.enter();
    }
    public void update(){
        combatPane.phd.update();
        f.pack();
        //ehd.update();
    }
    public void chooseClass()
    {
        setPvis(false);
        ClassPicker.chooseClass(mainPane);
    }
    public void setPvis(boolean visible){
        //mainPane.setVisible(visible);


        combatPane.setVisible(visible);

    }





    

    

    
}
