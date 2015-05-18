import java.util.*;

public class RunningMedian{
    private MyHeap maxH, minH;

    public RunningMedian(){
	maxH = new MyHeap(true);
	minH = new MyHeap(false);
    }

    public void add(int value){
	if (maxH.size() > 0 || minH.size() > 0){ // if either has a value already
	    double m = getMedian();
	    if( value > m ){
		minH.add(value);
	    } else if( value < m ){
		maxH.add(value);
	    }
	} else{ // if both heaps have a size of zero
	    maxH.add(value);
	}
	fixIt();
    }

    public void fixIt(){
	if( maxH.size() - 1 > minH.size() ){
	    minH.add(maxH.remove());
	} else if ( minH.size() - 1 > maxH.size() ) {
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

    public String toString(){
	String retStr = ""; 
	retStr += "\n" + "maxH: " + maxH + "\n";
	retStr += "minH: " + minH + "\n";
	retStr += "Median: " + getMedian() + "\n\n";
	return retStr;
    }

    public String name(){
	return "rothblatt.david";
    }

    public static void main(String[]args){
	RunningMedian r = new RunningMedian();
	RunningMedian s = new RunningMedian();

	for (int i = 1; i < 9; i++){
	    r.add(i);
	    System.out.println(r.toString());
	}
	System.out.println(".....\n.....");
       
	for (int i = 8; i > 0; i--){
	    s.add(i);
	    System.out.println(s.toString());
	}
    }
    


}
