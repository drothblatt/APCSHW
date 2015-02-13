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
	String ans = "\n\n\n";
	//build your knights tour here...
	for (int i = 0; i < board.length; i++){
	    for (int j = 0; j < board.length; j++){
		ans += board[i][j] + " ";
	    }
	    ans += "\n";
	}
	//return ans;
        return hide + clear + go(0,0) + ans + "\n" + show;
    }

    public KnightsTour(int size){
	board = new int[size][size];
    }

    public String name(){
	return "Rothblatt,David";
    }

    public boolean solve(){ // same algo both ways 
	return solve(0,0,1);
    }


    public boolean solve(int startx, int starty){ // same algo both ways 
	return solve(startx, starty, 1);			
    }



		
    public boolean solve(int x,int y,int currentMoveNumber){
	//System.out.println(this); // take out later
	//wait(1); // take out later
	
	if ( x < 0 || x >= board.length || y < 0
	     || y >= board[0].length) {
	    return false;
	
	}

	if (currentMoveNumber > board.length*board[0].length) {
	    board[x][y] = currentMoveNumber;
	    return true;
	}
	
	if ( board[x][y] == 0 ) {
	    board[x][y] = currentMoveNumber;
	    if (solve(x+1,y+2,currentMoveNumber+1) ||
		    solve(x+1,y-2,currentMoveNumber+1) ||
		    solve(x-1,y+2,currentMoveNumber+1) ||
		    solve(x-1,y-2,currentMoveNumber+1) ||
		    solve(x+2,y+1,currentMoveNumber+1) ||
		    solve(x+2,y-1,currentMoveNumber+1) ||
		    solve(x-2,y+1,currentMoveNumber+1) ||
		    solve(x-2,y-1,currentMoveNumber+1)
		){
		return true;
	    }
	    board[x][y] = 0;
	}
	return false;
    }

    public static void main(String[]args){
	KnightsTour kt = new KnightsTour(5);
	if (args.length > 0){
	    try{
		kt = new KnightsTour(Integer.parseInt(args[0]));
	    } catch(IllegalArgumentException e){
		System.out.println("You goofed. Redo");
	    }
	} 

	if (kt.solve()){
	    System.out.println(kt);
	} else {
	    System.out.println("No Solution");
	}
    }
}
