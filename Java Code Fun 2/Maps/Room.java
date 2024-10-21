package maps;

import java.util.HashMap;
import java.util.List;

import misc_tools.RNG;
import monsterStats.Monster;

public class Room {

	private int length;
	private int width;
	private String shape;
    private Monster[] inRoom;

		
	public Room(){

		length = RNG.RIG(1,4);
		width = RNG.RIG(1,4);
	
;
		setShape();		
		
		//DNE yet
		//fillRoom();
		
	}
	
	private void setShape(){
        if (Math.random()>0.85) {

			if(width==length){
				shape = "square";
            }
			else if  (width-1==length){
				shape = "rectangle";
            }
			else if (width-2==length){
			shape = "";
				if (width ==2) {shape = "great";}
				shape += "hall";
            }
            else{
			//DNE yet
			//setOddShape();
            }
			
        }
        else {
            //setOddShape()
        }
			
			
	}

/* 
    private Monster[] fillRoom(){

        if((Math.random()*length>width)){
            Monster[] scaryMonsters = {};

        }
    }
*/
}//class bracket
	/*
Possible Rooms (theory)
AxB
but I want it to be weighted
Also want it to include odd shapes.

Idea to make irregular shapes
If ((width-1)*(length-1)>0) -> remove 1 square
Check if

	*/
