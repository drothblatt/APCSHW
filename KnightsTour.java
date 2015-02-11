

import java.util.*;
import java.io.*;


public class KnightsTour{
    //constants for the class
    //terminal specific character to clear screen , or hide/show cursor
    final static String clear =  "\033[2J";
    final static String hide =  "\033[?25l";
    final static String show =  "\033[?25h";

    //instance variable
    private int[][]board;


    //terminal specific character to move the cursor
    private String go(int x,int y){
	return ("\033[" + x + ";" + y + "H");
    }
 
    public void wait(int millis){
	try {
	    Thread.sleep(millis);
	}
	catch (InterruptedException e) {
	}
    }

    public String toString(){
	String ans = "\n";
	//build your knights tour here...
	return hide + go(0,0) + ans + "\n" + show;
    }

    public KnightsTour(int size){
	board = new int[size][size];
	for (int i = 0; i < board.length; i++){
	    for (int j = 0; j < board.length; j++){
		board[i][j] = -1;
	    }
	}
    }

    public void solve(){ // same algo both ways 
	
    }


    public void solve(int startx, int starty){ // same algo both ways 
				
    }



		
    public boolean solve(int x,int y,int currentMoveNumber){
	System.out.println(this); // take out later
	wait(20); // take out later
				
	return false;
    }


}