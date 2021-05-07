
import java.io.*;

public class demoPositionIterator{
	
	// This is the demo file for the simple 



	public static void main(String[] args){



		char entry0 = 'a';
		LinkedPositionalListRevision<Character> myDemoPList = new LinkedPositionalListRevision<>(entry0);


		char entry1 = 'b';
		char entry2 = 'c';
		char entry3 = 'd';

		System.out.print(myDemoPList.accessNode(0));
		System.out.print("  ");



		// Possibility 1: first running through the list with a simple for 
		// loop and accessNode method (no iterator)
		
		myDemoPList.insertNode(entry1);
		myDemoPList.insertNode(entry2);
		myDemoPList.insertNode(entry3);

		System.out.println(myDemoPList.getSize());

		for(int i=0; i< myDemoPList.getSize()+1; i++){

			System.out.print(myDemoPList.accessNode(i));
			System.out.print("  ");

		}
		System.out.println("  ");
		System.out.println("Using the iterator");



		// Possibility 2: use the iterator on Elements

		// printing first elem
		System.out.print(myDemoPList.accessNode(0));
		System.out.print(" ");

		for(Character s : myDemoPList){

			System.out.print(s);
			System.out.print(" ");


		}

		System.out.println(" ");

		
		// Possibility 3: use the iterator on Positions

		// printing first elem
		System.out.print(myDemoPList.accessNode(0));
		System.out.print(" ");


		for(Position<Character> p : myDemoPList.position()){

			System.out.print(myDemoPList.getElementFromPosition(p));
			System.out.print(" ");


		}

		System.out.println(" ");

		




	}
}