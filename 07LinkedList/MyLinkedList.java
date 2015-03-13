
public class MyLinkedList{
    private int size = 0;
    private LNode head, tail;
    /*
    public myLinkedList(LNode h, LNode t){
	head = h;
	tail = t;
    }

    public myLinkedList(){
	LNode hx = new LNode(0);
	LNode tx = new LNode(0);
	myLinkedList(hx);
    }
    */


    public int get(int index){}

    public void remove(int index){}
    
    public void set(int index, int value){}

    public boolean add(int value){
	if (size == 0){
	    head = new LNode(0);
	    tail = new LNode(0);
	} else{
	    LNode current = head;
	    current = current.getNext();
	    current.setData(value);
	}
	size++;
	return true;
    }
    
    public boolean add(int index, int value){}
    
    public boolean isEmpty(){
	return (size == 0);
    }

    public int size(){
	return size;
    }

    public String toString(){
	String ans = "[ ";
	LNode temp = head;
	while (temp != null){
	    ans += temp.getData() + ", ";
	    temp = temp.getNext();
	}
	return ans + "]";	
    }

    public int indexOf(){}

}
