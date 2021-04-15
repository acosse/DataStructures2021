
import java.io.*; 

public class demoTree{
	

	public static void main(String[] args){


	mySimpleBinaryTree<Integer> myBT = new mySimpleBinaryTree<>();

	Position<Integer> rootPosition;

	Position<Integer> level1_left;
	Position<Integer> level1_right;



	// Simple 1 level binary tree

	rootPosition = myBT.addRoot(0);

	level1_left = myBT.addLeft(rootPosition, 1);

	level1_right = myBT.addRight(rootPosition, 2);	

	// checking the tree

	/*System.out.println(myBT.returnNodeValue(level1_left));
	System.out.println(myBT.returnNodeValue(level1_right));*/


	System.out.println("  "+ myBT.returnNodeValue(rootPosition)+ "  ");
	System.out.println(" " + '/' + " " + '\\');
	System.out.println(myBT.returnNodeValue(level1_left) + "   " + myBT.returnNodeValue(level1_right));










	}




}