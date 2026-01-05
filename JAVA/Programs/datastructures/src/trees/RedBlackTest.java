package trees;

public class RedBlackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RedBlackTree rbt = new RedBlackTree();
		int[] values = { 10, 20, 30, 15, 25, 5 };
		
		for (int val : values) {
			rbt.insert(val);
		}
		
		System.out.println("Red-Black Tree In order traversal ");
		rbt.inOrder(rbt.root);
		
		System.out.println("Red-Black Tree in Pre Order");
		rbt.preOrder(rbt.root);
		
		System.out.println("Red-Black Tree in Post Order");
		rbt.postOrder(rbt.root);

	}

}
