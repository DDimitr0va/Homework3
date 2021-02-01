package com.numbers.all;

import java.util.Scanner;

public class CompareNumbers {

    public void threeNumbersComparing() {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Task 4) Enter one number:");
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter second number:");
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Enter third number:");
        int num1 = scan1.nextInt();
        int num2 = scan2.nextInt();
        int num3 = scan3.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest Number");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest Number");
        } else {
            System.out.println(num3 + " is the largest Number");
        }
    }
}