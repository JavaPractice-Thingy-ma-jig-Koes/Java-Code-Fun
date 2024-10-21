package Art.buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.Border;

import playerStats.Player;

public class SwordButton {


    

        private JButton sword = new JButton("Sword");
        private boolean isGreen = false;

        public SwordButton(){
            if(isGreen)
            sword.setBackground(Color.GREEN);
            else
            sword.setBackground(Color.RED);
            sword.setBorder((Border) Color.black);
            sword.setOpaque(true);
            sword.setContentAreaFilled(true);
            sword.setBorderPainted(true);
            sword.setFocusPainted(true);
            sword.setVisible(true);
            sword.setSize(75,40);
        
            sword.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
        
                //Do what you like here after button is clicked, for example:
                System.out.println("Sword Clicked");
                isGreen=true;
                
                

            }
        });
    }
    public SwordButton(BowButton bButton){
        if(isGreen)
        sword.setBackground(Color.GREEN);
        else
        sword.setBackground(Color.RED);
        sword.setBorder((Border) Color.black);
        sword.setOpaque(true);
        sword.setContentAreaFilled(true);
        sword.setBorderPainted(true);
        sword.setFocusPainted(true);
        sword.setVisible(true);
        sword.setSize(75,40);
    
        sword.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
    
            //Do what you like here after button is clicked, for example:
            System.out.println("Sword Clicked");
            isGreen=true;
            bButton.makeRed();
            

        }
    });
}
        public JButton getSwordButton()
        {return sword;}
        public boolean getGreen(){return isGreen;}
        public void makeRed(){isGreen=false;};






    }

