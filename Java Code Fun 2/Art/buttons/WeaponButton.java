package Art.buttons;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

import characters.playerStats.Player;

public class WeaponButton extends JButton {


    
        private boolean bowOrSword = false;
        private JButton weapon = new JButton();
        private boolean isGreen = false;

        public WeaponButton(){

            weapon.setBorder( BorderFactory.createBevelBorder(4, Color.BLACK,Color.BLACK));
            initButtSettings();
            weapon.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
        
                //Do what you like here after button is clicked, for example:
                System.out.println("Bow Clicked");
                isGreen=true;
                weapon.setBackground(Color.GREEN);
                
                

            }
        });
    }
    public WeaponButton(String title){

        weapon.setBorder( BorderFactory.createBevelBorder(4, Color.BLACK,Color.BLACK));
        initButtSettings();
        weapon.setText(title);
        weapon.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
    
            //Do what you like here after button is clicked, for example:
            System.out.println("Bow Clicked");
            isGreen=!isGreen;
            setGreen();

        }
    });
}

    



        public JButton getWeaponButton()
        {return weapon;}
        public boolean getGreen(){return isGreen;}
        public void makeRed(){isGreen=false;weapon.setBackground(Color.RED);};
        public void setGreen(){
            if(isGreen)
            weapon.setBackground(Color.GREEN);
            else
            weapon.setBackground(Color.RED);
        }
        public void initButtSettings(){
            weapon.setOpaque(true);
            //weapon.setContentAreaFilled(true);
            //weapon.setBorderPainted(true);
            //weapon.setFocusPainted(true);
            weapon.setVisible(true);
            weapon.setFocusable(false);

            //weapon.setMaximumSize( new Dimension(90,90) );
            //weapon.setBorder( BorderFactory.createBevelBorder(4, Color.BLACK,Color.BLACK));
            //weapon.setMinimumSize(new Dimension(10,10));
            //weapon.setSize(75,40);
        }

        }
    






    

