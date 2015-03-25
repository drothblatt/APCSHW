import java.util.*;

public class MyDeque{
    private int head, tail, size;
    private Object[] data;

    public MyDeque(){
	this(100);
    }
    public MyDeque(int s){
	data = new Object[s];
	head = s/2-1;
	tail = s/2-1;
	size = 0;
    }

    public String name(){
	return "rothblatt.david";
    }

    public void addFirst(T value){
	int pos = head+1;
	a[pos] = value;
	head++;
	size++;
    }

    public void addLast(T value){
	int pos = bottom-1;
	a[pos] = value;
	bottom--;
	size++;

    }

    public T removeFirst(){


    }

    public T removeLast(){


    }

    public T getFirst(){
    }

    public T getLast(){

    }

    public String toString(){
	String ans = "[";
	for (int i = bottom; i <= top; i++){
	    ans += data[i] + " ";
	}
	ans += "]";
	return ans;
    }

    public static void main(String[]args){
    }
   


}