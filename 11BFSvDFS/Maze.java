import java.util.*;
import java.io.*;

public class Maze{
    
    private static final String clear =  "\033[2J";
    private static final String hide =  "\033[?25l";
    private static final String show =  "\033[?25h";
    private static final String invert = "\033[37";

    private String go(int x,int y){
	return ("\033[" + x + ";" + y + "H");
    }

    private char[][]maze;
    private int maxx,maxy;
    private int startx,starty,endx,endy;
    private Node start, sol;
    private boolean solvable = true;

    private class Node{
	private int r; // row
	private int c; // column
	private int dFrom; // distance from starting spot
	private Node prev; // last spot

	private Node(int row, int col){
	    r = row;
	    c = col;
	    dFrom = 0;
	    prev = null;
	}
	
	private Node(int row, int col, int dist, Node last){
	    r = row;
	    c = col;
	    prev = last;
	    dFrom = dist;
	}
	
	private Node(int row, int col, Node last){
	    r = row;
	    c = col; 
	    prev = last;
	    dFrom = last.getDFrom();
	}
	    
	private int getRow(){
	    return r;
	}
	private int getCol(){
	    return c;
	}
	private int getDFrom(){
	    return dFrom; 
	}
	private int getDTo(){
	    return Math.abs(endx - this.getRow()) + Math.abs(endy - this.getCol()); // delta x + delta y
	}
	private Node getPrev(){
	    return prev;
	}
	public String toString(){
	    return "(" + r + ", " + c + ")";
	}
    }

    private class Frontier{
	private int m;
	private MyDeque<Node> d = new MyDeque<Node>(15);

	private Frontier(int mode){
	    m = mode;
	}
	private void add(Node loc){
	    if (m == 0) d.addLast(loc);  // Breadth First Search
	    if (m == 1) d.addFirst(loc); // Depth First Search
	    if (m == 2)	d.add(loc, loc.getDTo() );  // Best First Search 
	    if (m == 3) d.add(loc, loc.getDTo() + loc.getDFrom() );  // A*
	}
	
	private Node remove(){
	    if (m == 2 || m == 3){
		return d.removeSmallest();
	    } 
	    return d.removeFirst();
	    
	}

	private int size(){
	    return d.size();
	}	

	public String toString(){
	    return d.toString();
	}
    }


    public Maze(String filename){
	startx = -1;
	starty = -1;
	endx = -1;
	endy = -1;
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
	    } if (c == 'E'){
		endx = i%maxx;
		endy = i/maxx;
	    }
	}
	start = new Node(startx, starty);
    }

    public String name(){
	return "rothblatt.david";
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
	    return toString() + "\n";
	}
    }
    
    public String toString(){
	String ans = "\nMaze:\n\n";
	for(int i=0;i<maxx*maxy;i++){
	    if(i%maxx ==0 && i!=0){
		ans+="\n";
	    }
	    ans += maze[i%maxx][i/maxx];
	}
	return ans;
    }

    public boolean solveBFS(){
	return solveBFS(false);
    }

    public boolean solveDFS(){
	return solveDFS(false);
    }

    public boolean solveBest(){
	return solveBest(false);
    }

    public boolean solveAStar(){
	return solveAStar(false);
    }

    public boolean solveBFS(boolean animate){
	return solve(animate, 0);
    }

    public boolean solveDFS(boolean animate){
	return solve(animate, 1);
    }

    public boolean solveBest(boolean animate){
	return solve(animate, 2);
    }

    public boolean solveAStar(boolean animate){
	return solve(animate, 3);
    }

    private boolean solve(boolean animate, int mode){
	Frontier nexts = new Frontier(mode);
	boolean solFound = false;
	boolean noSol = false;
	nexts.add(start);
	while(!solFound){
	    if( nexts.size() == 0 ){
		System.out.println( toString(animate) + "\nNo Solution Found\n" );
		return false;
	    } else if ( findE(nexts, animate) ){
	        solFound = true;
	    }
	}
	    
	if (solFound){
	    Node bt = sol.getPrev();
	    while (bt.getDFrom() > 0){
		if (animate){
		    System.out.println(toString(animate));
		    wait(40);
		}
		maze[bt.getRow()][bt.getCol()] = '@';
		bt = bt.getPrev();
	    }   
	    System.out.println(toString(animate));
	    return true;
	} 
	return false;
    }

    private boolean findE(Frontier a, boolean animate){
	if (animate){
	    System.out.println(toString(animate));
	    wait(70);
	}
	Node p = a.remove();
	System.out.println(p + " " + p.getDTo());
	if (maze[p.getRow()][p.getCol()] == 'E'){
	    sol = p; 
	    return true;
	} 
	if (maze[p.getRow()][p.getCol()] == ' ' || maze[p.getRow()][p.getCol()] == 'S'){
	    if ( maze[p.getRow()][p.getCol()] == ' ' ){
		maze[p.getRow()][p.getCol()] = 'x';
	    }

	    if ( maze[p.getRow()+1][p.getCol()] == ' ' || maze[p.getRow()+1][p.getCol()] == 'E' ){
		a.add(new Node(p.getRow()+1, p.getCol(), p.getDFrom()+1, p));
	    }

	    if ( maze[p.getRow()-1][p.getCol()] == ' ' || maze[p.getRow()-1][p.getCol()] == 'E'){
		a.add(new Node(p.getRow()-1, p.getCol(), p.getDFrom()+1, p));
	    }
	    if ( maze[p.getRow()][p.getCol()+1] == ' ' || maze[p.getRow()][p.getCol()+1] == 'E' ){
		a.add(new Node(p.getRow(), p.getCol()+1, p.getDFrom()+1, p)); 
	    }
	    if ( maze[p.getRow()][p.getCol()-1] == ' ' || maze[p.getRow()][p.getCol()-1] == 'E'){
		a.add(new Node(p.getRow(), p.getCol()-1, p.getDFrom()+1, p)); 
	    }
	}
	return false;
    }	    

    public int[] solutionCoordinates(){ 
	if (sol == null){
	    return new int[0];
	}
	int[] retA = new int[(sol.getDFrom()+1)*2];
	Node current = sol;
	for (int i = (sol.getDFrom()+1)*2-1; i >= 0; i-=2 ){
	    retA[i] = current.getCol();
	    retA[i-1] = current.getRow();
	    current = current.getPrev();
	}
	return retA;
    } 

   
    // To-do List...
    // DONE

}
