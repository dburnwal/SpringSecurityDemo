/**
 * 
 */
package com.db.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.db.stack.ConcurrentStack;
import com.db.stack.Stack;

/**
 * @author burnwal
 *
 */
public class StackTest {

	/**
	 * @throws java.lang.Exception
	 */
	private Stack<Integer> stack;
	
	@Before
	public void setUp() throws Exception {
		stack =  new ConcurrentStack<>();
	}

	@Test
	public void test() {
		this.stack.push(2);
		this.stack.push(5);
		this.stack.push(6);
		this.stack.push(1);
		this.stack.push(7);
		this.stack.push(0);
		this.stack.push(4);
		Assert.assertEquals(7, stack.getSize());
		
		int top1 = this.stack.pop();
		Assert.assertEquals(4, top1);
		this.stack.pop();
		Assert.assertEquals(5, stack.getSize());
	}

}
