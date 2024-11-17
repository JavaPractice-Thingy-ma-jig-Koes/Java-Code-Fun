package Art.buttons;


import javax.swing.ImageIcon;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToolTip;
import javax.swing.JButton;
import Art.GeneralGUI;
import characters.playerStats.Player;

public class SwordBowButton extends BaseButton implements ActionListener
{
    private JButton weapon;
    private boolean isSword = true;
    private GeneralGUI gui;
    private Player player;
    private JToolTip info;
    private int doublecheck = 0;
    
    private static final ImageIcon melee = new ImageIcon("Java Code Fun 2/Art/buttons/melee.png");
    private static final ImageIcon ranged = new ImageIcon("Java Code Fun 2/Art/buttons/ranged.png");
    private static final Dimension base = new Dimension(melee.getIconWidth(),melee.getIconHeight());

        public SwordBowButton(Player player, GeneralGUI gui)
        {
            super(melee);


        this.player=player;
        setOpaque(false);

        addActionListener(this);

        setSize(base);
        setPreferredSize(base);
        setMaximumSize(base);
        setBorderPainted(false);
        setBorder(null);
        setFocusable(false);
        setMargin(new Insets(0, 0, 0, 0));
        setContentAreaFilled(false);
                this.gui=gui;
                this.player=player;
            setGreen();
            setToolTipText(player.getSwords().getName()); 
            addActionListener(this);
    }

        private void setGreen(){
            if(isSword){
            this.setIcon(melee);
            setToolTipText(player.getSwords().getName()); 
            System.out.println("Sword-Bow Button Clicked - is a Sword");
            }
            else{
            this.setIcon(ranged);
            setToolTipText(player.getRanged().getName());
            System.out.println("Sword-Bow Button Clicked - is a Bow");
        }
        }
        public boolean getSwordBow(){return isSword;}
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            // I had a problem that it was activating twice. This cause it to trigger every other time.
            doublecheck++;
            if(doublecheck%2==1){
            isSword=!isSword;
            setGreen();
            }
        }

}