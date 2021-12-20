package com.aca;

import java.util.Scanner;

public class CheckMaxNumber {           //TASK#5

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        long a = scanner.nextLong();
        System.out.println("Enter the second number");
        long b = scanner.nextLong();
        System.out.println("Enter the third number");
        long c = scanner.nextLong();

        if (a > b && a > c) {
            System.out.println("Maximum number is  " + a);
        } else if (b > c) {
            System.out.println("Maximum number is  " + b);
        } else {
            System.out.println("Maximum number is  " + c);
        }
    }
}
