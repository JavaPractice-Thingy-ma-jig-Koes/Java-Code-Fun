package Art;



import Art.buttons.ReadyButton;
import Art.buttons.SwordBowButton;
import Art.labels.healthDisplays.HealthDisplay;
import characters.playerStats.Player;
import java.awt.*;
import javax.swing.*;

public class CombatPane extends JPanel {

    public ReadyButton r;
    public SwordBowButton sbB;
    private JPanel centerPanel = new JPanel();
    public HealthDisplay phd;
    private Dimension butt =new Dimension(80,30);
    public TextArea t = new TextArea("");

    public CombatPane(Player p1)
    {
        sbB= new SwordBowButton(p1);
        phd = new HealthDisplay(p1);
        r = new ReadyButton(p1);

        setLayouts();
        addToThis();
        addToCenter();

        phd.setPreferredSize(new Dimension(200,20));
        r.setPreferredSize(butt);
        sbB.setPreferredSize(butt);
    }

    private void setLayouts(){
        setLayout(new BorderLayout(5,5));
        centerPanel.setLayout(new GridLayout(12,8,10,10));
    }
    private void addToThis(){
        add(centerPanel);
        add(t, BorderLayout.NORTH);
        add(centerPanel,BorderLayout.CENTER);
    }
    private void addToCenter(){
        centerPanel.add(sbB);
        centerPanel.add(r);
        centerPanel.add(phd);
    }
}
