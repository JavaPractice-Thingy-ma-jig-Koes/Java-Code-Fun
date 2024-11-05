package Art;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JToolTip;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;

import Art.buttons.BaseButton;
import MainFolder.Main;




public class ClassPicker implements ActionListener{

    private static JTabbedPane aframe;
    private static final String[] classes = {"Fighter","Ranger","Mage"};
    private static JPanel p = new JPanel();
    private static JPanel iF = new JPanel();
    private static final JComboBox<String> chooser = new JComboBox<>(classes);
    private static BaseButton done = new BaseButton("DONE");
    private static JToolTip info = new JToolTip();




    public static void chooseClass(JTabbedPane frame) 
    {
        aframe=frame;
        frame.addTab("Class Chooser",iF);
        aframe.setSelectedIndex(aframe.indexOfTab("Class Chooser"));

        iF.add(p);
        
        //iF.setTitle("Choose a Class");

        done.addActionListener(new ClassPicker());
        iF.setBounds(50,50, 200,190);
        chooser.setSelectedIndex(0);
        

        iF.setVisible(true);

        p.requestFocus();

        p.setBackground(new Color (180,250,190));


        done.setBounds(10,50,50,30);
        done.setVisible(true);
        done.setOpaque(true);

        done.setText("DONE");
        done.setFont(new Font(Font.SANS_SERIF,Font.ROMAN_BASELINE,20));
        done.setBackground(new Color (120,180,130));
        done.setBorder(new LineBorder (Color.black, 2));

        p.setBorder(new LineBorder(Color.darkGray,3));

        chooser.setBounds(10,10,130,30);

        p.setVisible(true);

        p.setLayout(new GridLayout(4,2));
        p.add(chooser);
        p.add(done);
        //iF.toFront();


        info.setTipText("Fighters get a sword and shield. Rangers get a bow and armor. Mages get no armor, but dangerous spells.");
        info.setBackground(new Color(242,255,248));
        info.setFont(new Font("Roman",Font.ITALIC,13));
        chooser.setFont(new Font(Font.SERIF,Font.PLAIN, 18));
        chooser.add(info);
        //iF.pack();
        iF.setVisible(true);
        
        System.out.println("New classPicker initialized");

        }
    


    



    @Override
    public void actionPerformed(ActionEvent e) {
        done.setEnabled(false);
        int x = chooser.getSelectedIndex();
        System.out.println("Class chosen - commencing adventure");
        System.out.println("The player chose to be a "+classes[x]);
        close();

        Main.commenceAdventure(x);

        }
        

    

    private void close(){
        iF.setVisible(false);
        aframe.removeTabAt(aframe.indexOfTab("Class Chooser"));
        //iF.dispose();
    }
    
}
