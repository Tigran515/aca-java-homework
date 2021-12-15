package com.aca;

import java.util.Scanner;

//                                                    @TODO: rename the class
public class CheckIceCreamAvailability {    //TASK# 8

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many ice cream balls do you want to buy?");
        byte quantity = scanner.nextByte();

        if (quantity % 3 == 0 || quantity % 5 == 0 || quantity % 8 == 0 ) {
            System.out.println("here you go");
        } else {
            System.out.println("We sell ice cream only with 3 balls and 5 balls");
        }
    }
}