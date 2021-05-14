
import java.io.*; 

public class testBinaryTree{


	public static void main(String[] args){



		binaryTreeDemo<Character> myTestTree = new binaryTreeDemo<>('a');


		binaryTreeDemo<Character> l = new binaryTreeDemo<>('b');
		binaryTreeDemo<Character> r = new binaryTreeDemo<>('c');

		Position<Character> p_l = myTestTree.addLeft(myTestTree.getRoot(), l);
		Position<Character> p_r = myTestTree.addRight(myTestTree.getRoot(), r);

		binaryTreeDemo<Character> ll = new binaryTreeDemo<>('d');
		binaryTreeDemo<Character> lr = new binaryTreeDemo<>('e');

		// binaryTreeDemo<Character> rl = new binaryTreeDemo<>('f');
		// binaryTreeDemo<Character> rr = new binaryTreeDemo<>('g');

		// Position<Character> p_ll = myTestTree.addLeft(p_l, ll);
		// Position<Character> p_lr = myTestTree.addRight(p_l, lr);

		// Position<Character> p_rl = myTestTree.addLeft(p_r, ll);
		// Position<Character> p_rr = myTestTree.addRight(p_r, lr);

		Position<Character> proot = myTestTree.getRoot();

		System.out.println(myTestTree.getTreeElement(proot));
		System.out.println(myTestTree.getTreeElement(p_l));
		System.out.println(myTestTree.getTreeElement(p_r));










	}
	




}