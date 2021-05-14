public class binaryTreeDemo<E>{


	TreeNode<E> root;

	private class TreeNode<E> implements Position<E>{

		TreeNode<E> parent;
		TreeNode<E> left;
		TreeNode<E> right;
		E element;

		public TreeNode(){};

		public TreeNode(E e, TreeNode<E> l, TreeNode<E> r, TreeNode<E> p){

			element = e;
			parent = p;
			left = l;
			right = r;

		}

		public E getElement(){

			return element;

		}

		public TreeNode<E> getParentnode(){

			return parent;
		}

		public TreeNode<E> getLeftChild(){

			return left;
		}

		public TreeNode<E> getRightChild(){

			return right;
		} 


		public void setLeftchild(TreeNode<E> N){

			left = N; 
		}

		public void setRightchild(TreeNode<E> N){

			right = N; 
		}








	}




	public TreeNode<E> getRoot(){
		
		return root;

	}

	public binaryTreeDemo(){



	}
	public binaryTreeDemo(E e){

		root  = new TreeNode<>(e, null, null, null);

	}

	public TreeNode<E> validate(Position<E> p){

		return (TreeNode<E>) p;




	}

	public Position<E> addLeft(Position<E> p, binaryTreeDemo<E> leftTree){

		TreeNode<E> myParentNode = validate(p);

		TreeNode<E> newRoot = leftTree.getRoot();

		myParentNode.setLeftchild(newRoot);

		return myParentNode.getLeftChild();


	}

	public Position<E> addRight(Position<E> p, binaryTreeDemo<E> rightTree){

		TreeNode<E> myParentNode = validate(p);

		TreeNode<E> newRoot = rightTree.getRoot();

		myParentNode.setRightchild(newRoot);

		return myParentNode.getRightChild();

	}


	public E getTreeElement(Position<E> p){

		TreeNode<E> myNode = validate(p);

		return myNode.getElement();


	}






	
	






}