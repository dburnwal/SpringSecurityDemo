package com.db.recursion;

import java.util.Scanner;

public class Fibinacci {

	public static int fib(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		int res = fib(n - 1) + fib(n - 2);
		return res;

	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a number : ");
			int input = scanner.nextInt();
			System.out.println("0\n1\n1");
			for(int i=2;i<input;i++)
			{
				System.out.println(fib(i));
			}
			
		}
	}
}
