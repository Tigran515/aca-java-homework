package aca.homeworks.day4;

import java.util.Scanner;

public class LeapYearCheck {          //TASK#9

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        int number = scanner.nextInt();

        if (number % 4 == 0) {
            if (number % 100 == 0) {
                if (number % 400 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not a Leap Year");
                }
            } else {
                System.out.println("Leap Year");

            }
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
