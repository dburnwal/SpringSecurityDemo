/**
 * 
 */
package com.db.stack;

// TODO: Auto-generated Javadoc
/**
 * The Interface Stack.
 *
 * @author burnwal
 * @param <E> the element type
 */
public interface Stack<E> {
	
	/**
	 * Push.
	 *
	 * @param e the e
	 */
	void push(E e);
	
	/**
	 * Pop.
	 *
	 * @return the e
	 */
	E pop();
	
	int getSize();
}
