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
	for (int i = 0; i < board.length; i++){
	    for (int j = 0; j < board.length; j++){
		ans += board[i][j] + "  ";
	    }
	    ans += "\n";
	}
	return ans; 
        //return hide + clear + go(0,0) + ans + "\n" + show;
    }

    public KnightsTour(int size){
	board = new int[size][size];
	for (int i = 0; i < board.length; i++){
	    for (int j = 0; j < board.length; j++){
		board[i][j] = 0;
	    }
	}
    }

    public boolean solve(){ // same algo both ways 
	return solve(0,0,1);
    }


    public boolean solve(int startx, int starty){ // same algo both ways 
	return solve(startx, starty, 1);			
    }



		
    public boolean solve(int x,int y,int currentMoveNumber){
	System.out.println(this); // take out later
	wait(20); // take out later
	
	if ( x < 0 || x >= board.length || y < 0
	     || y >= board[0].length) {
	    return false;
	
	}

	if (currentMoveNumber == board.length*board[0].length) {
	    return true;
	}
	
	if ( board[x][y] == 0 ) {
	    board[x][y] = currentMoveNumber;
	    if (solve(x+1,y+2,currentMoveNumber++) ||
		    solve(x+1,y-2,currentMoveNumber++) ||
		    solve(x-1,y+2,currentMoveNumber++) ||
		    solve(x-1,y-2,currentMoveNumber++) ||
		    solve(x+2,y+1,currentMoveNumber++) ||
		    solve(x+2,y-1,currentMoveNumber++) ||
		    solve(x-2,y+1,currentMoveNumber++) ||
		    solve(x-2,y-1,currentMoveNumber++)
		){
		return true;
	    }
	    board[x][y] = 0;
	}
	return false;
    }

    public static void main(String[]args){
	/*
	KnightsTour[] KTs= new KnightsTour[5];
	for (int i = 0; i < 5; i++){
	    KTs[i] = new KnightsTour(i+1);
	}
	*/
 

	KnightsTour kt5 = new KnightsTour(5);
	if (kt5.solve()){
	    System.out.println(kt5);
	} else {
	    System.out.println("No Solution");
	}
    }
}
