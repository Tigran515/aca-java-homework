package aca.homeworks.day14;

import java.util.Scanner;

public class Factorial {  //TASK# 1.2

    public static int generateFactorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * generateFactorial(number - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number! ");
        int number = scanner.nextInt();
        System.out.println(number + "! is " + generateFactorial(number));
    }
}
