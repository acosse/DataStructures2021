
import java.io.*;

public class demoIterator{
	
	// This is the demo file for the simple 



	public static void main(String[] args){



		char entry0 = 'a';
		LinkedListRevision<Character> myDemoList = new LinkedListRevision<>(entry0);


		char entry1 = 'b';
		char entry2 = 'c';
		char entry3 = 'd';

		System.out.print(myDemoList.accessNode(0));
		System.out.print("  ");



		// Possibility 1: first running through the list with a simple for 
		// loop and accessNode method (no iterator)
		
		myDemoList.insertNode(entry1);
		myDemoList.insertNode(entry2);
		myDemoList.insertNode(entry3);

		System.out.println(myDemoList.getSize());

		for(int i=0; i< myDemoList.getSize()+1; i++){

			System.out.print(myDemoList.accessNode(i));
			System.out.print("  ");

		}
		System.out.println("  ");
		System.out.println("Using the iterator");


		



		// Possibility 2: use the iterator

		// printing first elem
		System.out.print(myDemoList.accessNode(0));
		System.out.print(" ");

		for(Character s : myDemoList){

			System.out.print(s);
			System.out.print(" ");


		}

		System.out.println(" ");

		// 	System.out.print(s);
		// }

		




	}











}