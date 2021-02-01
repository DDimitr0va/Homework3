package com.numbers.all;


public class Main {

    public static void main(String[] args) {
        int a = 15;
        int b = 6;
        int perimeter = 2 * (a + b);
        System.out.println("Task 2) The perimeter is " + perimeter);


        EvenOddNumber.checkEvenOrOdd();
        DayOfWeek dayOfWeek = new DayOfWeek();
        dayOfWeek.whichDayIs();
        CompareNumbers compareNumbers = new CompareNumbers();
        compareNumbers.threeNumbersComparing();
    }

}
