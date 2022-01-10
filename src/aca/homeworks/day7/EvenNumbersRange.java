package aca.homeworks.day7;

import java.util.Scanner;
import java.util.stream.IntStream;

public class EvenNumbersRange {

    public static void range(int a, int b) {
        if (a > b) {
            IntStream range = IntStream.range(a, b);
            range.forEach(element -> {
                if (element % 2 == 0) {
                    System.out.println(element);
                }
            });
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the start inclusive ");
        int a = scanner.nextInt();
        System.out.println("enter the  end exclusive ");
        int b = scanner.nextInt();

        range(a, b);
    }
}
