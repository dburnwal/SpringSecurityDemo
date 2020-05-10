package com.db.tree;

// TODO: Auto-generated Javadoc
/**
 * The Class TreeHeight.
 */
public class TreeHeight {
	
	/**
	 * Height.
	 *
	 * @param root the root
	 * @return the int
	 */
	public static int height(BinaryTree root) {
		if (root == null)
			return 0;
		int l = height(root.left);
		int r = height(root.right);
		return l > r ? l + 1 : r + 1;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		BinaryTree root = TreeFactory.createTree();
		System.out.println(height(root));
		

	}

}
