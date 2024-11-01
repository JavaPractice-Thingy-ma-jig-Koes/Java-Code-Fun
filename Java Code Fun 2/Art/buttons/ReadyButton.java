package Art.buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import MainFolder.Main;
import characters.playerStats.Player;

public class ReadyButton extends JButton implements ActionListener {
    
    private boolean canBeClicked = false;
    private boolean clicked =false;
    private Player player;


    public ReadyButton(Player player){
        super("Ready");
        this.player=player;
        setOpaque(true);

        addActionListener(this);
        setBorder(new LineBorder(Color.black,3, true) );
        setBackground(Color.DARK_GRAY);
    }

    public void prepare(){
        setBackground(Color.LIGHT_GRAY);
        canBeClicked=true;
    }
    public boolean getIsReady(){
        if(!canBeClicked&&clicked){
            clicked=false;
            return true;
        }
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(canBeClicked){
            clicked =true;
            canBeClicked=false;
            System.out.println("Ready Button Clicked when Ready");
        setBackground(Color.DARK_GRAY);
        Main.onwards();
        }
        else
        System.out.println("Ready Button clicked but not ready");



            
    }
}
