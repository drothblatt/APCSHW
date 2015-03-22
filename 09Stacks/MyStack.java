import java.util.*;

public class MyStack<T>{
    private LinkedList<T> l = new LinkedList<T>();

    public String name(){
	return "rothblatt.david";
    }
    
    public String toString(){
	return l.toString();
    }

    public boolean empty(){
	return (l.size() == 0);
    }

    public T push(T value){
	l.add(0,value);
	return value;
    }

    public T peek(){
	return l.get(0);
    }

    public T pop(){
	return l.remove(0);
    }

   

    public static void main(String[]args){
	MyStack<Integer> s = new MyStack<Integer>(); 
	System.out.println("\n\nMyStack\n");
	s.push(1);
	s.push(1);
	s.push(2);
	s.push(3);
	s.push(5);
	System.out.println("expecting [5, 3, 2, 1, 1]:    " + s.toString() );
	System.out.println(s.peek()); // should print out 5
	System.out.println(s.pop()); // should print out 5 and remove it 
	System.out.println("expecting [3, 2, 1, 1]:       " + s.toString() );
	s.push(8);
	System.out.println("expecting [8, 3, 2, 1, 1]:    " + s.toString() );
	System.out.println("\n\n");
    }

}
