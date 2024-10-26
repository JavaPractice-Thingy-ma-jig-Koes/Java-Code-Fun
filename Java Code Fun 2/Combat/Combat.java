package combat;

import java.util.Scanner;

import combat.damagePlus.Damage;
import monsterStats.*;
import misc_tools.FunnyText;
import playerStats.Player;

public class Combat {

    private static String action;
    
    public static void fight(Player player, Monster enemy) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        while(player.getPlayerHealthPoints()>0&&enemy.getMonsterHealthPoints()>0){
            Damage mDmg = enemy.attack();
            FunnyText.println("The enemy hits you with a "+enemy.getLastAttack()+".","red");
            FunnyText.println("Do you want to do a RANGED or MELEE attack?","blue");
            while(true){
            action=sc.nextLine();
            if(action.toLowerCase().equals("ranged")){
            player.swordAttack();
            break;}
            else if(action.toLowerCase().equals("melee")){
            player.bowAttack();
            break;}
            else FunnyText.println("Please enter RANGED or MELEE.","black");
            }
            FunnyText.println("You hit the enemy with a "+action.toLowerCase()+" attack.");
        }
    }
    
}
