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
	String retStr = "";
	int exp = 0;
	int inThisRow = 0;
        //String spaces = "";
	for (int i = 1; i <= heap[0]; i++){
	    retStr += heap[i] + " ";  //spaces;
	    inThisRow++;
	    if ( inThisRow == (int)Math.pow(2,exp) ) {
		retStr += "\n";
		exp++;
		//spaces = spacing(inThisRow);
		inThisRow = 0;
	    }
	}
	return retStr;
    }

    private String spacing(int x){
	String ans = "";
	for (int i = 0; i < x; i++){
	    ans += " ";
	}
	return ans;
    }
    
    public int remove(){ // remove the root and return it
	if (heap[0] == 0) throw new NoSuchElementException("heap is empty.");
	if (heapType) return removeMax();
	return removeMin();
    }

    private int removeMax(){ 
	int removed = heap[1];
	heap[1] = heap[heap[0]];
	heap[heap[0]] = 0;
	int i = 1;
	comeOnDownMax(1);
	heap[0] = heap[0] - 1; // size (decreases by 1)
	return removed;
    }

    private int removeMin(){
	// i know this gets redundant but not enoguh time to change now 
	int removed = heap[1];
	heap[1] = heap[heap[0]];
	heap[heap[0]] = 0;
	comeOnDownMin(1);
	heap[0] = heap[0] - 1; // size (decreases by 1)
	return removed;
    }

    private void comeOnDownMax(int i){
	if ( ((i*2)+1) < heap[0] ){
		if (heap[i] < heap[i*2]){
		    int temp = heap[i];
		    heap[i] = heap[i*2];
		    heap[i*2] = temp;
		    comeOnDownMax(i*2);
		} 
		if (heap[i] < heap[(i*2)+1] ){
		    int temp = heap[i];
		    heap[i] = heap[(i*2)+1];
		    heap[(i*2)+1] = temp;
		    comeOnDownMax((i*2)+1);
		}
	}
    }

    private void comeOnDownMin(int i){
	if ( ((i*2)+1) < heap[0] ){
		if (heap[i] > heap[i*2]){
		    int temp = heap[i];
		    heap[i] = heap[i*2];
		    heap[i*2] = temp;
		    comeOnDownMin(i*2);
		} 
		if (heap[i] > heap[(i*2)+1] ){
		    int temp = heap[i];
		    heap[i] = heap[(i*2)+1];
		    heap[(i*2)+1] = temp;
		    comeOnDownMin((i*2)+1);
		}
	}
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
	if (heap[0] == 0) throw new NoSuchElementException("heap is empty.");
	return heap[1];
    }

    public boolean isEmpty(){
	return (heap[0] == 0);
    }

    public String name(){ // good
	return "rothblatt.david";
    }
    
    
    /*
    public static void main(String[]args){
	MyHeap h = new MyHeap(false);
	Random r = new Random();

	h.add(32);
	h.add(10);
	h.add(55);
	h.add(6);
	h.add(7);
	h.add(88);
	h.add(76);
	h.add(42);
	h.add(61);
	System.out.println(h);
	for (int i = 0; i < 10; i++){ // last one should throw ex. 
	    System.out.println("\n\n\n...");
	    System.out.println(h.remove()+"\n");
	    System.out.println(h);
	}
	
    }
    */
    

}
