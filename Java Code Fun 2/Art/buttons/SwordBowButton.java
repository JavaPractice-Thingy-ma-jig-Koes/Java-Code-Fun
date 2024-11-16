package Art.buttons;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToolTip;
import javax.swing.JButton;
import javax.swing.border.Border;

import Art.GeneralGUI;
import characters.playerStats.Player;

public class SwordBowButton extends BaseButton implements ActionListener
{
    private JButton weapon;
    private boolean isSword = true;
    private GeneralGUI gui;
    private Player player;
    private JToolTip info;
    
    private static final ImageIcon melee = new ImageIcon("Java Code Fun 2/Art/buttons/melee.png");
    private static final ImageIcon ranged = new ImageIcon("Java Code Fun 2/Art/buttons/ranged.png");
    private static final Dimension base = new Dimension(melee.getIconWidth(),melee.getIconHeight());

        public SwordBowButton(Player player, GeneralGUI gui)
        {
            super(melee);
            //super("Ready",new Color(140,140,140));

        this.player=player;
        setOpaque(false);

        addActionListener(this);
        //setBorder(new LineBorder(Color.black,3, true) );
        //setBackground(grayness);
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

            setGreen(isSword);

            setToolTipText(player.getSwords().getName()); 
            
            addActionListener(this);
            
    }
        private void setGreen(boolean wantGreen){
            if(wantGreen){
            this.setIcon(melee);
            System.out.println("Sword-Bow Button Clicked - is a Sword");
            }
            else{
            this.setIcon(ranged);
            System.out.println("Sword-Bow Button Clicked - is a Bow");
        }
        }
        public boolean getSwordBow(){return isSword;}
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            
            isSword=!isSword;
            setGreen(isSword);
            
            if(isSword) {setToolTipText(player.getSwords().getName()); }
            else {setToolTipText(player.getRanged().getName());}

            

        }

}