public class LNode{
    private int data; //or whatever type the data is
    private LNode next; //LNode in an LNode… this is the reference to the “cdr”
    
    /*
    public LNode(){}
    public LNode(int d){}
    public LNode(int d, LNode n){}
    */

    public LNode(int d){
	data = d;
    }
	
    //get and set Data
    public int getData(){
	return data;
    }

    public void setData(int x){
	data = x;
    }

    //get and set Next
    public LNode getNext(){
	return next;
    }

    public void setNext(LNode y){
	next = y;
    }

    public String toString(){
	return "" + data;
    }

    // throwback to beginning of the year w/ these accesor/mutator methods?

}
