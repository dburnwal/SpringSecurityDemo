package com.db.tree;

/**
 * The Class LevelOrderTraversal.
 *
 * @author burnwal
 */
public class LevelOrderTraversal {
	
	/**
	 * Traverse using queue.
	 *
	 * @param root the root
	 */
	public static void traverseUsingQueue(BinaryTree root) {

	}
	
	/**
	 * Traverse using recursion.
	 *
	 * @param root the root
	 * @param level the level
	 */
	public static void traverseUsingRecursion(BinaryTree root, int level) {
		if (root != null) {
			if (level == 1) {
				System.out.print(root.data + "  ");
				return;
			}
			traverseUsingRecursion(root.left, level - 1);
			traverseUsingRecursion(root.right, level - 1);
		}
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		BinaryTree root = TreeFactory.createTree();
		int height = TreeHeight.height(root);
		System.out.println("Height=> " + height);
		for (int i = 1; i <= height; i++) {
			traverseUsingRecursion(root, i);
		}
	}
}
