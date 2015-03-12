
public class myLinkedList{
    private int size;
    private LNode start;

    public myLinkedList(LNode n){
	start = n;
    }

    public myLinkedList(){
	LNode m = new LNode(0);
	myLinkedList(m);
    }

    public int get(int index){}

    public void remove(int index){}
    
    public void set(int index, int value){}

    public void add(int value){}
    
    public void add(int index, int value){}
    
    public boolean isEmpty(){}

    public int size(){}

    public String toString(){}

    public int indexOf(){}

}
