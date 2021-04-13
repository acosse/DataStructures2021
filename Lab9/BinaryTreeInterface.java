public interface BinaryTreeInterface<E>{
	
// original model for binary


Position<E> root();

int size();
boolean isEmpty();

Position<E> parent(Position<E> p);
boolean isRoot(Position<E> p);

Position<E> left(Position<E> p);
Position<E> right(Position<E> p);

Position<E> sibling(Position<E> p); 

} 