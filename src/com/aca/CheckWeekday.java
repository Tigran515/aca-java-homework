package com.aca;

import java.util.Scanner;

public class CheckWeekday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7");
        int number = scanner.nextInt();               //@TODO: add input-filter, whole number only

        if (number > 0 && number < 8) {                    //TASK#7
            if (number == 1) {
                System.out.println("It's Monday");
            }
            if (number == 2) {
                System.out.println("It's Tuesday");
            }
            if (number == 3) {
                System.out.println("It's Wednesday");
            }
            if (number == 4) {
                System.out.println("It's Thursday");
            }
            if (number == 5) {
                System.out.println("It's Friday");
            }
            if (number == 6) {
                System.out.println("It's Saturday");
            }
            if (number == 7) {
                System.out.println("It's Sunday");
            }
        } else {
            System.out.println("Wrong number. Please,input a number in 1-7 range");
        }
    }
}