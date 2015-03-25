import java.util.*;

public class MyDeque<T>{
    private int head, tail, size;
    private Object[] data;

    public MyDeque(){
	this(12);
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
	data[pos] = value;
	head++;
	if(size == 0) tail++;
	size++;
    }

    public void addLast(T value){
	int pos = tail-1;
	data[pos] = value;
	tail--;
	size++;
    }

    public T removeFirst(){
	if (size == 0) throw new NoSuchElementException();
	T value = (T)data[head];
	data[head] = null;
	head--; 
	size--;
	return value;
    }

    public T removeLast(){
	if (size == 0) throw new NoSuchElementException();
	T value = (T)data[tail];
	data[tail] = null;
	tail--;
	size--;
	return value;
    }

    public T getFirst(){
	if (size == 0) throw new NoSuchElementException();
	T value = (T)data[head];
	return value;
    }

    public T getLast(){
	if (size == 0) throw new NoSuchElementException();
	T value = (T)data[tail];
	return value;
    }

    public String toString(){
	String ans = "[";
	for (int i = tail; i <= head; i++){
	    ans += data[i] + " ";
	}
	ans += "]";
	return ans;
    }
    
    public String showRealArray(){
	return Arrays.toString(data);
    }

    public static void main(String[]args){
	MyDeque<String> a = new MyDeque<String>();
	a.addFirst("--|||--");
	a.addFirst("input 1");
	a.addFirst("input 2");
	a.addFirst("input 3");
	System.out.println(a.toString());
	System.out.println(a.showRealArray());


    }
   


}
