package trees;

public class RedBlackTree {
	
	public  static final boolean RED = true;
	public  static final boolean BLACK = false;
	
	public class Node{
		public int data;
		public boolean color;
		public Node left, right, parent;

		public Node(int data) {
			this.data = data;
			this.color = RED; // New nodes are always red
			left = right = parent = null;
		}
	}
	
	public  Node root;
	
	public void leftRotate(Node x) {
		Node y = x.right;
		x.right = y.left;
		if (y.left != null) {
			y.left.parent = x;
		}
		y.parent = x.parent;
		if (x.parent == null) {
			root = y;
		} else if (x == x.parent.left) {
			x.parent.left = y;
		} else {
			x.parent.right = y;
		}
		y.left = x;
		x.parent = y;
	}
	
	public void rightRotate(Node y) {
		Node x = y.left;
		y.left = x.right;
		if (x.right != null) {
			x.right.parent = y;
		}
		x.parent = y.parent;
		if (y.parent == null) {
			root = x;
		} else if (y == y.parent.right) {
			y.parent.right = x;
		} else {
			y.parent.left = x;
		}
		x.right = y;
		y.parent = x;
	}
	
	public void insert(int data) {
        Node newNode = new Node(data);
        root = bstInsert(root, newNode);
        fixViolation(newNode);
    }
	
	public Node bstInsert(Node root, Node newNode) {
		if (root == null) {
			return newNode;
		}
		if (newNode.data < root.data) {
			root.left = bstInsert(root.left, newNode);
			root.left.parent = root;
		} else if (newNode.data > root.data) {
			root.right = bstInsert(root.right, newNode);
			root.right.parent = root;
		}
		return root;
	}
	
	public void fixViolation(Node node) {
		while (node != root && node.parent.color == RED) {
			if (node.parent == node.parent.parent.left) {
				Node uncle = node.parent.parent.right;
				if (uncle != null && uncle.color == RED) {
					node.parent.color = BLACK;
					uncle.color = BLACK;
					node.parent.parent.color = RED;
					node = node.parent.parent;
				} else {
					if (node == node.parent.right) {
						leftRotate(node.parent);
						leftRotate(node);
					}
					node.parent.color = BLACK;
					node.parent.parent.color = RED;
					rightRotate(node.parent.parent);
				}
			} else {
				Node uncle = node.parent.parent.left;
				if (uncle != null && uncle.color == RED) {
					node.parent.color = BLACK;
					uncle.color = BLACK;
					node.parent.parent.color = RED;
					node = node.parent.parent;
				} else {
					if (node == node.parent.left) {
						node = node.right;
						rightRotate(node.parent);
					}
					node.parent.color = BLACK;
					node.parent.parent.color = RED;
					leftRotate(node.parent.parent);
				}
			}
		}
	}
	
	public void inOrder(Node node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(node.data + " ");
			inOrder(node.right);
		}
	}
	public void preOrder(Node node) {
		if (node != null) {
			System.out.print(node.data + " ");
			inOrder(node.left);
			inOrder(node.right);
		}
	}
	
	public void postOrder(Node node) {
		if (node != null) {
			inOrder(node.left);
			inOrder(node.right);
			System.out.print(node.data + " ");
		}
	}
	

}
