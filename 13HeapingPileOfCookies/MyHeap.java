import java.util.*;
import java.io.*;

public class MyHeap{
    private int[] heap;
    private final boolean heapType;

    public MyHeap(){  // creates a max heap
	heap = new int[10];
	heapType = true;
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

    public void resize(){
	int[] copy = Arrays.copyOf(heap, heap.length*2);
	heap = copy;
    }

    private void addMax(int x){
	if (heap[0] == 0){
	    heap[1] = x;
	} else{
	    heap[heap[0]+1] = x;
	    
	}
    }
    
    private void addMin(int x){
    


    }

    public int peek(){
	return heap[1];
    }

    public String name(){
	return "rothblatt.david";
    }

    public static void main(String[]args){
	MyHeap h = new MyHeap();
	for (int i = 20; i < 90; i = i+5){
	    h.add(i);
	    System.out.println(h);
	}
    }

}
