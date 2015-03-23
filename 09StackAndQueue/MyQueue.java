import java.util.*;

public class MyQueue<T>{
    private MyLinkedList<T> q = new MyLinkedList<T>();

    public String name(){
	return "rothblatt.david";
    }

    public String toString(){
	return q.toString();
    }
    
    public boolean enqueue(T value){
	q.add(size-1,value);
	return true;
    }

    public T dequeue(){
	return l.get(0);
    }

    




}