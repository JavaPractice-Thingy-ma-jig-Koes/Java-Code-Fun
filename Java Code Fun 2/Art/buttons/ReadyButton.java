package Art.buttons;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import MainFolder.Main;
import characters.playerStats.Player;

public class ReadyButton extends BaseButton implements ActionListener {
    

    private boolean clicked =false;
    private Player player;
    private static final Color grayness = new Color(184,181,194);
    private static final ImageIcon notReady = new ImageIcon("Java-Code-Fun/Java Code Fun 2/Art/buttons/notReadyButton.png");
    private static final ImageIcon ready = new ImageIcon("Java-Code-Fun/Java Code Fun 2/Art/buttons/readyButton.png");
    
    
        public ReadyButton(Player player){
            super(notReady);
            //super("Ready",new Color(140,140,140));
        setPreferredSize(new Dimension(80,30));
        this.player=player;
        setOpaque(true);

        addActionListener(this);
        //setBorder(new LineBorder(Color.black,3, true) );
        //setBackground(grayness);
        setPreferredSize(getSize());
    }

    public void prepare(){
        //setBackground(grayness);
        //paintComponent(getGraphics());
        setIcon(new ImageIcon(ready.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_FAST)));
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
        //setBackground(new Color(50,50,60));
        setIcon(new ImageIcon(notReady.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_FAST)));

        Main.onwards();

    }
}
