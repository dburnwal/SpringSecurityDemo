/**
 * 
 */
package com.db;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author burnwal
 *
 */
public class FindHighest {

	public static int findKthLargest(int[] nums, int k) {
		Queue<Integer> priorityQueue = new PriorityQueue<>();
		for (int n : nums) {
			priorityQueue.offer(n);
			if (priorityQueue.size() > k)
				priorityQueue.poll();
		}
		return priorityQueue.peek();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = {7,8,1,4,0,11,6,3,13};
		int res = findKthLargest(nums, 4);
		System.out.println(res);
		
	}

}
