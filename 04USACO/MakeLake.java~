import java.util.*;
import java.io.*;

public class makelake{
    private int R, C, E, N;
    private int[][] pasture;
    private int[][] stomp;
    

    public makelake(String filename){
	try{
	    Scanner in = new Scanner(new File(filename));
	    R = in.nextInt();
	    C = in.nextInt();
	    E = in.nextInt();
	    N = in.nextInt();
	    pasture = new int[R][C];
	    for (int i = 0; i < R; i++){
		for (int j = 0; j < C; j++){
		    pasture[i][j] = in.nextInt();
		}
	    }
	    stomp = new int[N][3];
	    for (int i = 0; i < N; i++){
		for (int j = 0; j < 3; j++){
		    stomp[i][j] = in.nextInt();
		}
	    }
	}
	catch(Exception e){
	    System.out.println("File: "+filename+" could not be opened.");
	    e.printStackTrace();
	    System.exit(0);
	}
    }

    public void stomping(int[][] x){
	int R_s, C_s, D_s;
	for (int i = 0; i < x.length; i++){
	    R_s = x[i][0];
	    C_s = x[i][1];
	    D_s = x[i][2];
	    int target = getTarget(D_s,R_s,C_s);
	    for (int r = R_s-1; r < R_s +2; r++){
		for (int c = C_s-1; c < C_s +2; c++){
		    if (pasture[r][c] > target){
			pasture[r][c] = target;
		    }
		}

	    }
	}
    }

    public int getTarget(int D_s, int R_s, int C_s){
	return maxNum(R_s, C_s) - D_s;
    }

    public int maxNum(int R_s, int C_s){
	int max = 0; 
	for (int r = R_s-1; r < R_s + 2; r++){
	    for (int c = C_s-1; c < C_s + 2; c++){
		if (pasture[r][c] > max){
		    max = pasture[r][c];
		}
	    }
	}
	return max;
    }

    public int getVolume(){
	int total = 0;
	stomping(stomp);
	for (int r = 0; r < pasture.length; r++){
	    for (int c = 0; c < pasture[0].length; c++){
		if (E - pasture[r][c] > 0) {
		    pasture[r][c] = E - pasture[r][c];
		    total += pasture[r][c];
		}
	    }
	}
	return total*72*72;
    }

    public String pString(){
	String ans = "";
	for (int i = 0; i < pasture.length; i++){
	    for (int j = 0; j < pasture[0].length; j++){
		ans += " " + pasture[i][j] + " ";
	    }
	    ans += "\n";
	}
	return ans;
    }

    public String bString(){
	return " "+ R + " " + C + " "+ E + " " + N + "\n";
    }
    
    public String sString(){
	String ans = "";
	for (int i = 0; i < stomp.length; i++){
	    for (int j = 0; j < stomp[0].length; j++){
		ans += " " + stomp[i][j] + " ";
	    }
	    ans += "\n";
	}
	return ans;
    }


	
    public static void main(String[]args){
	makelake a = new makelake("makelake.txt");
	//System.out.println(a.bString() + a.pString() + a.sString());
	System.out.println(a.getVolume());
    }
    
		
}
