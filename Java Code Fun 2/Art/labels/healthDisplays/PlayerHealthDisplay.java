package Art.labels.healthDisplays;

import java.awt.Dimension;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import Art.labels.Label;
import Art.labels.healthDisplays.*;
import characters.playerStats.Player;

public class PlayerHealthDisplay extends Label {

    private Player player;

    public PlayerHealthDisplay(Player player) {
        super("Player Hit Points : "+player.getHealth());
        this.player=player;
        ImageIcon redHeart = new ImageIcon("redHeart.png");
        this.setIcon(redHeart);
        this.setMinimumSize(new Dimension(70,9));



    }
    public void update(){
        setText("Player Hit Points : "+player.getHealth());
        System.out.println("New Player Health : "+player.getHealth());
    }


    
}
