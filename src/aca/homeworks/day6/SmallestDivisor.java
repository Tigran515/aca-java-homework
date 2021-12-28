package aca.homeworks.day6;

import java.util.Scanner;

public class SmallestDivisor {   //TASK # 4
                                         //@TODO: create a method 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number");
        int number = scanner.nextInt();
        int i = 3;

        if (number % 2 == 0) {
            System.out.println("smallest divisible is 2");
        } else if (number % 3 == 0) {
            System.out.println("smallest divisible is 3");
        } else if (number % number == 0) {
            System.out.println("smallest divisible is " + number);

        } else {
            while (number % i != 0) {
                i += 2;
            }
            System.out.println("smallest divisible is " + i);
        }
    }

}







