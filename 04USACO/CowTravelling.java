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

    public String toString(){ 
	String ans = "\n";
	for (int i = 0; i < field.length; i++){
	    for (int j = 0; c < field[0].length; j++){
		if (i == R1 && j == C1){
		    ans += "S ";
		} else if ( i == R2 && j == C2){
		    ans += "E ";
		} else{
		    ans += map[r][c] + " ";
		}
	    }
	    ans += "\n";
	}
	return ans;
    }

    
    public int moveCow(){
	return moveCowH(C1, R1, 0);
    }

    public int moveCowH(int c, int r, int t){
	// checking to make sure we're in bounds...
	if (  c < 0  || r < 0  || c >= field[0].length || r >= field.length  ){
	    return 0;
	}
	// if you hit a tree, this way is not possible...
	if (field[r][c] == '*'){
	    return 0;
	}
	// when you get to the right time, evaluate location...
	if (t == T){
	    if (r == R2 && c == C2){
		return 1;
	    } else{
		return 0;
	    }
	}
	// if you're not there yet and you're not stuck, keep moving... !
	// recursion !
	return travel(x+1, y, t+1) + travel(x-1, y, t+1) +
	       travel(x, y+1, t+1) + travel(x, y+1, t+1);
    }
    
    public static void main(String[]args){
	CowTravelling moo = new CowTravelling("cow1.txt");
	System.out.println(moo + "\n\nPossibleWays: " + moo.moveCow());
	// should work

}
