

public class LinkedPositionalList<E> implements PositionalList<E> {
// Nested Node Part I
private static class Node<E> implements Position<E> {
	
	private E element;
	private Node<E> prev;
	private Node<E> next;
	public Node(E e, Node<E> p, Node<E> n) {
	element = e;
	prev = p;
	next = n;}


	public E getElement( ) throws IllegalStateException {
		if (next == null) // convention for defunct node
		throw new IllegalStateException
		("Position no longer valid");
		return element;
	}

	public Node<E> getPrev( ) {
		return prev;
	}
	public Node<E> getNext( ) {
		return next;
	}
	public void setElement(E e) {
		element = e;
	}
	public void setPrev(Node<E> p) {
		prev = p;
	}
	public void setNext(Node<E> n) {
		next = n;}

}

	private Node<E> header; // header sentinel
	private Node<E> trailer; // trailer sentinel
	private int size = 0; // number of elements in the list

	/** Constructs a new empty list. */
	public LinkedPositionalList( ) {
	header = new Node<>(null, null, null); // create header
	trailer = new Node<>(null, header, null);
	// trailer is preceded by header
	header.setNext(trailer);
}


	private Node<E> validate(Position<E> p) throws IllegalArgumentException {
		if (!(p instanceof Node)) throw new
		IllegalArgumentException("Invalid p");
		Node<E> node = (Node<E>) p; // safe cast
		if (node.getNext( ) == null) // defunct node
		throw new IllegalArgumentException
		("p is no longer in the list");
		return node;
	}

	private Position<E> position(Node<E> node) {
		if (node == header || node == trailer)
		return null; // do not expose user to the sentinels
		return node;
	}


	public int size( ) { return size; }
	public boolean isEmpty( ) { return size == 0; }
	/** Returns the first Position (null if empty). */
	public Position<E> first( ) {
		return position(header.getNext( ));
	}
	/** Returns the last Position (null if empty). */
	public Position<E> last( ) {
		return position(trailer.getPrev( ));
	}
	/** Returns Position before p (null, if p is first). */
	public Position<E> before(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return position(node.getPrev( ));
	}
	/** Returns the Position after p (or null, if p is last). */
	public Position<E> after(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return position(node.getNext( ));
	}


	private Position<E> addBetween(E e, Node<E> pred, Node<E> succ) {
		Node<E> newest = new Node<>(e, pred, succ);
		pred.setNext(newest);
		succ.setPrev(newest);
		size++;
		return newest;
	}
	// public update methods
	/** Inserts e at the front/ returns new Position. */
	public Position<E> addFirst(E e) {
		return addBetween(e, header, header.getNext( )); 
	}
	/** Inserts e at the back and returns new Position. */
	public Position<E> addLast(E e) {
		return addBetween(e, trailer.getPrev( ), trailer); 
	}


	public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return addBetween(e, node.getPrev( ), node); 
	}
	/** Inserts e after p, and returns new Position. */
	public Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return addBetween(e, node, node.getNext( ));
	}
	/** Replaces the element at Position p
	and returns the replaced element. */
	public E set(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> node = validate(p);
		E answer = node.getElement( );
		node.setElement(e);
		return answer;
	}

		/** Removes element stored at Position p
	and returns it (invalidating p). */
	public E remove(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		Node<E> predecessor = node.getPrev( );
		Node<E> successor = node.getNext( );
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		E answer = node.getElement( );
		node.setElement(null); // help with garbage collection
		node.setNext(null); // and convention for defunct node
		node.setPrev(null);
		return answer;}


	public int indexOf(Position<E> p) throws IllegalArgumentException{
		// Solution to exercise 7.1 

		Node<E> node = validate(p);
		
		// 	
		
		Position counter = first();

		int i=0;
		while(counter != p){ 

			counter = after(counter);

			i++;}

		return i;

	}


	public Position<E> findPosition(E e){

		// Exercise 7.2. 

		E counterE;
		Position<E> counterP;
		Node<E> currentN;

		counterP = first();

		currentN = validate(counterP);

		counterE = currentN.getElement();



		while( (counterE != e) && (counterP!=last())){

			currentN = validate(counterP); 
			counterP = after(counterP);
			counterE = currentN.getElement();

		}

		if(counterP != last()){
		return counterP;
		}else{return null; }


	}





}

















