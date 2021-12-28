package aca.homeworks.day4;

import java.util.Scanner;

class TriangleDeterminer {    //TASK# 12

    String statusMsg = "";  // can't find this.state example for Java like in JS. So that part is missing from the code.

    TriangleDeterminer(int a, int b, int c) {
        statusMsg = a + b > c && a + c > b && b + c > a ? "non-degenerate triangle" : "degenerate triangle";

        System.out.println(statusMsg);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in angle a");
        int a = scanner.nextInt();
        System.out.println("Type in angle b");
        int b = scanner.nextInt();
        System.out.println("Type in angle c");
        int c = scanner.nextInt();

        if(a!=0 && b!=0 && c!=0){
            TriangleDeterminer angles = new TriangleDeterminer(a, b, c);

        }else {
            System.out.println("angle can't be equal to 0");
        }

    }
}