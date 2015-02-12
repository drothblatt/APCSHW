import java.util.*;
import java.lang.Math;

public class Maze{
    private char[][] maze;
    
    public Maze(int r, int c){
	maze = new char[r][c];
    }
    
    public Maze(int s){
	maze = new char[s][s];
    }

    public Maze(){
	maze = new char[7][7];
    }

    public void setUp(){
	int Sx,Sy,Ex,Ey;
	boolean sYes, eYes;
	sYes = false; 
	eYes = false;
	Random r = new Random();
	for (int i = 0; i < maze.length; i++){
	    for (int j = 0; j < maze[0].length; j++){
		if (i == 0 || i == maze.length-1 || 
		    j == 0 || j == maze[0].length-1 || r.nextDouble() < 0.35 ) {
		    maze[i][j] = 'x';
		} else{
		    maze[i][j] = ' ';
		}
	    }
	}
	Sx = 0;
	Sy = 0;
	Ex = 0;
	Ey = 0;
	while (!sYes){
	    Sx = r.nextInt(maze.length-2) + 1;
	    Sy = r.nextInt(maze[0].length-2) + 1;
	    if (maze[Sx][Sy] == ' '){
		maze[Sx][Sy] = 'S';
		sYes = true;
	    }
	}

	while (!eYes){
	    Ex = r.nextInt(maze.length-2) + 1;
	    Ey = r.nextInt(maze[0].length-2) + 1;
	    if (maze[Ex][Ey] == ' '
		&& Math.abs(Ex - Sx) > 1 && Math.abs(Ey-Sy) > 1){
		maze[Ex][Ey] = 'E';
		eYes = true;
	    }
	}
    }


    public char[][] solveM(){
	int x, y;
	x = 0;
	y = 0;
	for (int i = 0; i < maze.length; i++){
	    for (int j = 0; j < maze[0].length; j++){
		if (maze[i][j] == 'S'){
		    x = j;
		    y = i; 
		}
	    }
	}
	char[][] mazeC = Arrays.copyOf(maze, maze.length);

	System.out.println("(" + x + ", " + y + ")"); 
	return solver(mazeC, x, y);
    }

    public char[][] solver(char[][] m, int x, int y){
	return maze;
    }


    public String toString(){
	String retStr = "";
	for (int i = 0; i < maze.length; i++){
	    for (int j = 0; j < maze[0].length; j++){
		retStr += maze[i][j] + " ";
	    }
	    retStr += "\n";
	}
	return retStr;
    }

    public static void main(String[]args){
	Maze m = new Maze(7, 6);
	m.setUp();
	System.out.println(m + "\n");
	m.solveM();
    }
		
}
