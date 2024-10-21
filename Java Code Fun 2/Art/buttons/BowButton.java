package Art.buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.Border;

import playerStats.Player;

public class BowButton {


    

        private JButton bow = new JButton("Bow");
        private boolean isGreen = false;

        public BowButton(){
            if(isGreen)
            bow.setBackground(Color.GREEN);
            else
            bow.setBackground(Color.RED);
            bow.setBorder((Border) Color.black);
            bow.setOpaque(true);
            bow.setContentAreaFilled(true);
            bow.setBorderPainted(true);
            bow.setFocusPainted(true);
            bow.setVisible(true);
            bow.setSize(75,40);
        
            bow.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
        
                //Do what you like here after button is clicked, for example:
                System.out.println("Bow Clicked");
                isGreen=true;
                
                

            }
        });
    }
    public BowButton(SwordButton sButton){
        if(isGreen)
        bow.setBackground(Color.GREEN);
        else
        bow.setBackground(Color.RED);
        bow.setBorder((Border) Color.black);
        bow.setOpaque(true);
        bow.setContentAreaFilled(true);
        bow.setBorderPainted(true);
        bow.setFocusPainted(true);
        bow.setVisible(true);
        bow.setSize(75,40);
    
        bow.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
    
            //Do what you like here after button is clicked, for example:
            System.out.println("Bow Clicked");
            isGreen=true;
            sButton.makeRed();
            
            

        }
    });
}
        public JButton getBowButton()
        {return bow;}
        public boolean getGreen(){return isGreen;}
        public void makeRed(){isGreen=false;};





    }

