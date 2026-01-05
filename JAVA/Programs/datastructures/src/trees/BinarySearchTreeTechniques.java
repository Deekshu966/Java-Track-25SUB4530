package trees;

public class BinarySearchTreeTechniques {
	static class Node{
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	
	}
	Node node;

	public Node insert(Node root, int key) {
		// write the code to insert
		if (root == null) {
			return new Node(key);
		}

		if (key < root.data) {
			root.left = insert(root.left, key);
		} else if (key > root.data) {
			root.right = insert(root.right, key);
		}

		return root;
	}

	public boolean search(Node root, int key) {
		// write the code to search
		if (root == null)
			return false;
		if (root.data == key)
			return true;
		if (key < root.data)
			return search(root.left, key);
		else
			return search(root.right, key);

	}

	// Tree Traversals
	public void preOrder(Node root) {
		// write the code for preOrder traversal
		if (root != null) {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
		
	}

	public void inOrder(Node root) {
		// write the code for inOrder traversal

		if (root != null) {

			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}

	public void postOrder(Node root) {
		// write the code for postOrder traversal
		if (root != null) {

			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}

	public Node delete(Node root, int key) {
		// write the code to delete
		if (root == null)
			return root;
		
		if (key < root.data) {
			root.left = delete(root.left, key);
		} else if (key > root.data) {
			root.right = delete(root.right, key);
		} else {
			// Node with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// Node with two children: Get the inorder successor (smallest in the right
			// subtree)
			root.data = minValue(root.right);

			// Delete the inorder successor
			root.right = delete(root.right, root.data);
		}
		return root;
	}

	public int minValue(Node root) {
		// write the code to find min value
		int minv = root.data;
		while (root.left != null) {
			minv = root.left.data;
			root = root.left;
		}
		return minv;
	}
}
