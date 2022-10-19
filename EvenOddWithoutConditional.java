package com.savage;

import java.util.Scanner;

public class EvenOddWithoutConditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenOrOdd(n);
    }

    private static void evenOrOdd(int n) {
        String[] arr = {"Even", "Odd"};
        System.out.println(arr[n%2]);
    }
}
