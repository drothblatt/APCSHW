import java.util.*;

public class MyLinkedList<T> implements Iterable<T>{
    public Iterator<T> iterator(){
	return new MyLLIterator<T>();
    }

    public class MyLLIterator<T> implements Iterator<T>{
	LNode<T> current;
	public T next(){
	    if (hasNext()){
		return current.getData();
	    } else{
		throw new NoSuchElementException();
	    }
	    
	}
	public boolean hasNext(){
	    if (!(current.getNext()).equals(null)){
		return true;
	    }
	    return false;
	}

	public void remove(){
	    throw new UnsupportedOperationException();
	}

    }

    private int size = 0;
    private LNode<T> head, tail;

    public String name(){
	return "rothblatt.david";
    }
    
    public T get(int index){
	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	LNode<T> current = head;
	for (int i = 0; i < index; i++){
	    current = current.getNext();
	}
	return current.getData();
    }

    public T remove(int index){
	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	T ans;
	if (index == 0){
	    ans = head.getData();
	    head = head.getNext();
	} else{
	    LNode<T> current = head; 
	    for (int i = 0; i < index - 1; i++){
		current = current.getNext();
	    }
	    ans = current.getNext().getData();
	    current.setNext(current.getNext().getNext());
	}
	size--;
	return ans;
    }
    

    public void set(int index, T value){
	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	LNode<T> current = head; 
	for (int i = 0; i < index; i++){
	    current = current.getNext();
	}
	current.setData(value);
    }
    

    public boolean add(T value){
	if (size == 0){
	    head = new LNode<T>(value);
	    tail = head;
	} else{
	    LNode<T> current = new LNode<T>(value);
	    tail.setNext(current);
	    tail = current;
	}
	size++;
	return true;
    }
    
    public boolean add(int index, T value){
	if (index < 0 || index > size){
	    throw new IndexOutOfBoundsException();
	}
	LNode<T> noo = new LNode<T>(value);
	if (index == size){
	    add(value);
	} else{
	    if (index == 0){
		noo.setNext(head);
		head = noo; 
	    } else{
		LNode<T> current = head;
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
    
    public int indexOf(T value){
	LNode<T> current = head;
	for (int i = 0; i < size; i++){
	    if (current.getData() == value){
		return i;
	    }
	    current = current.getNext();
	}
	return -1; // not found at this point :(
    }
    
    // main is in tester.java
}
