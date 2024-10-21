package Art;

import Art.buttons.BowButton;
import Art.buttons.SwordButton;
import javax.swing.*;

public class GeneralGUI {
    
    public GeneralGUI(){
        SwordButton sB = new SwordButton();
        JButton swButton = sB.getSwordButton();
        BowButton bB = new BowButton();
        JButton boButton = bB.getBowButton();
        ConfigureFrame f = new ConfigureFrame(500,500,swButton,boButton);
        



    }
}
