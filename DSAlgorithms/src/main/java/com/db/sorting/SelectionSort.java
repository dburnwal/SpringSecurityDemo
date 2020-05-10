package com.db.sorting;

import java.util.stream.IntStream;

public class SelectionSort {

    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
                int temp = a[minIndex];
                a[minIndex] = a[i];
                a[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        IntStream iintStream = IntStream.generate(() -> {
            return (int) (Math.random() * 100);
        });

        int[] a = iintStream.limit(12).toArray();
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
