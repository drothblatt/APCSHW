import java.util.*;


public class Nodeb{
    private int r; // row
    private int c; // column
    private int d; // distance from starting spot
    private Nodeb prev; // last spot

    public Nodeb(int row, int col){
	r = row;
	c = col;
	d = 0;
	prev = null;
    }
	
    public Nodeb(int row, int col, int dist, Nodeb last){
	r = row;
	c = col;
	prev = last;
	d = dist;
    }
	
    public Nodeb(int row, int col, Nodeb last){
	r = row;
	c = col; 
	prev = last;
	d = last.getDist();
    }
	    
    private int getRow(){
	return r;
    }
    private int getCol(){
	return c;
    }
    private int getDist(){
	return d; 
    }
    private Nodeb getPrev(){
	return prev;
    }
    public String toString(){
	return "(" + r + ", " + c + ")";
    }


    public static void main(String[]argggs){
	MyDeque foo = new MyDeque();

	Nodeb i = new Nodeb(2, 3); 
	foo.add(i, 5);

	Nodeb e = new Nodeb(1, 0, i); 
        foo.add(e, 1);

	Nodeb k = new Nodeb(3, 4, e); 
	foo.add(k, 7);

	Nodeb j = new Nodeb(3, 3, i); 
	foo.add(j, 6);

	Nodeb f = new Nodeb(1, 1, e); 
	foo.add(f, 2);

	Nodeb h = new Nodeb(2, 2, f); 
	foo.add(h, 4);

	Nodeb g = new Nodeb(1, 2, h); 
	foo.add(g, 3);

	Nodeb y = new Nodeb(4, 4, g);
	foo.add(y, 8);

	int x = 8;
	while( x > 0){
	    foo.removeSmallest();
	    System.out.println("Removed. (" + x + ")\n " + 
			       foo.toString() + "\n" + 
			       foo.toStringD2G());
	    x--;

	}
	System.out.println("final:" +  foo.showObjectArray() + "\n" + 
			       foo.showD2GoalArray());
    }
}

	    
