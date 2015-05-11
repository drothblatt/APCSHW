import java.util.*;
import java.io.*;

public class MyHeap{
    private int[] heapArr;
    private int size;

    public MyHeap(){  // creates a max heap
	heapArr = new int[10];
	size = 0;
    }
    
    public String toString() {
	String retStr = "";
	for (int i = 1; i <= size; i++){}
	return retStr;
    }
    
    public int remove(){ // remove the root and return it
	int removed = heapArr[1];
	heapArr[1] = heapArr[size];
	size--;
	return removed;
    }

    public void add(int x) {  // add the int to the heap
	size++;
    }

    public String name(){
	return "rothblatt.david";
    }


}
