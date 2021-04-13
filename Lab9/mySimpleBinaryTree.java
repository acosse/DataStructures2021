public class mySimpleBinaryTree<E> implements BinaryTreeInterface<E>{
	

private int size = 0;

private Node<E> root = null;

	
private static class Node<E> implements Position<E>{



	private E element;
	private Node<E> parent;
	private Node<E> left;
	private Node<E> right;


	public Node(E e, Node<E> above, Node<E> leftChild, Node<E> rightChild){

		element = e;
		parent = above;
		left = leftChild;
		right = rightChild;

	}


	public Node<E> getParent(){ return parent; }
	public Node<E> getLeftChild(){ return left; }
	public Node<E> getRightChild(){ return right;} 

	public void setLeft(Node<E> leftNode){

		left  = leftNode;
	}
	public void setRight(Node<E> rightNode){


		right = rightNode;
	}


	public E getElement(){return element;}


	}



public mySimpleBinaryTree(){}


public Position<E> root(){ return root; }


public int size(){return size; }

public boolean isEmpty(){ return size == 0 ; }


private Node<E> validate(Position<E> p){

	// assume that the position is a valid node 

	Node<E> mynode = (Node<E>) p;

	return mynode;}




public Position<E> parent(Position<E> p){

	Node<E> myNode = validate(p);

	return myNode.getParent();

}
public boolean isRoot(Position<E> p){

	Node<E> myNode = validate(p);
	return (root == myNode);

}

public Position<E> left(Position<E> p){

	Node<E> myNode = validate(p);
	return myNode.getLeftChild();

}
public Position<E> right(Position<E> p){

	Node<E> myNode = validate(p);
	return myNode.getRightChild();

}

public Position<E> sibling(Position<E> p){

	Node<E> myNode = validate(p);
	Node<E> myNodeParent = myNode.getParent();

	if (myNode == myNodeParent.getLeftChild()){
	return myNodeParent.getRightChild();
	}
	else{
		return myNodeParent.getLeftChild();

	}

}



public Position<E> addRoot(E rootelement){

	Node<E> myNewRootNode = new Node(rootelement, null, null, null);
	root = myNewRootNode;

	return root;

}

public Position<E> addLeft(Position<E> p, E myvalue){

	Node<E> parentNode = validate(p);

	Node<E> myNewNode = new Node(myvalue, parentNode, null, null);


	parentNode.setLeft(myNewNode);

	return myNewNode;


}

public Position<E> addRight(Position<E> p, E myvalue){

	Node<E> parentNode = validate(p);

	Node<E> myNewNode = new Node(myvalue, parentNode, null, null);


	parentNode.setRight(myNewNode);

	return myNewNode;


}





}




