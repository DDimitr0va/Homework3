package com.numbers.all;

import java.util.Scanner;

public class DayOfWeek {
    public void whichDayIs() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Task 1) Enter number from 1 to 7");
        int number = scan.nextInt();
        String weekday;

        switch (number) {
            case 1:
                weekday = "Monday";
                System.out.println("It is " + weekday);
                break;
            case 2:
                weekday = "Tuesday";
                System.out.println("It is " + weekday);
                break;
            case 3:
                weekday = "Wednesday";
                System.out.println("It is " + weekday);
                break;
            case 4:
                weekday = "Thursday";
                System.out.println("It is " + weekday);
                break;
            case 5:
                weekday = "Friday";
                System.out.println("It is " + weekday);
                break;
            case 6:
                weekday = "Saturday";
                System.out.println("It is " + weekday);
                break;
            case 7:
                weekday = "Sunday";
                System.out.println("It is " + weekday);
                break;
            default:
                System.out.println("Not valid");
        }
    }
}
