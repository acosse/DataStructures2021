

/* Data Structures, Assignment 3 
   CSCI-UA 9102 */

public class LinkedMeshgrid<E>{

	/* A simple linked meshgrid class */


	/* the private node class */


	/* maintain an array with all the element*/

	int height = 0;
	int width = 0;

	private static class Node<E> implements Position<E>{

		private E element;
		private Node<E> above;
		private Node<E> below;
		private Node<E> left;
		private Node<E> right;

		/* main constructor*/
		public Node(E e, Node<E> a, Node<E> b, Node<E> l, Node<E> r){

			element = e;
			above = a;
			below = b;
			left = l;
			right = r;



		}


		/* accessors and mutators */

		public E getElement(){

			return element;

		} 

		public Node<E> getLeft(){return left;}
		public Node<E> getRight(){return right;}
		public Node<E> getAbove(){return above;}
		public Node<E> getbelow(){return below;}

		public void setElement(E e){element = e;}

		public void setAbove(Node<E> a){above =a;} 
		public void setBelow(Node<E> b){below =b;} 
		public void setLeft(Node<E> l){left =l;} 
		public void setRight(Node<E> r){right =r;} 



	}

	private Node<E> header;
	private Node<E> trailer;


	/* Question 1: Main constructor for the LinkedMeshgrid class */
	public LinkedMeshgrid(int h, int w){

		
		header = new Node<>(null, null, null, null);
		trailer = new Node<>(null, null, header, null);
		header.setRight(trailer);



		/*To be done. Should initialize the Grid with height*width nodes */


	}


	public int grid_height(){return height;}
	public int grid_width(){return width;}

	/* validate the position and returns it as a node */
	
	private Node<E> validate(Position<E> p ) throws IllegalArgumentException{

		if(!(p instanceof Node)) throw new IllegalArgumentException("invalid p");
		Node<E> node = (Node<E>) p; // safe cast
		if (node.getNext()==null)
			throw new IllegalArgumentException("p is not longer in the list");
		return node; 
	}

	public boolean isEmpty{

		return ((height==0) && (width == 0));
	}


	/*returns given node as a position*/
	private Position<E> position(Node<E> node){

		if (node == header || node == trailer){return null;}
		return node ;
	}


	/* return first position in the list */

	public Position<E> first(){
		return position(header.getRight);
	} 

	public Position<E> last(){
		return position(trailer.getLeft);
	} 	


	/* returns the Position on the left of p*/
	public Position<E> leftPos(Position<E> p){
		
		// To be completed 


	} 

	/* returns the Position on the right of p*/
	public Position<E> rightPos(Position<E> p){
		
		// To be completed 


	} 


	/* returns the Position on top of p*/
	public Position<E> abovePos(Position<E> p){
		
		// To be completed 


	} 

	/* returns the Position below p*/
	public Position<E> belowPos(Position<E> p){
		
		// To be completed 


	} 




	/*replace the element stored at position p and return the value 
	previously stored at that position*/

	public E set(Position<E> p, E e)throws IllegalArgumentException{


		// to be completed. 

	}


	

		







}