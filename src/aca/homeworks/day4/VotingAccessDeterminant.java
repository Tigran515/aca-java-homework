package aca.homeworks.day4;
//IMPORTS:
import java.util.Scanner;

public class VotingAccessDeterminant {       //TASK#1

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, type your age");
        int voterAge = scanner.nextInt(); //@TODO: add input filter - positive numbers
        if (voterAge >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("Access denied. You are under 18");
        }
    }
}