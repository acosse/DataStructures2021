
import java.io.*; 

public class demoTree{
	

	public static void main(String[] args){


	mySimpleBinaryTree<Integer> myBT = new mySimpleBinaryTree<>();



	// Simple 1 level binary tree

	Position<Integer> node0 = myBT.addRoot(0);

	Position<Integer> node1 = myBT.addLeft(node0, 1);

	Position<Integer> node2 = myBT.addRight(node0, 2);	

	/*Position<Integer> node3 = myBT.addLeft(node1, 3);

	Position<Integer> node4 = myBT.addRight(node1, 4);

	Position<Integer> node5 = myBT.addLeft(node2, 5);

	Position<Integer> node6 = myBT.addRight(node2, 6);

	Position<Integer> node7 = myBT.addLeft(node3, 7);

	Position<Integer> node8 = myBT.addRight(node3, 8);*/


	for(int i: myBT){

		System.out.println(i);


	}










	// checking the tree

	/*System.out.println(myBT.returnNodeValue(level1_left));
	System.out.println(myBT.returnNodeValue(level1_right));*/


	/*System.out.println("  "+ myBT.returnNodeValue(rootPosition)+ "  ");
	System.out.println(" " + '/' + " " + '\\');
	System.out.println(myBT.returnNodeValue(level1_left) + "   " + myBT.returnNodeValue(level1_right));*/















	}




}