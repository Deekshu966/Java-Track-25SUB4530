package trees;

public class TestBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTreeTechniques bst = new BinarySearchTreeTechniques();
		int[] values = {50,30,20,40,70,60,80};
		
		for (int val : values) {
			bst.node = bst.insert(bst.node, val);
		}

		System.out.println("InOrder Traversal:");
		bst.inOrder(bst.node);
		System.out.println();
		System.out.println("Pre Order Traversal:");
		bst.preOrder(bst.node);
		System.out.println();
		System.out.println("Post Order Traversal:");
		bst.postOrder(bst.node);
		
		int keyToSearch = 170;
		boolean found = bst.search(bst.node, keyToSearch);
		System.out.println();
		if (found) {
			System.out.println("Key " + keyToSearch + " found in the BST.");
		} else {
			System.out.println("Key " + keyToSearch + " not found in the BST.");
		}
		
		int deleteKey = 50;
		bst.node = bst.delete(bst.node, deleteKey);
		System.out.println("InOrder Traversal after deleting " + deleteKey + ":");
		bst.inOrder(bst.node);
	}
}
