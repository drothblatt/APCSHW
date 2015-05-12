import java.util.*;
import java.io.*;

public class MyHeap{
    private int[] heap;
    private final boolean heapType;

    public MyHeap(){  // creates a max heap
	this(true);
    }

    public MyHeap(boolean isMax){
	heap = new int[10];
	heapType = isMax;
    }
    
    public String toString() {
	/*
	String retStr = "";
	for (int i = 1; i <= heap[0]; i++){}
	return retStr;
	*/
	return Arrays.toString(heap);
    }
    
    public int remove(){ // remove the root and return it
	if (heapType) return removeMax();
	return removeMin();
    }

    private int removeMax(){
	int removed = heap[1];
	heap[1] = heap[heap[0]];
	heap[heap[0]] = 0;
	heap[0] = heap[0] - 1; // size (decreases by 1)
	return removed;
    }

    private int removeMin(){
	int removed = heap[1];
	heap[1] = heap[heap[0]];
	heap[0] = heap[0] - 1; // size (decreases by 1)
	return removed;
    }

    public void add(int x) {  // add the int to the heap
	if (heap[0] == heap.length-1) resize();
	if (heapType) addMax(x);
	else addMin(x);
	heap[0] = heap[0] + 1;
    }

    private void addMax(int x){
	if (heap[0] == 0){
	    heap[1] = x;
	} else{
	    heap[heap[0]+1] = x;
	    int i = heap[0] + 1;
	    while (i / 2 > 0){
		if (heap[i/2] < heap[i]){
		    int temp = heap[i];
		    heap[i] = heap[i/2];
		    heap[i/2] = temp;
		}
		i = i/2;
	    }
	}
    }  
    
    private void addMin(int x){
  	if (heap[0] == 0){
	    heap[1] = x;
	} else{
	    heap[heap[0]+1] = x;
	    int i = heap[0] + 1;
	    while (i / 2 > 0){
		if (heap[i/2] > heap[i]){
		    int temp = heap[i];
		    heap[i] = heap[i/2];
		    heap[i/2] = temp;
		}
		i = i/2;
	    }
	}
    }  

    private void resize(){ // good
	int[] copy = Arrays.copyOf(heap, heap.length*2);
	heap = copy;
    }

    public int peek(){ // good
	return heap[1];
    }

    public String name(){ // good
	return "rothblatt.david";
    }

    public static void main(String[]args){
	MyHeap h = new MyHeap(false);
	Random r = new Random();
	for (int i = 0; i < 15; i++){
	    int val = r.nextInt(100)+1;
	    h.add(val);
	    System.out.println(val);
	}
	System.out.println(h);
	/*
	System.out.println(h.peek());
	System.out.println(h.remove());
	System.out.println(h);
	*/

    }

}
