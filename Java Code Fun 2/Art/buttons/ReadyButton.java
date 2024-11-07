package Art.buttons;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import MainFolder.Main;
import characters.playerStats.Player;

public class ReadyButton extends BaseButton implements ActionListener {
    

    private boolean clicked =false;
    private Player player;
    private static final Color grayness = new Color(184,181,194);
    
    
        public ReadyButton(Player player){
            super("Ready",new Color(140,140,140));
        setPreferredSize(new Dimension(80,30));
        this.player=player;
        setOpaque(true);

        addActionListener(this);
        setBorder(new LineBorder(Color.black,3, true) );
        setBackground(grayness);
        setPreferredSize(getSize());
    }

    public void prepare(){
        //setBackground(grayness);
        paintComponent(getGraphics());
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
        setBackground(new Color(50,50,60));

            
        Main.onwards();



            
    }
}
