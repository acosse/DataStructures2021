/** An interface for positional lists. */
public interface PositionalList<E> { //Part I



int size( );
boolean isEmpty( );
/** Returns first/last Position in list (null, if empty). */
Position<E> first( );
Position<E> last( );
/** Returns Position before/after p (null, if p is first). */
Position<E> before(Position<E> p) throws
IllegalArgumentException;
Position<E> after(Position<E> p) throws
IllegalArgumentException;
/** Inserts e at the front and returns its Position. */
Position<E> addFirst(E e);

// Part II
/* Inserts e at back and returns new Position. /
Position<E> addLast(E e);
/** Inserts e before p and returns new Position. */
Position<E> addBefore(Position<E> p, E e)
throws IllegalArgumentException;
/** Inserts e after p and returns new Position. */
Position<E> addAfter(Position<E> p, E e)
throws IllegalArgumentException;
/** Replaces and return element at Position p */
E set(Position<E> p, E e) throws IllegalArgumentException;
/** Removes and return element at Position p */
E remove(Position<E> p) throws IllegalArgumentException;}