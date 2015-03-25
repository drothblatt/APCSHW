import java.util.*;

public class MyDEQueue{
    int top, bottom, size;
    int[] a; 
    
    public MyDEQueue(){
	this(100);
    }

    public MyDEQueue(int s){
	a = new int[s];
	top = s/2-1;
	bottom = s/2-1;
	size = 0;
    }

    public boolean addFirst(int value){
	if (bottom < a.length-1){
	    top++;
	    a[top] = value;
	    size++;
	    return true;
	} else if (top == size - 1){ 
	    top = 0; 
	    a[top] = value;
	    size++;
	    return true;
	} 	   
	return false;
    }

    public int removeFirst(){
	top--; 
	size--;
	return a[top+1];
    }

    public int getFirst(){
	return a[top];
    }

    public boolean addLast(int value){
	if (bottom < a.length-1){
	    bottom--;
	    a[bottom] = value;
	    size++;
	    return true;
	} /*else if (bottom == size - 1){ 
	    ; 
	    a[top] = value;
	    size++;
	    return true;
	} 
	  */
	return false;
    }

    public int removeLast(){
	bottom++;
	size--;
	return a[bottom-1];
    }
    public int getLast(){
	return a[bottom];
    }

    public String toString(){
	String ans = "[";
	for (int i = bottom; i <= top; i++){
	    ans += a[i] + " ";
	}
	ans += "]";
	return ans;
    }

    public static void main(String[]args){
	MyDEQueue DQ = new MyDEQueue(20);

	System.out.println(DQ.addFirst(-100)); // should all be true
	System.out.println(DQ.addFirst(1));
	System.out.println(DQ.addFirst(2));
	System.out.println(DQ.addFirst(3));
	System.out.println(DQ.toString());

	System.out.println(DQ.addLast(-1)); // should all be true
	System.out.println(DQ.addLast(-2));
	System.out.println(DQ.addLast(-3));
	System.out.println(DQ.addLast(-4));
	System.out.println(DQ.toString());

	System.out.println(DQ.getLast());  // should be -4
	System.out.println(DQ.getFirst()); // should be 3
	System.out.println(DQ.removeLast()); // should rm -4
	System.out.println(DQ.removeFirst()); // should rm 3
	System.out.println(DQ.toString());

    }


}

