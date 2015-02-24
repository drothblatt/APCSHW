public class Makelake{
    private int R, C, E, N;
    private int[][] pasture;
    private int[][] stomp;
    

    public Makelake(String filename){
	
	try{
	    Scanner in = new Scanner(new File(filename));
	    //keep reading next line
	    int input = 1;
	    while(in.hasNextInt()){
		if (input == 1) {R = in.nextInt(); }
		else if (input == 2) {C = in.nextInt();}
		else if (input == 3) {E = in.nextInt();}
		else if (input == 4) {N = in.nextInt();}
		pasture = new int[R][C];
		while (input <= R*C + 4 && in.hasNextInt()){
		    for (int r = 0; r < R; r++){
			for (int c = 0; c < C; c++){
			    pasture[r][c] = in.nextInt();
			}
		    }
		}
		
		    


		input++;
		
		/*
		String line= in.nextLine();
		if(maxy==0){
		    //calculate width of the maze
		    maxx=line.length();
		}
		//every new line add 1 to the height of the maze
		maxy++;
		ans+=line;
		*/
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
	    for (int r = R_s; r < R_s +3; r++){
		for (int c = C_s; c < C_s +3; c++){
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
	for (int r = R_s; r < R_s +3; r++){
	    for (int c = C_s; c < C_s +3; c++){
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

    public static void main(String[]args){
	Makelake a = new Makelake();
	System.out.println(a.getVolume());
    }
    
		
}