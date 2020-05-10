package com.db.recursion;

import java.util.Scanner;

/**
 * @author burnwal
 *
 */
public class Factorial {
    public static int fact(int n) {
        if (n == 1)
            return 1;

        return n * fact(n - 1);
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int input = scanner.nextInt();

            System.out.println(fact(input));
        }
    }
}
