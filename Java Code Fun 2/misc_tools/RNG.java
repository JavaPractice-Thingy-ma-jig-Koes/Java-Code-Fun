package misc_tools;

/**@return a random integer between the min and max, inclusive */
public class RNG{
    public static int RIG(int min, int max){
		return (min + (int)(Math.random() * ((max - min) + 1)));
    }
/**@return a random boolean (true/false) */

    public static boolean RBG(){
      if(Math.random()<0.5)
        return true;
      return false;
    }
    public static boolean WBG(double percentTrue){
      while(percentTrue>1)percentTrue/=10;
      if(percentTrue<Math.random()) return true;
      return false;
    }
/**@return a random double between the min and max, inclusive */

    public static double RDG(double min, double max){
      return (min + (Math.random() * ((max - min) + 1)));
    }
/**@return returns a not so random double based off of the supplied weighted values 
 *  the returned value is the index of the weighted chance
 * @param weights the double[] should contain chances of outcomes to occur 
 * @param weights for example, {1,4,5} would give a 10% chance for 0, 40% chance for 1, and 50% chance for 2.
 * @exception invalid if something messes up somehow and no weighted value works, the method returns -1, this could happen if weights was all 0s
*/
    public static int WIG(double[] weights){
      double weightedRange = 0;
      for(int i = 0; i < weights.length;i++) weightedRange+=weights[i];
      //sums the chances
      double random = Math.random()*weightedRange;
      for(int i1=0;i1< weights.length; i1++){
        if(random<weights[i1]) return i1;
        random-=weights[i1];
      }

      return -1;
    }

}