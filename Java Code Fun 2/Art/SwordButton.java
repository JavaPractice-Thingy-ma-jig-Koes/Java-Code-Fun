package Art;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.Border;

public class SwordButton implements ActionListener{


    

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
        }
        public JButton getSwordButton()
        {return sword;}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(isGreen)
        sword.setBackground(Color.GREEN);
        else
        sword.setBackground(Color.RED);

        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
