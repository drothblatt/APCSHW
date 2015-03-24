import java.util.*;

public class MyStack<T>{
    private MyLinkedList<T> l = new MyLinkedList<T>();

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
	if (empty()) throw new EmptyStackException();
	return l.get(0);
    }

    public T pop(){
	if (empty()) throw new EmptyStackException();
	return l.remove(0);
    }

    public static void main(String[]args){
	/*
	MyStack<Integer> s = new MyStack<Integer>(); 
	MyStack<String> t = new MyStack<String>();

	System.out.println("\n\nMyStack...Integer\n");
	System.out.println("expecting true:  " + s.empty() );
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
	System.out.println("expecting false:  " + s.empty() );
	System.out.println("\n\n");

	System.out.println("\n\nMyStack... String\n");
	System.out.println("expecting true:  " + t.empty() );
	t.push("Howdy");
	t.push("1");
	t.push("-_-");
	t.push("^o^");
	t.push("o_o");
	System.out.println(t.toString() );
	System.out.println(t.peek()); // should print out 5
	System.out.println(t.pop()); // should print out 5 and remove it 
	System.out.println(t.toString() );
	t.push("8");
	System.out.println(t.toString() );
	System.out.println(t.empty() );
	System.out.println("\n\n");
	while (! t.empty() ){
	    t.pop();
	}
	System.out.println(t.toString() );
	t.pop();
	
	*/
    }

}
