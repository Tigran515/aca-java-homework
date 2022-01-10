package aca.homeworks.day8;

import java.util.Scanner;

public class ArrayEvenNumbers {    //TASK# 2

    public static void generateEvenNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        for (int element : numbers
        ) {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        }
    }

    public static void main(String[] args) {
        generateEvenNumbers();
    }
}
