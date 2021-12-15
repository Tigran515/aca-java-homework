package com.aca;

import java.util.Scanner;

public class OddEvenGenerator {   //TASK#12

    public static void main(String[] args) {
        int index;
        int reminder;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for the a");
        int a = scanner.nextInt();
        System.out.println("Enter value for the b");
        int b = scanner.nextInt();

        if (a % 7 == 0 && b % 7 == 0) {
            if (a > b && a > 0 && b > 0) {
                int c = b;
                int d = a;

                for (index = c; index <= d; index++) {
                    reminder = index % 2;
                    if (reminder == 1) {
                        System.out.println(index);
                    }
                }
            }
        } else {
            for (index = a; index <= b; index++) {
                reminder = index % 2;
                if (reminder == 0) {
                    System.out.println(index);
                }
            }
        }
    }
}

