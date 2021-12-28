package aca.homeworks.day6;

import java.util.Scanner;

public class PowersOfTwo {     //TASK #5

    public static void main(String[] args) {//TODO@: review the code
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int power = 2;
        int value = 1;
        int inputValue = scanner.nextInt();
        int range = inputValue / power;

        while (value < range) {
            value *= power;
            System.out.println(value);
        }
        power += 2;

    }

}

