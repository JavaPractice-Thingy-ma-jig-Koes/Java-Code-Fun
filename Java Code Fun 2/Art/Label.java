package Art;

import javax.swing.JLabel;

public class Label extends JLabel {
    
    public Label(String string) {
        super(string);
    }

    public void print(String info){
        /** @param info the text to slowly be printed */


        for(int length = info.length();length>0;length--){
            setText(getText()+info.substring(info.length()-length,info.length()-length+1));
            try {
                Thread.sleep(75);
            } catch (Exception e) {
                System.err.println("Error in waiting to set label text");
            }
            

        }
    }
    public void clear(){
        setText("");
    }
}
