public class Tester{
    public static void main(String[]arggggs){
	NQueens q = new NQueens(3);
	System.out.println(q.solve());
	if (q.solve()){
	    System.out.println(q);
	} else {
	    System.out.println("No Solution");
	}
    }
}