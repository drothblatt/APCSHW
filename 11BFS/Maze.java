import java.util.*;
import java.io.*;

public class Maze{
    
    private static final String clear =  "\033[2J";
    private static final String hide =  "\033[?25l";
    private static final String show =  "\033[?25h";

    private String go(int x,int y){
	return ("\033[" + x + ";" + y + "H");
    }

    private char[][]maze;
    private int maxx,maxy;
    private int startx,starty;

    private class Node{
	private int r; // row
	private int c; // column
	private int d; // distance from starting spot
	private Node prev; // last spot
	
	public Node(int row, int col, int dist, Node last){
	    r = row;
	    c = col;
	    prev = last;
	    d = dist;
	}
	
	public Node(int row, int col, Node last){
	    r = row;
	    c = col; 
	    prev = last;
	    d = last.getDist();
	}
	    
	public int getRow(){
	    return r;
	}
	public int getCol(){
	    return c;
	}
	public int getDist(){
	    return d; 
	}
	public Node getPrev(){
	    return prev;
	}
    }


    public Maze(String filename){
	startx = -1;
	starty = -1;
	String ans = "";
	try{
	    Scanner in = new Scanner(new File(filename));

	    //keep reading next line
	    while(in.hasNext()){
		String line= in.nextLine();
		if(maxy==0){
		    //calculate width of the maze
		    maxx=line.length();
		}
		//every new line add 1 to the height of the maze
		maxy++;
		ans+=line;
	    }
	}
	catch(Exception e){
	    System.out.println("File: "+filename+" could not be opened.");
	    e.printStackTrace();
	    System.exit(0);
	}

	maze = new char[maxx][maxy];
	for(int i=0;i<ans.length();i++){
	    char c = ans.charAt(i);
	    maze[i%maxx][i/maxx]= c;
	    if(c=='S'){
		startx = i%maxx;
		starty = i/maxx;
	    }
	}
    }

    public void clearTerminal(){
	System.out.println(clear);
    }

    public void wait(int millis){
	try {
	    Thread.sleep(millis);
	}
	catch (InterruptedException e) {
	}
    }


    public String toString(boolean animate){
	if (animate){
	    return clear+hide+go(0,0)+toString()+"\n"+show;
	} else {
	    return toString();
	}
    }
    
    public String toString(){
	String ans = "\nMaze:\n";
	for(int i=0;i<maxx*maxy;i++){
	    if(i%maxx ==0 && i!=0){
		ans+="\n";
	    }
	    ans += maze[i%maxx][i/maxx];
	}
	return ans;
    }


    public boolean solveBFS(boolean animate){
	return solve(animate, 0);
    }

    public boolean solveDFS(boolean animate){
	return solve(animate, 1);
    }

    public boolean solve(boolean animate, int mode){
	Frontier nexts = new Frontier(mode);
	return true;
    }








    public static void main(String[]args){
        Maze a = new Maze("data3.dat");
	System.out.println(a.toString(false));
	
    }
   




}
