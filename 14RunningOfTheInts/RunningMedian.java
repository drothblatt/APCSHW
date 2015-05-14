import java.util.*;

public class RunningMedian{
    private MyHeap maxH, minH;

    public RunningMedian(){
	maxH = new MyHeap(true);
	minH = new MyHeap(false);
    }

    public void add(int value){
	if (maxH.size() == minH.size() || maxH.size() == minH.size() - 1){
	    maxH.add(value);
	} else if(maxH.size() - 1 == minH.size() ){
	    minH.add(value);
	} else if(maxH.size() > minH.size() + 1){
	}
    }

    public double getMedian(){
	if ( maxH.size() == minH.size() ){
	    return ( maxH.peek() + minH.peek() )/2.0;
	} else if( maxH.size() - 1 == minH.size() ){
	    return maxH.peek();
	} else if( minH.size() - 1 == maxH.size() ){
	    return minH.peek();
	}
	return -1;
    }
    


}