package Art;

public class PrintArt {
    public static final String[] playerArt = {" O ","-|-"," ∏ "};
    

    private static String[] temp;
    public static void printArt(String[] artName){

        temp = artName;

        for(int lineToPrint = 0; lineToPrint < artName.length; lineToPrint++){
            System.out.println(temp[lineToPrint]);
        }
    
    }
}
