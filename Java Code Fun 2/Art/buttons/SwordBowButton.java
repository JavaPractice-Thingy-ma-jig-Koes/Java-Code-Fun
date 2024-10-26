package Art.buttons;

import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.border.Border;

import playerStats.Player;

public class SwordBowButton extends WeaponButton implements ActionListener
{
    private JButton weapon = new JButton();
    private boolean isSword = false;

        public SwordBowButton()
        {

            setOpaque(true);

            setBackground(Color.WHITE);
            setText("Click Me");
            
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
                
                
            setGreen(isSword);
            if(isSword) setText("Sword");
            else setText(" Bow ");
            isSword=!isSword;
        }

}