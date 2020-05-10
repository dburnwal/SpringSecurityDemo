package com.db.sorting;

public class InsertionSort {
	public static void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					int t = a[j];
					a[j] = a[j - 1];
					a[j - 1] = t;
				} else {
					continue;
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = new int[] { 8, 6, 1, 4, 5, 3, 7, 2 };

		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println("\n");
		sort(a);
		for (int x : a) {
			System.out.print(x + " ");
		}
	}
}
