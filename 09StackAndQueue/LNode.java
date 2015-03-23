public class LNode<T>{
    private T data; //or whatever type the data is
    private LNode<T> next; //LNode in an LNode… this is the reference to the “cdr”

    public LNode(T nData){
	setData(nData);
    }
	
    //get and set Data
    public T getData(){
	return data;
    }

    public void setData(T nData){
	data = nData;
    }

    //get and set Next
    public LNode<T> getNext(){
	return next;
    }

    public void setNext(LNode<T> y){
	next = y;
    }

    public String toString(){
	return "" + data;
    }

    // throwback to beginning of the year w/ these accesor/mutator methods?

}
