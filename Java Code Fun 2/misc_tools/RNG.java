package misc_tools;

/**@see returns a random integer between the min and max, inclusive */
public class RNG{
    public static int RIG(int min, int max){
		return (min + (int)(Math.random() * ((max - min) + 1)));
    }
/**@see returns a random boolean (true/false) */

    public static boolean RBG(){
      if(Math.random()>=0.5){
        return true;
      }
      else {return false;}
    }
/**@see returns a random double between the min and max, inclusive */

    public static double RDG(double min, double max){
      return (min + (Math.random() * ((max - min) + 1)));
    }

}