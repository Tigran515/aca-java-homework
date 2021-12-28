package aca.homeworks.day6;

import java.util.Scanner;

public class Task3 {   // Task # 3

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int i = 1;
        int positiveNumber = Math.abs(number);

        while (i < positiveNumber) {
            int square = i * i;

            if (square < positiveNumber) {
                System.out.println(i * i);

            }
            i++;
        }


    }
}
