package aca.homeworks.day4;

import java.util.Scanner;

public class ValueGenerator {    //TASK# 10    NOTE: I wrote the code for two cases of conditions requirements separately

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        boolean indicator = false;
        int number = scanner.nextInt();

        if (number > -1000 && number < 1000) {
            indicator = true;
            System.out.println("fitConditions: " + indicator);
        } else if (number % 3 == 0 || number % 5 == 0) {
            indicator = true;
            System.out.println("fitConditions: " + indicator);
        } else {
            System.out.println("fitConditions: " + indicator);
        }
    }

}
