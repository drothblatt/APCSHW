import java.util.*;

public class MyDeque<T>{
    private int head, tail, size;
    private Object[] data;

    public MyDeque(){
	this(7);
    }
    public MyDeque(int s){
	data = new Object[s];
	head = s/2;
	tail = head+1;
	size = 0;
    }

    public String name(){
	return "rothblatt.david";
    }

    public void resize(){
	if (size == data.length){
	    int l = size;
	    Object[] copy = new Object[l*2];
	    for (int i = 0; i < l; i++){
		copy[i] = data[ (i + head) % l];
	    }
	    head = 0; 
	    tail = l-1;
	    data = copy;
	}
    }
    
    public String toString(){
	String ans = "[ ";
	if (size > 0){
	    for (int i = 0; i < size; i++){
		ans += data[ (i + head) % size] + " ";
	    }
	}
	ans += "]";
	return ans;
    }

    public void addFirst(T value){
	resize();
	head--;
	if (head < 0){
	    head = data.length-1;
	}
	data[head] = value;
	size++;
    }

    public void addLast(T value){
	resize();
	tail++;
	if (tail == data.length){
	    tail = 0;
	}
	data[tail] = value;
	size++;
    }

    public T removeFirst(){
	if (size == 0) throw new NoSuchElementException();
	T value = (T)data[head];
	head++; 
	size--;
	if (head == data.length) head = 0;
	return value;
    }

    public T removeLast(){
	if (size == 0) throw new NoSuchElementException();
	T value = (T)data[tail];
	tail--;
	size--;
	if (tail == 0) tail = data.length-1;
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
	System.out.println("expect 3..." + a.removeFirst()); // expecting 3
	System.out.println("expecting [5 4 --|||-- 1 2]..." + a.toString());
	System.out.println(a.showRealArray());
       
	System.out.println( a.removeFirst()); // expecting 2
	System.out.println( a.removeFirst()); // expecting 1
	System.out.println( a.removeFirst()); // expecting --|||--
	System.out.println( a.removeFirst()); // expecting 4
	System.out.println( a.removeFirst()); // expecting 5
	System.out.println("expecting []..." + a.toString());

	//System.out.println( a.removeFirst()); // expecting error

	a.addFirst("--|||--");
	a.addFirst("input 1");
	a.addFirst("input 2");
	a.addFirst("input 3");
	a.addLast("input 4");
	a.addLast("input 5");
	//a.addLast("input 6");
	System.out.println("expecting [6 5 4 --|||-- 1 2 3]..." + a.toString());
	System.out.println(a.showRealArray());


	System.out.println( a.removeLast()); // expecting 6
	System.out.println( a.removeLast()); // expecting 5
	System.out.println( a.removeLast()); // expecting 4
	System.out.println( a.removeLast()); // expecting --||--
	System.out.println( a.removeLast()); // expecting 1
	System.out.println( a.removeLast()); // expecting 2
	System.out.println( a.removeLast()); // expecting 3

	System.out.println("expecting []..." + a.toString());






	MyDeque<Integer> b = new MyDeque<Integer>();
	b.removeFirst();
	b.removeLast();
	b.getFirst();
	b.getLast(); // all four b's throw exception as desired 


	


    }
   


}
