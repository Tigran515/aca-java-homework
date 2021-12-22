package com.aca;

import java.util.Scanner;
import java.lang.Math;

public class SolveQuadraticEquation {  //TASK# 14

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a =");
        int a = scanner.nextInt();
        System.out.println("b =");
        int b = scanner.nextInt();
        System.out.println("c =");
        int c = scanner.nextInt();
        double discriminant = (b * b) - 4 * a * c;
        double discSqRoot = Math.sqrt(discriminant);
        double x_1, x_2;

        if (discriminant > 0) {
            x_1 = (-b + discSqRoot / 2 * a);
            x_2 = (-b - discSqRoot / 2 * a);
            System.out.println("x1= " + Math.round(x_1) + " x2= " +  Math.round(x_2));

        } else if (discriminant == 0) {
            x_1 = (-b / 2 * a);
            System.out.println("x1=x2= " + Math.round(x_1));


        } else if (discriminant < 0) {
            System.out.println("Can't be");

        }
    }

}
