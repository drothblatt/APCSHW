import java.util.*;
import java.io.*;
public class CowTravelling{
    private int N, M, T;
    private char[][] field;
    private int R1, C1, R2, C2; 

    public CowTravelling(String filename){
	try{
	    Scanner in = new Scanner(new File(filename));
	    N = in.nextInt();
	    M = in.nextInt();
	    T = in.nextInt();
	    field = new char[N][M];
	    for (int i = 0; i < N; i++){
		String thisRow = in.nextLine();
		for (int j = 0; j < M; j++){
		    pasture[i][j] = thisRow.charAt(j);
		}
	    }
	    R1 = in.nextInt();
	    C1 = in.nextInt();
	    R2 = in.nextInt();
	    C2 = in.nextInt();
	}
	catch(Exception e){
	    System.out.println("File: "+filename+" could not be opened.");
	    e.printStackTrace();
	    System.exit(0);
	}
    }
    
    public int moveCow(){}



}
