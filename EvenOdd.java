// WAP to print sum of even and odd numbers till 100
package com.savage;

public class EvenOdd {
    public static void main(String[] args) {
        int evenSum = 0, oddSum = 0;

        for (int i=1; i<=100; i++) {
            if (i%2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("Sum of even numbers from 1 to 100: " + evenSum);
        System.out.println("Sum of odd numbers from 1 to 100: " + oddSum);

    }
}
