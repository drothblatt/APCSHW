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
	String retStr = "";
	for (int i = 1; i <= size; i++){}
	return retStr;
    }
    
    public int remove(){ // remove the root and return it
	if (heapType) return removeMax();
	return removeMin();
    }

    private int removeMax(){
	int removed = heap[1];
	heap[1] = heap[size];
	heap[0] = heap[0] - 1; // size (decreases by 1)
	return removed;
    }

    private int removeMin(){
	int removed = heap[1];
	heap[1] = heap[size];
	heap[0] = heap[0] - 1; // size (decreases by 1)
	return removed;
    }

    public void add(int x) {  // add the int to the heap
	if (heapType) addMax(x);
	else addMin(x);
	size++;
    }

    private void addMax(int x){}
    private void addMin(int x){}

    public int peek(){
	return heap[1];
    }

    public String name(){
	return "rothblatt.david";
    }


}
