import java.util.*;
import java.io.*;

public class TreeNode<E>{
	E data;
	TreeNode left, right;

	public TreeNode(E someData){
	    data = someData;
	} 
	
	public TreeNode(E someData, TreeNode<E> nodeL, TreeNode<E> nodeR){
	    data = someData;
	    left = nodeL;
	    right = nodeR;
	}

	public TreeNode<E> getLeft(){
	    return left;
	}
	
	public TreeNode<E> getRight(){
	    return right;
	}

	public E getData(){
	    return data;
	}

	public void setLeft(TreeNode<E> newLeft){
	    left = newLeft;
	}

	public void setRight(TreeNode<E> newRight){
	    right = newRight;
	}

	public void setData(E someData){
	    data = someData;
	}

	public String toString(){
	    return "My Data: " + getData() 
		+ "Left Node: " + getLeft() + 
		"Right Node: " + getRight() ;
	}

}
