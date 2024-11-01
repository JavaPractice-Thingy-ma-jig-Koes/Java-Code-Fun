package Art;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JToolTip;
import javax.swing.border.LineBorder;

import MainFolder.Main;
import characters.playerStats.Player;
import combat.Combat;


public class ClassPicker implements ActionListener{

    private Player player;
    private final String[] classes = {"Fighter","Ranger","Mage"};
    private JInternalFrame iF = new JInternalFrame("Choose a Class");
    private JComboBox chooser = new JComboBox<>(classes);
    private JButton done = new JButton("DONE");
    private JToolTip info = new JToolTip();
    private ConfigureFrame f = new ConfigureFrame(200, 300);
    private Combat initCombat;


    public ClassPicker(Player player) 
    {

        f.setTitle("Choose a Class");

        done.addActionListener(this);
        iF.setBounds(50,50, 200,90);
        chooser.setSelectedIndex(0);
        iF.add(chooser);
        f.add(iF);
        iF.setVisible(true);
        //iF.setLayer(iF, 2);
        iF.requestFocus();

        iF.setBackground(new Color (180,250,190));


        done.setBounds(10,50,50,30);
        done.setVisible(true);
        done.setOpaque(true);

        done.setText("DONE");
        done.setBackground(new Color (120,180,130));
        done.setBorder(new LineBorder (Color.black, 2));

        iF.setBorder(new LineBorder(Color.darkGray,3));

        chooser.setBounds(10,10,130,30);

        iF.setVisible(true);

        this.player= player;
        iF.add(done);

        info.setTipText("Fighters get a sword and shield. Rangers get a bow and armor. Mages get no armor, but dangerous spells.");
        chooser.add(info);
        iF.setLayout(new FlowLayout());
        f.setVisible(true);
        System.out.println("New classPicker initialized");

        }
    


    



    @Override
    public void actionPerformed(ActionEvent e) {
        int x = chooser.getSelectedIndex();
        System.out.println("Class chosen - commencing adventure");
        close();
        Main.commenceAdventure(x);

        }
        

    

    private void close(){
        f.setVisible(false);
        f.dispose();
    }
    
}
