package com.db.test;

import org.junit.Before;
import org.junit.Test;

import com.db.stack.LinkedListStack;
import com.db.stack.Stack;

// TODO: Auto-generated Javadoc
/**
 * The Class LLStackTest.
 */
public class LLStackTest {
	
	/** The lls. */
	Stack<Integer> stack;
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		stack =  new LinkedListStack<>(3);
	}

	/**
	 * Test.
	 */
	@Test
	public void test() {
		this.stack.push(2);
		this.stack.push(5);
		this.stack.push(6);
	//	this.stack.push(1);
		System.out.println(this.stack.pop());
	}

}
