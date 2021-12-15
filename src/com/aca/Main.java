package com.aca;
//@IMPORTS:
import java.util.Scanner;

//@HOMEWORK:
public class Main {
//@TASK#1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input your age");
        int voterAge = scanner.nextInt();

        if (voterAge >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("Access denied. You are under 18");
        }
    }
}

//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("input the first value");
//        int valuOne = scanner.nextInt();
//        System.out.println("input the seccond one");
//        int valuTwo = scanner.nextInt();
//        int sum = valuOne%valuTwo;
//        System.out.println("product is" +sum);
//    }
//
//}