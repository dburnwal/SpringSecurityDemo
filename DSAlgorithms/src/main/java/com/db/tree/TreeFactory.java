package com.db.tree;

/**
 * A factory for creating Tree objects.
 */
public class TreeFactory {
	
	/**
	 * Creates a new Tree object.
	 *
	 * @return the binary tree
	 */
	public static BinaryTree createTree()
	{
		BinaryTree root = new BinaryTree(3);
		root.left = new BinaryTree(4);
		root.right = new BinaryTree(5);
		
		root.left.left = new BinaryTree(6);
		root.left.right = new BinaryTree(9);
		
		root.right.right = new BinaryTree(2);
		root.right.left = new BinaryTree(11);
		
		root.left.left.left = new BinaryTree(10);
		root.left.right.right = new BinaryTree(12);
		
		return root;
	}
}
