import java.util.*;

public class MyLinkedList{
    private int size = 0;
    private LNode head, tail;
    
    public int get(int index){
	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	LNode current = head;
	for (int i = 0; i < index; i++){
	    current = current.getNext();
	}
	return current.getData();
    }


    
    public int remove(int index){
	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	int ans;
	if (index == 0){
	    ans = head.getData();
	    head = head.getNext();
	} else{
	    LNode current = head; 
	    for (int i = 0; i < index - 1; i++){
		current = current.getNext();
	    }
	    ans = current.getNext().getData();
	    current.setNext(current.getNext().getNext());
	}
	size--;
	return ans;
    }
    

    public void set(int index, int value){
	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	LNode current = head; 
	for (int i = 0; i < index; i++){
	    current = current.getNext();
	}
	current.setData(value);
    }
    

    public boolean add(int value){
	if (size == 0){
	    head = new LNode(value);
	    tail = head;
	} else{
	    LNode current = new LNode(value);
	    tail.setNext(current);
	    tail = current;
	}
	size++;
	return true;
    }
    
    public boolean add(int index, int value){
	if (index < 0 || index > size){
	    throw new IndexOutOfBoundsException();
	}
	LNode noo = new LNode(value);
	if (index == size){
	    add(value);
	} else{
	    if (index == 0){
		noo.setNext(head);
		head = noo; 
	    } else{
		LNode current = head;
		for (int i = 0; i < index-1; i ++){
		    current = current.getNext();
		}
		noo.setNext(current.getNext());
		current.setNext(noo);
	    }
	    size++;	
	}
	return true;
	
    }
    
    
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
	    ans += temp.getData() + " ";
	    temp = temp.getNext();
	}
	ans += "]";
	return ans;	
    }
    
    public int indexOf(int value){
	LNode current = head;
	for (int i = 0; i < size; i++){
	    if (current.getData() == value){
		return i;
	    }
	    current = current.getNext();
	}
	return -1; // not found at this point :(
    }
    
    public static void main(String[]args){
	MyLinkedList l = new MyLinkedList();
	Random r = new Random();

	System.out.println(l.isEmpty()); // should be true

	l.add(1);
	l.add(6);
	l.add(-5);
	System.out.println(l.toString() + "\n" + l.size() + "l.add(3,21)");
	l.add(3,21);
	System.out.println(l.toString() + "\n" + l.size());
	l.add(8);
	l.add(9);
	System.out.println(l.toString() + "\n" + l.size());
	l.add(0,3);
	System.out.println(l.toString() + "\n" + l.size());

	for (int i = 0; i < 8; i++){
	    l.add(r.nextInt(20) + 1);
	}
	System.out.println(l.toString() + "\n" + l.size());
	System.out.println(l.get(5));
	l.set(5, 1000);
	System.out.println(l.toString() + "\n" + l.size());
	l.add(5, -1000);
	System.out.println(l.toString() + "\n" + l.size());
	System.out.println("remove" + l.remove(10) + "\n" + l.toString() + l.size());

	System.out.println(l.indexOf(-1000));
	
    }
}
