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
    

    private boolean clicked =false;
    private Player player;


    public ReadyButton(Player player){
        super("Ready");
        this.player=player;
        setOpaque(true);

        addActionListener(this);
        setBorder(new LineBorder(Color.black,3, true) );
        setBackground(Color.DARK_GRAY);
        setPreferredSize(getSize());
    }

    public void prepare(){
        setBackground(Color.LIGHT_GRAY);
        setEnabled(true);

    }
    public boolean getIsReady(){
        if(!isEnabled()&&clicked){
            clicked=false;
            return true;
        }
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

            setEnabled(false);
            clicked =true;

            System.out.println("Ready Button Clicked when Ready");
        setBackground(Color.DARK_GRAY);
            
        Main.onwards();



            
    }
}
