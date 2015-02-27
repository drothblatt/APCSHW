public class NQueens {

    //constants for the class
    //terminal specific character to clear screen , or hide/show cursor
    final static String clear =  "\033[2J";
    final static String hide =  "\033[?25l";
    final static String show =  "\033[?25h";

    //instance variable
    private char[][]board;

    private int q;

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
	board = new char[size][size];
	q = board.length;
	for(int i = 0; i < board.length; i++){
	    for(int j = 0; j < board[0].length; j++){
		board[i][j] = 'x';
	    }
	}
    }

    public NQueens(){
	board = new char[8][8];
	q = board.length;
	for(int i = 0; i < board.length; i++){
	    for(int j = 0; j < board[0].length; j++){
		board[i][j] = 'x';
	    }
	}
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
	return solve(0);
    }
    
    public boolean solve(int x){
	if ( x >= 0 && x < board.length ) { // place a queen at col X in row 0
	    board[0][x] = 'Q';
	    return solve(1, q-1);
	} 
	return false;
    }

    public boolean solve(int r, int nQueens){
	System.out.println(this);
	wait(25);

	if (r == board.length){
	    return true;
	} 

	for (int c = 0; c < q; c++) {
	    if (validSpot(r,c)){
		board[r][c] = 'Q'; 
		if ( solve(r+1, nQueens-1) ) {
		    return true;
		}
		board[r][c] = 'x';
	    }
	}
	return false;
    }

    public boolean validSpot(int row, int col){	
	// checks rows, columns, and diagonals for any Qs in the way
	for (int r = 0; r < q; r++){
	    for (int c = 0; c < q; c++){
		if ( ( (r == row) || (c == col) || (Math.abs(r - row) == Math.abs(c-col)) )
		     && (board[r][c] == 'Q') ){
		    return false;
		}
	    }
	}
	return true;
    }
}
