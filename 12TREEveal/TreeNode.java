import java.util.*;
import java.io.*;

public class TreeNode<E>{
	E value;
	TreeNode left, right;

	public TreeNode(E someVal){
	    value = someVal;
	} 
	
	public TreeNode(E someVal, TreeNode<E> nodeL, TreeNode<E> nodeR){
	    value = someVal;
	    left = nodeL;
	    right = nodeR;
	}

	public int getLeft(){
	    return left;
	}
	
	public int getRight(){
	    return right;
	}

	public int getValue(){
	    return value;
	}

	public void setLeft(TreeNode<E> newLeft){
	    left = newLeft;
	}

	public void setRight(TreeNode<E> newRight){
	    right = newRight;
	}

	public void setValue(E someVal){
	    value = someVal;
	}

	public String toString(){
	    return "My Value: " + getValue() 
		+ "Left Node: " + getLeft() + 
		"Right Node: " + getRight() ;
	}

}
