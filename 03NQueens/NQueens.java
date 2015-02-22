public class NQueens {

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


    public NQueens(int size){
	board = new int[size][size];
    }

    public NQueens(){
	board = new int[8][8];
    }

    public String toString(){
  
	String ans = "\n\n";
	//build your knights tour here...
	for (int i = 0; i < board.length; i++){
	    for (int j = 0; j < board.length; j++){
		ans += board[i][j] + " ";
	    }
	    ans += "\n";
	}
	return hide + clear + go(0,0) + ans + "\n" + show;
    }

    public String name(){
	return "rothblatt.david";
    }

    public boolean solve(){
	return solve(0,0);
    }
    
    public boolean solve(int x){
	return solve(0,x);
    }

    public boolean solve(int r, int c){
	
    }



}
