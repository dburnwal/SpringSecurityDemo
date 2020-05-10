package com.db;

public class HCF {
	
	public static int hcf(int a, int b) {
		int rem = -1;
		while (rem != 0) {
			rem = b % a;
			b = a;
			a = rem;

		}
		return b;
	}

	public static void main(String[] args) {
		int hcf = hcf(120, 390);
		System.out.println(hcf);
	}
}
