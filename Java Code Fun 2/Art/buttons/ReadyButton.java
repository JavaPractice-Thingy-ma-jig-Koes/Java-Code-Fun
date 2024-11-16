package Art.buttons;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
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
    private ImageIcon current;
    private static final ImageIcon notReady = new ImageIcon("Java Code Fun 2/Art/buttons/notReadyButton.png");
    private static final ImageIcon ready = new ImageIcon("Java Code Fun 2/Art/buttons/readyButton.png");
    private static final Dimension base = new Dimension(ready.getIconWidth(),ready.getIconHeight());
    
        public ReadyButton(Player player){
            super(notReady);
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
    }
    @Override
    public void paintComponent(Graphics g)
    {
        //setIcon(new ImageIcon(current.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH)));

        super.paintComponent(g);
    }

    public void prepare(){
        //setBackground(grayness);
        //paintComponent(getGraphics());
        current = ready;
        setIcon(ready);
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
        //setIcon(new ImageIcon(notReady.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_FAST)));
        current = notReady;
        setIcon(notReady);
        Main.onwards();

    }
}
