import java.util.*;
import java.io.*;

public class Driver{

    public static void main(String[]args){
        Maze a = new Maze("data1.dat");
        Maze b = new Maze("data2.dat");
        Maze c = new Maze("data3.dat");
	// BFS w/ animation
        //a.solveBFS(true);
	//b.solveBFS(true);
	c.solveBFS(true);
	// BFS w/out animation
	//a.solveBFS(false);
	//b.solveBFS(false);
	//c.solveBFS(false);
	// DFS w/ animation
	//a.solveDFS(true);
	//b.solveDFS(true);
	//c.solveDFS(true);
	// DFS w/out animation
	//a.solveDFS(false);
	//b.solveDFS(false);
	//c.solveDFS(false);
	System.out.println("\n" + Arrays.toString(c.solutionCoordinates()) + "\n" );

    }

}
