

import java.io.*;

public class testPositionalList{


 	
	public static void main (String[] args){

		LinkedPositionalList<String> myList = new LinkedPositionalList<>();

		Position<String> myPosition; 


		myPosition = myList.addFirst("string0");

		//System.out.println(myPosition.getElement());


		for(int i=1; i<10; i++){

		myPosition = myList.addAfter(myPosition, "string" + i);

		}

	Position<String> myPosition2 = myList.first( ); 

		for(int i=0; i<myList.size(); i++){


			// Exercise 7.1  displaying content and the index

			System.out.println(myPosition2.getElement());
			System.out.println(myList.indexOf(myPosition2)); 

			myPosition2 = myList.after(myPosition2);


		}

		//Position<String> firstPosition_of_string5 = myList.findPosition("string5");

		String s = myList.set(myList.first(), "string0");

		System.out.println(s == "string0");

		//System.out.println(myList.set(firstPosition_of_string5, "string5")); 






	}






}