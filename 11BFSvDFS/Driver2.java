import java.util.*;


public class Node{
    private int r; // row
    private int c; // column
    private int d; // distance from starting spot
    private Node prev; // last spot

    public Node(int row, int col){
	r = row;
	c = col;
	d = 0;
	prev = null;
    }
	
    private Node(int row, int col, int dist, Node last){
	r = row;
	c = col;
	prev = last;
	d = dist;
    }
	
    public Node(int row, int col, Node last){
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
    private Node getPrev(){
	return prev;
    }
    public String toString(){
	return "(" + r + ", " + c + ")";
    }


    public static void main(String[]argggs){
	MyDeque foo = new MyDeque();

	Node d = new Node(0,0);
	foo.add(d, 0);

	Node i = new Node(2, 3, h); 
	foo.add(i, 5);

	Node e = new Node(1, 0, d); 
        foo.add(e, 1);

	Node k = new Node(3, 4, j); 
	foo.add(k, 7);

	Node j = new Node(3, 3, i); 
	foo.add(j, 6);

	Node f = new Node(1, 1, e); 
	foo.add(f, 2);

	Node h = new Node(2, 2, g); 
	foo.add(h, 4);

	Node g = new Node(1, 2, f); 
	foo.add(g, 3);

	while(foo.size() >= 0){
	    foo.removeSmallest();
	    System.out.println("Removed.\n" + foo.showObjectArray() + "\n" + 
			       foo.showD2GoalArray());

	}
    }
}

	    
