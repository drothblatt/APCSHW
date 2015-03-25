import java.util.*;

public class MyDeque<T>{
    private int head, tail, size;
    private Object[] data;

    public MyDeque(){
	this(9);
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
	tail++;
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
	System.out.println("expecting [--||-- 1 2 3]..." +  a.toString());
	System.out.println(a.showRealArray());
	a.addLast("input 4");
	a.addLast("input 5");
	a.addLast("input 6");
	System.out.println("expecting [6 5 4 --|||-- 1 2 3]..." + a.toString());
	System.out.println(a.showRealArray());
	System.out.println("expect 6..." + a.getLast()); // expecting 6
	System.out.println("expect 3..." + a.getFirst()); // expecting 3
	System.out.println("expect 6..." + a.removeLast()); // expecting 6
	System.out.println("expect 3..." + a.removeFirst()); // expecting 6
	System.out.println(a.head + " " + a.tail + a.size);
	System.out.println("expecting [5 4 --|||-- 1 2]..." + a.toString());
	System.out.println(a.showRealArray());




	MyDeque<Integer> b = new MyDeque<Integer>();
	b.removeFirst();
	b.removeLast();
	b.getFirst();
	b.getLast(); // all four b's throw exception as desired 


	


    }
   


}
