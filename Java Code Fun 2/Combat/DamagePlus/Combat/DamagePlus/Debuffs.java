package Combat.DamagePlus;
import java.util.Arrays;
public class Debuffs {
    
    private int[] debuffs;
/**@param requires in order ac reduct, steal, hpmax reduct */
    public Debuffs(int[] debuffs){
        this.debuffs=Arrays.copyOf(debuffs,3);
    }
    public int getacreduct(){
        return debuffs[0];
    }
    public int getStealing(){
        return debuffs[1];
    }
    public int getHpMaxReduct(){
        return debuffs[2];
    }
}
