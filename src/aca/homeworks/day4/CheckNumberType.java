package aca.homeworks.day4;

import java.util.Scanner;

public class CheckNumberType {     //@TASK#2

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("isEven");
        } else {
            System.out.println("isOdd");
        }
    }

}
