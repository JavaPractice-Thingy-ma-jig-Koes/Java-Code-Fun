package misc_tools;

/**@see returns a random integer between the min and max, inclusive */
public class RNG{
    public static int RIG(int min, int max){
		return (min + (int)(Math.random() * ((max - min) + 1)));
    }
}