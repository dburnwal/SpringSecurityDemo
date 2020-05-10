package com.db.stack;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The Class ConcurrentStack.
 *
 * @param <E> the element type
 */
public class ConcurrentStack<E> implements Stack<E>{
	private AtomicReference<Node<E>> head;
	private AtomicInteger size;
	
	public ConcurrentStack() {
		head =  new AtomicReference<>();
		size = new AtomicInteger(0);
	}
	
	@Override
	public void push(E e) {
		Node<E> newNode = new Node<>(e);
		Node<E> oldHead = null;
		do {
			oldHead = head.get();
			newNode.next = oldHead;
			size.incrementAndGet();
		} while (!head.compareAndSet(oldHead, newNode));
		
	}

	@Override
	public E pop() {
		Node<E> topHead = null;
		do {
			topHead = head.get();
			if(topHead == null) {
				return null;
			}
		} while (!head.compareAndSet(topHead, topHead.next));
		size.decrementAndGet();
		return topHead.data;
	}
	
	
	/**
	 * The Class Node.
	 *
	 * @param <E> the element type
	 */
	@SuppressWarnings("hiding")
	private class Node<E> {
		
		/** The data. */
		E data;
		
		/** The next. */
		Node<E> next;
		
		/**
		 * Instantiates a new node.
		 *
		 * @param e the e
		 */
		public Node(E e) {
			this.data   = e;
		}
	}
	
	@Override
	public int getSize() {
		return size.get();
	}
}
