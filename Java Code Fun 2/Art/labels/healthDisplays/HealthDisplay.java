package Art.labels.healthDisplays;

import java.awt.Dimension;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


import characters.Characters;


/** now works for all Characters objects. */
public class HealthDisplay extends JLabel {

    private transient Characters player;
    private static ImageIcon redHeart = new ImageIcon("Java Code Fun 2/Art/labels/healthDisplays/redHeart.png");
    
        public HealthDisplay(Characters player) {
            super(redHeart);
        this.player=player;
        
        //this.setText("Player Hit Points : "+player.getHealth());
        if(redHeart!=null)
        this.setIcon(redHeart);
        this.setMinimumSize(new Dimension(80,9));
        this.setIconTextGap(5);
        this.setPreferredSize(getMinimumSize());
    

        //big long fancy stuff to ensure that the 1st letter is capital.
        this.setText(player.getName().substring(0,1).toUpperCase()+player.getName().substring(1)+" Health : "+player.getHealth());



    }
    public void update(){
        setText("Player Hit Points : "+player.getHealth());
        System.out.println("New" + player.getClass() + "Health : "+player.getHealth()+".");
        


    }


    
}
