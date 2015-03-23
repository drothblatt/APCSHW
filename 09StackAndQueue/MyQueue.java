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
	return q.add(value); // will use add method in myLL
	
    }

    public T dequeue(){
	return q.remove(0); // will use remove method in myLL
    }

}
