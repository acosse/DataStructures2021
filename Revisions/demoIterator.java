
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


		myDemoList.insertNode(entry1);
		myDemoList.insertNode(entry2);
		myDemoList.insertNode(entry3);

		System.out.println(myDemoList.getSize());

		for(int i=0; i< myDemoList.getSize(); i++){

			System.out.print(myDemoList.accessNode(i));
			System.out.print("  ");

		}
		System.out.println("  ");
		System.out.println("Using the iterator");


		// printing first elem
		System.out.print(myDemoList.accessNode(0));
		System.out.print(" ");

		// then using the iterator
		for(Character s : myDemoList){

			System.out.print(s);
			System.out.print(" ");


		}

		System.out.println(" ");

		// 	System.out.print(s);
		// }

		




	}











}