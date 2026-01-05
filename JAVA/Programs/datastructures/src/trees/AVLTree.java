package trees;

import trees.BinarySearchTreeTechniques.Node;

public class AVLTree {
	
	class Node{
		int key, height;
		Node left, right;
		Node(int key){
			this.key=key;
		}
	}
	Node root;
	int height(Node N) {
		if (N == null)
			return 0;
		return N.height;
	}
	
	int getBalance(Node N) {
		if (N == null)
			return 0;
		return height(N.left) - height(N.right);
	}
	
	// Right Rotation ( LL Case)
	public Node rightRotate(Node y) {
		Node x = y.left;
		Node T2 = x.right;

		// Perform rotation
		x.right = y;
		y.left = T2;

		// Update heights
		y.height = Math.max(height(y.left), height(y.right)) + 1;
		x.height = Math.max(height(x.left), height(x.right)) + 1;

		// Return new root
		return x;
	}
	
	// Left Rotation ( RR Case)
	public Node leftRotate(Node x) {
		Node y = x.right;
		Node T2 = y.left;

		// Perform rotation
		y.left = x;
		x.right = T2;

		// Update heights
		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;

		// Return new root
		return y;
	}
	
	// Insert Operation
	
	public Node insert(Node node, int key) {
		// 1. Perform the normal BST insert
		if (node == null)
			return (new Node(key));

		if (key < node.key)
			node.left = insert(node.left, key);
		else if (key > node.key)
			node.right = insert(node.right, key);
		else // Duplicate keys are not allowed
			return node;

		// 2. Update height of this ancestor node
		node.height = 1 + Math.max(height(node.left), height(node.right));

		// 3. Get the balance factor of this ancestor node to check whether
		// this node became unbalanced
		int balance = getBalance(node);

		// If this node becomes unbalanced, then there are 4 cases

		// Left Left Case
		if (balance > 1 && key < node.left.key)
			return rightRotate(node);

		// Right Right Case
		if (balance < -1 && key > node.right.key)
			return leftRotate(node);

		// Left Right Case
		if (balance > 1 && key > node.left.key) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}

		// Right Left Case
		if (balance < -1 && key < node.right.key) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		// return the (unchanged) node pointer
		return node;
	}
	
	public Node delete(Node root, int key) {
		if (root == null) {
			return root;
		}
		if (key < root.key)
			root.left = delete(root.left, key);
		else if (key > root.key)
			root.right = delete(root.right, key);
		else {
			// node with only one child or no child
            if ((root.left == null) || (root.right == null)) {
                Node temp = null;
                if (temp == root.left)
                    temp = root.right;
                else
                    temp = root.left;

                // No child case
                if (temp == null) {
                    root = null;
                } else // One child case
                {
                    root = temp; // Copy the contents of the non-empty child
                }
            } else {
                // node with two children: Get the inorder successor (smallest
                // in the right subtree)
                Node temp = minValueNode(root.right);

                // Copy the inorder successor's data to this node
                root.key = temp.key;

                // Delete the inorder successor
                root.right = delete(root.right, temp.key);
            }
        }
		return root;
		}
	
  
    
		public Node minValueNode(Node node) {
			Node current = node;

			/* loop down to find the leftmost leaf */
			while (current.left != null)
				current = current.left;

			return current;
		}
		
		// Tree Traversals
		public void preOrder(Node root) {
			// write the code for preOrder traversal
			if (root != null) {
				System.out.print(root.key + " ");
				preOrder(root.left);
				preOrder(root.right);
			}
			
		}

		public void inOrder(Node root) {
			// write the code for inOrder traversal

			if (root != null) {

				inOrder(root.left);
				System.out.print(root.key + " ");
				inOrder(root.right);
			}
		}

		public void postOrder(Node root) {
			// write the code for postOrder traversal
			if (root != null) {

				postOrder(root.left);
				postOrder(root.right);
				System.out.print(root.key + " ");
			}
		}
		

}

