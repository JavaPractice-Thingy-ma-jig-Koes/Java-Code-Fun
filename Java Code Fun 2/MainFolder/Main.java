package mainFolder;

import Combat.Combat;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Art.PrintArt;
import Art.SwordButton;
import Equipment.Tools.Swords;
import MonsterStats.Preset_Monsters.Dragon;
import misc_tools.*;
import playerStats.Player;
import playerStats.SeeInventory;

public class Main
{
    public static void main(String[] args) throws Exception{




//need to use buffered reader instead of scanner

        playerStats.Player p1 = new Player();

    JFrame frame = new JFrame("Java Code Fun");
    JPanel panel = new JPanel();
    JLabel player = new JLabel("Player");
    JLabel enemy = new JLabel("Enemy");


        //Thread x = new Thread(new SeeInventory());
        //x.start();
        //Dragon e1 = new Dragon(1);
        PrintArt a = new PrintArt();
        frame.add(a);
        frame.setSize(600,600);

        frame.setVisible(true);
        SwordButton sword = new SwordButton();
        sword.getSwordButton().setVisible(true);

        //Combat.fight(p1,e1);
        
        
    }
}