import java.util.*;

public class MyDeque<T>{
    private int head, tail, size;
    private Object[] data;
    private int[] d2goal;

    public MyDeque(){
	this(7);
    }
    public MyDeque(int s){
	data = new Object[s];
	d2goal = new int[s];
	head = s/2;
	tail = head-1;
	size = 0;
    }

    public String name(){
	return "rothblatt.david";
    }

    public boolean resize(){
	if ( size == data.length ){
	    Object[] copyData = new Object[size*2];
	    int[] copyD2goal = new int[size*2];
	    for (int i = 0; i < size; i++){
		copyData[i] = data[ (i + head) % (size)];
		copyD2goal[i] = d2goal[ (i + head) % (size) ];
	    }
	    head = 0; 
	    tail = size-1;
	    data = copyData;
	    d2goal = copyD2goal;
	    return true;
	}	    
	return false;
    }
    
    public String toString(){
	String ans = "[";
	if (size > 0){
	    for (int i = 0; i < size-1; i++){
		ans += data[ (head+i) % data.length] + ", ";
	    }
	    ans += data[tail];
	}
	ans += "]";
	return ans;
    }

    public String toStringD2G(){
	String ans = "[";
	if (size > 0){
	    for (int i = 0; i < size-1; i++){
		ans += d2goal[ (head+i) % d2goal.length] + ", ";
	    }
	    ans += d2goal[tail];
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
	System.out.println(size());
    }
    
    public void add(T value, int dist){
	addLast(value);
	d2goal[tail] = dist;
	System.out.println("Added.\n" + toString() + "\n" + toStringD2G());
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

    public T removeSmallest(){
	System.out.println("\n ------ Pre Stats\n" + toString() + "\n" 
			   + toStringD2G()
			   + "\nSize:" + size );
	if (size == 0) throw new NoSuchElementException();
	if (size == 1) {
	    //System.out.println("went to size == 1");
	    size--; 
	    T value = (T)data[head];
	    data[head] = null;
	    head = (head+1)%data.length;
	    return value;
	}
	int minInd = head;
	//System.out.println("went to else");
	for (int i = 0; i < size; i++){
	    if ( d2goal[(i+head)%d2goal.length] < d2goal[minInd] ){
		minInd = (i+head)%d2goal.length;
	    }
        }
	//System.out.println("Min Index:" + minInd );
	//System.out.println("Min Val: " + data[minInd]);

	T value = (T)data[minInd];
	data[minInd] = data[head];
	d2goal[minInd] = d2goal[head];
	data[head] = null; 
	size--;
	head = (head+1)%data.length;
	return (T)value;
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

    public int size(){
	return size;
    }
   
    public String showObjectArray(){
	return Arrays.toString(data);
    }

    public String showD2GoalArray(){
	return Arrays.toString(d2goal);
    }

    public String HeadTailSize(){
	return "head: " + head + " tail: " + tail + " size: " + size;
    }

    public static void main(String[]args){
	/*
	MyDeque<String> a = new MyDeque<String>();

	System.out.println(a.HeadTailSize());
	System.out.println(a.toString());

	a.addFirst("3");
	System.out.println(a.HeadTailSize());
	System.out.println(a.toString());

	a.addFirst("2");
	System.out.println(a.HeadTailSize());
	System.out.println(a.toString());

	a.addFirst("1");
	System.out.println(a.HeadTailSize());
	System.out.println(a.toString());

	a.addLast("4");
	System.out.println(a.HeadTailSize());
	System.out.println(a.toString());

	a.addLast("5");
	System.out.println(a.HeadTailSize());
	System.out.println(a.toString());
	//System.out.println(a.showRealArray());


	a.addLast("6");
	System.out.println(a.HeadTailSize());
	System.out.println(a.toString());
	//System.out.println(a.showRealArray());


	a.addFirst("0");
	System.out.println(a.resize());
	System.out.println(a.HeadTailSize());
	System.out.println(a.toString());
	
	a.addFirst("-1");
	System.out.println(a.resize());
	System.out.println(a.HeadTailSize());
	System.out.println(a.toString());

	a.addFirst("-2");
	System.out.println(a.resize());
	System.out.println(a.HeadTailSize());
	System.out.println(a.toString());

	a.addLast("7");
	System.out.println(a.resize());
	System.out.println(a.HeadTailSize());
	System.out.println(a.toString());

	a.addLast("8");
	System.out.println(a.resize());
	System.out.println(a.HeadTailSize());
	System.out.println(a.toString());

	a.addLast("9");
	System.out.println(a.resize());
	System.out.println(a.HeadTailSize());
	System.out.println(a.toString());

	a.addLast("10");
	System.out.println(a.resize());
	System.out.println(a.HeadTailSize());
	System.out.println(a.toString());
	System.out.println("real array: " + a.showRealArray());

	a.addLast("11");
	System.out.println(a.resize());
	System.out.println(a.HeadTailSize());
	System.out.println(a.toString());
	System.out.println("real array: " + a.showRealArray());

	a.addFirst("-3");
	System.out.println(a.resize());
	System.out.println(a.HeadTailSize());
	System.out.println(a.toString());
	System.out.println("real array: " + a.showRealArray());
	
	System.out.println(a.getFirst());
	System.out.println(a.getLast());

	System.out.println(a.removeFirst());
	System.out.println(a.removeLast());

	System.out.println(a.HeadTailSize());
	System.out.println(a.toString());
	System.out.println("real array: " + a.showRealArray());

	
	System.out.println(a.getFirst());
	System.out.println(a.getLast());
	*/
	
    }
}
