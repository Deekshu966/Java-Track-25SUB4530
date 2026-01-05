package trees;

public class TestAVLTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVLTree avl = new AVLTree();
	    int[] values = {10, 20, 30, 40, 50, 25};
		for (int val : values) {
			avl.root = avl.insert(avl.root, val);
		}
		
		System.out.println("Pre Order Traversal of the constructed AVL tree is:");
		avl.preOrder(avl.root);
		System.out.println();
		System.out.println("In Order Traversal of the constructed AVL tree is:");
		avl.inOrder(avl.root);
		System.out.println();
		System.out.println("Post Order Traversal of the constructed AVL tree is:");
		avl.postOrder(avl.root);
		System.out.println();
		
		System.out.println("Deleting 10 from the AVL tree:");
		avl.root = avl.delete(avl.root, 10);
		System.out.println("Pre Order Traversal after deletion:");
		avl.preOrder(avl.root);

	}

}
