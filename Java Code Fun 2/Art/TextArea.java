package Art;

import javax.swing.JTextArea;

public class TextArea extends JTextArea {


    
    public TextArea(String txt){
        super(txt);

        this.setEditable(false);


    }

    public void print(String info){
        /** @param info the text to slowly be printed */


        for(int length = info.length();length>0;length--){
            
            setText(getText()+info.substring(info.length()-length,info.length()-length+1));
            if(getText().length()>60){setAutoscrolls(true);}
            else{setAutoscrolls(false);}
            try {
                Thread.sleep(75);
            } catch (Exception e) {
                System.out.println("Error in waiting to set label text");
            }
            

        }
    }
    public void println(String info){
        print(info);
        enter();
    }
    public void clear(){
        setText("");

    }
    public void enter(){

        setText(getText()+"\n");

    }
}
