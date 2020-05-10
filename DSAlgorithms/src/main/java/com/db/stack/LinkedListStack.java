/**
 * 
 */
package com.db.stack;

/**
 * @author burnwal
 *
 */
public class LinkedListStack<E> implements Stack<E> {
	private final int size;

	private Node<E> head;

	private int counter;

	public LinkedListStack(int size) {
		this.size = size;
	}

	@Override
	public void push(E e) {
		if (counter == size) {
			throw new RuntimeException("Stack is full !!");
		}
		Node<E> newNode = new Node<>(e);
		if (head == null) {
			head = newNode;
			counter++;
		} else {
			Node<E> temp = head;
			newNode.next = temp;
			head = newNode;
			counter++;
		}
	}

	@Override
	public E pop() {
		if (counter == 0)
			throw new RuntimeException("Stack is empty !!");
		E res = null;
		Node<E> temp = head;
		if (temp != null) {
			res = temp.data;
			temp = temp.next;
			head = temp;
			counter--;
		}
		return res;
	}

	@Override
	public int getSize() {
		return counter;
	}

	@SuppressWarnings("hiding")
	private class Node<E> {
		private E data;
		Node<E> next;
		public Node(E data) {
			this.data = data;
		}
	}

}
