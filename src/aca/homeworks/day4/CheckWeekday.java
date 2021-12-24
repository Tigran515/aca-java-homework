package aca.homeworks.day4;

import java.util.Scanner;

public class CheckWeekday {
    public static void main(String[] args) {    //TASK#7
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7");
        int number = scanner.nextInt();               //@TODO: add input-filter, whole number only

        if (number > 0 && number < 8) {

            switch (number) {
                case 1:
                    System.out.println("It's Monday");
                    break;
                case 2:
                    System.out.println("It's Tuesday");
                    break;
                case 3:
                    System.out.println("It's Wednesday");
                    break;
                case 4:
                    System.out.println("It's Thursday");
                    break;
                case 5:
                    System.out.println("It's Friday");
                    break;
                case 6:
                    System.out.println("It's Saturday");
                    break;
                case 7:
                    System.out.println("It's Sunday");
                    break;
            }
        } else {
            System.out.println("Wrong number. Please,input a number in 1-7 range");
        }
    }
}
