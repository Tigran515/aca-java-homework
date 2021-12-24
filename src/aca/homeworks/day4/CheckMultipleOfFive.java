package aca.homeworks.day4;

import java.util.Scanner;

public class CheckMultipleOfFive {            //TASK#4

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        if (number % 5 == 0) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

}