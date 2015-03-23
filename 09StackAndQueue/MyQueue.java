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
    
    public static void main(String[]args){
	/*

	MyQueue<String> kew = new MyQueue<String>();
	System.out.println(kew.enqueue(".") + "\n"
			   + kew.enqueue("_") + "\n"
			   + kew.enqueue(",") + "\n"
			   + kew.enqueue("/") + "\n"
			   + kew.toString()  );
	// expect [ . _ , / ]
	System.out.println(kew.dequeue() + "\n" + kew.toString() + 
			   "\n" + kew.dequeue() + "\n" + kew.dequeue() + "\n"
			   + kew.toString()    );
	// FIFO so expect "." then [ _ , / ] then "_" then "," then [ / ]

	*/
    }

}
