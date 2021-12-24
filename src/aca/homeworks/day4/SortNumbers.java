package aca.homeworks.day4;

import java.util.Scanner;

public class SortNumbers {

    public static void main(String[] args) {  //TASK# 15   I was short of time, so I didn't create a Class Constructor for this program to have more grammatical.
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        int a = scanner.nextInt();
        System.out.println("enter b");
        int b = scanner.nextInt();
        System.out.println("enter c");
        int c = scanner.nextInt();
        int[] arr = new int[]{a, b, c};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sort;
                if (arr[i] > arr[j]) {
                    sort = arr[i];
                    arr[i] = arr[j];
                    arr[j] = sort;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
