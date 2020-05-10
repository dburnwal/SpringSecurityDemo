package com.db.sorting;

public class MergeSort {
	public static void sort(int[] a) {
		int l = 0;
		int r = a.length - 1;

		mergeSort(a, l, r);

	}

	private static void mergeSort(int[] a, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			mergeSort(a, l, m);
			mergeSort(a, m + 1, r);
			merge(a, l, m, r);
		}
	}

	private static void merge(int[] a, int l, int m, int r) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
