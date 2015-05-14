import java.util.*;

public class RunningMedian{
    private MyHeap maxH, minH;

    public RunningMedian(){
	maxH = new MyHeap(true);
	minH = new MyHeap(false);
    }

    public void add(int value){
	if (maxH.size() == minH.size()){
	    maxH.add(value);
	} else if( value > getMedian() ){
	    minH.add(value);
	} else if( value < getMedian() ){
	    maxH.add(value);
	}
	
	if( maxH.size() + 1 > minH.size() ){
	    minH.add(maxH.remove());
	} else if ( minH.size() + 1 > maxH.size() ) {
	    maxH.add(minH.remove());
	}
    }

    public double getMedian(){
	if ( maxH.size() == minH.size() ){
	    return ( maxH.peek() + minH.peek() )/2.0;
	} else if( maxH.size() - 1 == minH.size() ){
	    return (double) maxH.peek();
	} else if( minH.size() - 1 == maxH.size() ){
	    return (double) minH.peek();
	}
	return -1;
    }

    public static void main(String[]args){
	RunningMedian r = new RunningMedian();
	for (int i = 1; i < 8; i++){
	    r.add(i);
	    System.out.println("maxH: " + r.maxH);
	    System.out.println("minH: " + r.minH);
	    System.out.println("Median: " + r.getMedian() + "...\n\n\n...");
	}
    }
    


}
