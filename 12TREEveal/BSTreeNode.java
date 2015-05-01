import java.util.*;
import java.io.*;

public class BSTreeNode<T extends Comparable> {

    private T data;
    private BSTreeNode<T> left;
    private BSTreeNode<T> right;

    public BSTreeNode( T d ) {
 
	data = d;
	left = right = null;
    }
	
    public TreeNode(T someData, TreeNode<T> nodeL, TreeNode<T> nodeR){
	data = someData;
	left = nodeL;
	right = nodeR;
    }
    
    //accessors
    public T getData() {
	return data;
    }
    public BSTreeNode<T> getLeft() {
	return left;
    }
    public BSTreeNode<T> getRight() {
	return right;
    }

    //mutators
    public void setData( T d ) {
	data = d;
    }
    public void setLeft( BSTreeNode<T> l ) {
	left = l;
    }
    public void setRight( BSTreeNode<T> r ) {
	right = r;
    }

    public String toString(){
	return "My Data: " + getData() 
	    + "Left Node: " + getLeft() + 
	    "Right Node: " + getRight() ;
    }

}