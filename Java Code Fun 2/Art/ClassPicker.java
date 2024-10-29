package Art;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JToolTip;
import javax.swing.border.LineBorder;

import characters.playerStats.Player;
import equipment.Tools.Armor;
import equipment.Tools.Bow;
import equipment.Tools.Swords;

public class ClassPicker implements ActionListener{

    private Player player;
    private final String[] classes = {"Fighter","Ranger","Mage"};
    private JInternalFrame iF = new JInternalFrame("Choose a Class", false,false,false);
    private JComboBox classPicker = new JComboBox<>(classes);
    private JButton done = new JButton("DONE");
    private JToolTip info = new JToolTip();



    public ClassPicker(Player player, JFrame f)
    {

        done.addActionListener(this);
        iF.setBounds(f.getWidth()/2,f.getHeight()/2, 90,90);
        classPicker.setSelectedIndex(0);
        iF.add(classPicker);
        f.add(iF);
        iF.setVisible(true);
        //iF.setLayer(iF, 2);
        iF.requestFocus();

        iF.setBackground(new Color (180,250,190));


        done.setBounds(10,50,40,25);
        done.setVisible(true);
        done.setOpaque(true);

        done.setText("DONE");
        done.setBackground(new Color (120,180,130));
        done.setBorder(new LineBorder (Color.black, 2));
        iF.setBorder(new LineBorder(Color.darkGray,3));
        classPicker.setBounds(10,10,60,20);
        iF.setVisible(true);
        this.player= player;
        iF.add(done);
        info.setTipText("Fighters get a sword and shield. Rangers get a bow and armor. Mages get no armor, but dangerous spells.");
        classPicker.add(info);
        iF.setLayout(new BorderLayout());

        try {
            this.wait();
        } catch (Exception e) {
        }
        finally{
            this.notifyAll();

        }

        


    }



    @Override
    public synchronized void actionPerformed(ActionEvent e) {
        switch (classPicker.getSelectedIndex()) {
            case 1:
            player.equip(new Armor("leather armor", 15, 3));
            player.equip(new Bow("longbow", 20, 7));
            player.equip(new Swords ("rusty knife", 0, 1,2));

                break;
            
            case 2:
            player.equip(new Armor ("robes", 10, 0));
            player.equip(new Bow ("magic missile", 30, 8));
            player.equip(new Swords ("acid splash", 25,4,7));
                break;
        
            default:
            player.equip(new Armor ("plate armor", 24, 5));
            player.equip(new Bow ("tattered sling", 0,2));
            player.equip(new Swords ("steel sword", 15, 3, 6));
                break;
        }
        closeMaybe();
        this.notifyAll();

    }

    private void closeMaybe(){
        try {
            iF.setClosed(true);
            System.out.println("Class chosen, internal frame closed");

        } catch (PropertyVetoException e) {

        
            iF.setVisible(false);
            System.out.println("Class chosen, internal frame set invisible");
        }
    }
    
}
