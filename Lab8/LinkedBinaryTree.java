public class LinkedBinaryTree<E> extends AbstractBinaryTree<E> {


//instance variables + nested Node class
	protected static class Node<E> implements Position<E> {
		
		private E element;
		private Node<E> parent;
		private Node<E> left;
		private Node<E> right;
		/** Nested Node Class (Part I) */
		public Node(E e, Node<E> above, Node<E> leftChild, Node<E> rightChild) {
			
			element = e;
			parent = above;
			left = leftChild;
			right = rightChild;}


		public E getElement( ) { return element; }
		public Node<E> getParent( ) { return parent; }
		public Node<E> getLeft( ) { return left; }
		public Node<E> getRight( ) { return right; }
		public void setElement(E e) { element = e; }
		public void setParent(Node<E> parentNode)
		{ parent = parentNode; }
		public void setLeft(Node<E> leftChild)
		{ left = leftChild; }
		public void setRight(Node<E> rightChild)
		{ right = rightChild; }}



	protected Node<E> validate(Position<E> p) throws IllegalArgumentException {
		
		if (!(p instanceof Node)) throw new IllegalArgumentException("Not valid position type");

		Node<E> node = (Node<E>) p; // safe cast
		if (node.getParent( ) == node) throw new IllegalArgumentException("p is no longer in the tree");
			
		return node;

	}
				// accessor methods (not in AbstractBinaryTree)
	public int size( ) { return size;}
	public Position<E> root( ) { return root;}



	public Position<E> parent(Position<E> p) throws IllegalArgumentException {
	
		Node<E> node = validate(p);
		return node.getParent( );
	}
	/** Returns Position of left child */
	
	public Position<E> left(Position<E> p) throws IllegalArgumentException {
	
		Node<E> node = validate(p);
		return node.getLeft( );
	}
	
	/** Returns Position of right child */
	public Position<E> right(Position<E> p) throws IllegalArgumentException {
	
		Node<E> node = validate(p);
	
		return node.getRight( );
	}

	/** Places e at root of empty tree*/
	public Position<E> addRoot(E e) throws IllegalStateException {

		if (!isEmpty( )) throw new IllegalStateException("Tree is not empty");

		root = createNode(e, null, null, null);
		size = 1;
		return root;
	}
	
	/** Creates new left child of Position p */
	public Position<E> addLeft(Position<E> p, E e) throws IllegalArgumentException {

		Node<E> parent = validate(p);
		if (parent.getLeft( ) != null) throw new IllegalArgumentException("p already has a left child");

		Node<E> child = createNode(e, parent, null, null);
		parent.setLeft(child);
		size++;
		return child;
	}


	public Position<E> addRight(Position<E> p, E e) throws IllegalArgumentException {

		Node<E> parent = validate(p);
		if (parent.getRight( ) != null) throw new IllegalArgumentException("p already has a right child");

		Node<E> child = createNode(e, parent, null, null);
		parent.setRight(child);
		size++;
		return child;
	}

	/** Replaces the element at Position p with e */
	public E set(Position<E> p, E e) throws IllegalArgumentException {
	
		Node<E> node = validate(p);
		E temp = node.getElement( );
		node.setElement(e);
		return temp;
	}



	public void attach(Position<E> p, LinkedBinaryTree<E> t1, LinkedBinaryTree<E> t2) throws IllegalArgumentException {

		Node<E> node = validate(p);
		
		if (isInternal(p)) throw new IllegalArgumentException("p must be a leaf");
			size += t1.size( ) + t2.size( );
		if (!t1.isEmpty( )) { // attach t1 as left subtree
			
			t1.root.setParent(node);
			node.setLeft(t1.root);
			t1.root = null;
			t1.size = 0;
		}
		
		if (!t2.isEmpty( )) { // attach t2 as right subtree
			
			t2.root.setParent(node);
			node.setRight(t2.root);
			t2.root = null;
			t2.size = 0;
		}
	}

	public E remove(Position<E> p) throws IllegalArgumentException { // Part I

		Node<E> node = validate(p);
		if (numChildren(p) == 2) throw new IllegalArgumentException("p has two children");
		Node<E> child = (node.getLeft( ) != null ? node.getLeft( ) : node.getRight( ) );

		if (child != null) child.setParent(node.getParent( ));
		if (node == root) root = child; // child becomes root
		else {
			Node<E> parent = node.getParent( );
			if (node == parent.getLeft( ))
			parent.setLeft(child);
			else parent.setRight(child);
			}
		}











}