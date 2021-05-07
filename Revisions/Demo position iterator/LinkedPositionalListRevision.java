
import java.util.*;

public class LinkedPositionalListRevision<E> implements Iterable<E>{


	private Node<E> head;
	private Node<E> tail;

	private int size = 0;
 
	private static class Node<E> implements Position<E> {

		private Node<E> next;

		private E element;

		public Node(){}
		public Node(E e){

			next = null;
			element = e;
		}

		public E getElement(){

			return element;
		}

		public void setElement(E elem){

			element = elem;

		}

		public Node<E> getNext(){

			return next;

		}
		public void setNext(Node<E> n){

			next = n;
		}

	}

	public LinkedPositionalListRevision(E elem){

		head = new Node(elem);
		head.setNext(null);
	}

	public Node<E> validate(Position<E> p){

		Node<E> myNode = (Node<E>) p;

		return myNode;
	}



	public void insertNode(E elem){


		size ++;

		Node<E> currentNode = head;

		
		while(currentNode.getNext() != null){

			currentNode = currentNode.getNext();
			

			}

			Node<E> nextNode = new Node<>(elem);
			currentNode.setNext(nextNode);
		}
		





	public int getSize(){

		return size;

	}


	public E accessNode(int i){

		Node<E> start = head;

		int j = 0;
		while(j < i){

			start = start.getNext(); 

			j++;

		}

		return start.getElement();


	}


	// should be incremented each time next() is called 
	
	private int currentNodeNumber = 0;
	private int currentPositionNumber = 0;




	private class listIterator implements Iterator<E>{

		public boolean hasNext(){

			Node<E> current;
			current = head;

			int k = 0;

			while(k<currentNodeNumber){

				current = current.getNext();
				k++;


			}

			return current.getNext() != null;


		}
		public E next(){

			Node<E> current;
			current = head;

			int k = 0;

			while(k<currentNodeNumber){

				current = current.getNext();
				k++;


			}

			currentNodeNumber++;

			return current.getNext().getElement();

			

		}
		public void remove(){}

	}


	public Iterator<E> iterator(){

		Iterator<E> mylistIterator = new listIterator();

		return mylistIterator;
	}


	private class positionIterator implements Iterator<Position<E>>{



		public boolean hasNext(){

			Node<E> current;
			current = head;

			int k = 0;

			while(k<currentPositionNumber){

				current = current.getNext();
				k++;


			}

			return current.getNext() != null;


		}

		public Position<E> next(){

			Node<E> current;
			current = head;

			int k = 0;

			while(k<currentPositionNumber){

				current = current.getNext();
				k++;


			}

			currentPositionNumber++;

			return current.getNext();

		}

		public void remove(){}


	}


	public E getElementFromPosition(Position<E> p ){

		Node<E> myNode;
		myNode = (Node<E>) p;

		return myNode.getElement();


	} 





	// should return iterator on Positions

	private class PositionIterable implements Iterable<Position<E>>{

		public Iterator<Position<E>> iterator(){

			Iterator<Position<E>> myPositionIterator = new positionIterator();

			return myPositionIterator;

		}




	}



	public Iterable<Position<E>> position(){

		return new PositionIterable();


	}



}