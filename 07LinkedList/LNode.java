public class LNode{
    private int data; //or whatever type the data is
    private LNode next; //LNode in an LNode… this is the reference to the “cdr”
    
    //get and set Data
    public int getData(){
	return data;
    }
    public void setData(int x){
	data = x;
    }

    //get and set Next
    public int getNext(){
	return next;
    }

    public void setNext(LNode y){
	next = y;
    }

    // throwback to beginning of the year w/ these accesor/mutator methods?

}
