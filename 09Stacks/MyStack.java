import java.util.*;

public class MyStack<T>{
    private LinkedList<T> l;

    public String name(){
	return "rothblatt.david";
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

    

}
