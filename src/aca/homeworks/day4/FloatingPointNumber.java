package aca.homeworks.day4;

import java.util.Scanner;

public class FloatingPointNumber {   //TASK#6

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        if (number > 0) {
            if (number < 1) {
                System.out.println("positive small");
            } else if (number > 1000000) {
                System.out.println("positive large");
            } else {
                System.out.println("positive");
            }
        } else if (number < 0) {
            if (Math.abs(number) < 1) {
                System.out.println("negative small");
            } else if (Math.abs(number) > 1000000) {
                System.out.println("negative large");
            } else {
                System.out.println("negative");
            }
        } else {
            System.out.println("zero");
        }
    }
}

