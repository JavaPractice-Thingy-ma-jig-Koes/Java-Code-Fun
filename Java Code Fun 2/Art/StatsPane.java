package Art;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JPanel;

import characters.playerStats.Player;
public class StatsPane extends JPanel {
    
private JLabel healthLine1;
private JLabel healthLine2;
private Player player;

    public StatsPane(Player player)
    {
        super(new GridLayout(4,4,4,2){});

        this.player = player;

        healthLine1 = new JLabel("Hit Points");
        healthLine2 = new JLabel(player.getHealth()+"/"+player.getMaxHealth());
        
        /* eventually will add the player's item images here using
        * player.getSwords/Ranged/Armor().getIcon();
         * the armor will probably have an icon[] so that the helmet, chestplate, leggings and boots can have their own grid square
         */
        add(healthLine1,0,0);
        add(healthLine2,0,1);


    }

    public void update()
    {
        healthLine2.setText(player.getHealth()+"/"+player.getMaxHealth());
    }
}
