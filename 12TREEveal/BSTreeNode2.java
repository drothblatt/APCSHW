import java.util.*;
import java.io.*;

public class BSTreeNode<T> extends Comparable{
	T data;
	BSTreeNode left, right;

	public BSTreeNode(T someData){
	    data = someData;
	} 
	
	public BSTreeNode(T someData, BSTreeNode<T> nodeL, BSTreeNode<T> nodeR){
	    data = someData;
	    left = nodeL;
	    right = nodeR;
	}

	public BSTreeNode<T> getLeft(){
	    return left;
	}
	
	public BSTreeNode<T> getRight(){
	    return right;
	}

	public T getData(){
	    return data;
	}

	public void setLeft(BSTreeNode<T> newLeft){
	    left = newLeft;
	}

	public void setRight(BSTreeNode<T> newRight){
	    right = newRight;
	}

	public void setData(T someData){
	    data = someData;
	}

	public int Comparable(T o){



	}

	public String toString(){
	    return "My Data: " + getData() 
		+ "  Left Node: " + getLeft() + 
		"  Right Node: " + getRight() ;
	}

}
