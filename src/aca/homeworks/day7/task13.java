package aca.homeworks.day7;

import java.util.Scanner;

public class task13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int a = scanner.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}