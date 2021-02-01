package com.numbers.all;

import java.util.Scanner;

public class EvenOddNumber {
    public static void checkEvenOrOdd() {
        Scanner numScan = new Scanner(System.in);
        System.out.println("Task 3) Enter number:");
        int number = numScan.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
