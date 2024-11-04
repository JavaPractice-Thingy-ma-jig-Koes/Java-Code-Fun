package Art.buttons;

import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToolTip;
import javax.swing.JButton;
import javax.swing.border.Border;

import Art.GeneralGUI;
import characters.playerStats.Player;

public class SwordBowButton extends WeaponButton implements ActionListener
{
    private JButton weapon = new JButton();
    private boolean isSword = true;
    private GeneralGUI gui;
    private Player player;
    private JToolTip info;

        public SwordBowButton(Player player, GeneralGUI gui)
        {

            setOpaque(true);
                this.gui=gui;
                this.player=player;

            setGreen(isSword);
            setText("melee");
            setToolTipText(player.getSwords().getName()); 
            
            addActionListener(this);
    }
        private void setGreen(boolean wantGreen){
            if(wantGreen)
            setBackground(new Color(210,150,200));
            else
            setBackground(new Color(180, 210, 180));
        }
        public boolean getSwordBow(){return isSword;}
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Sword-Bow Button Clicked");
            
            isSword=!isSword;
            setGreen(isSword);
            if(isSword) {setToolTipText(player.getSwords().getName()); 
            setText("melee");}
            else {setToolTipText(player.getRanged().getName());
            setText("ranged");}

            

        }

}