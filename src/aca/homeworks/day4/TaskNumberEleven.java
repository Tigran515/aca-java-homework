package aca.homeworks.day4;

import java.util.Scanner;

public class TaskNumberEleven {             //TASK# 11

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b = scanner.nextInt();
        boolean aa = false;
        boolean bb = false;

        if (a > 10 && b != 10) {
            System.out.println("a is legal");
            System.out.println("b is legal");
        }


//        if (a > 10) {
//            aa = true;
//        }
//        if (b != 0) {
//            bb = true;
//        }
//        if (a>0){
//          aa=true;
//        }else if(a<0 && b>0){
//            bb=true;
//        }
//
//        if (aa) {   //@TODO: change all to Ternary
//            System.out.println(" a is legal");
//        } else {
//            System.out.println(" a is illegal");
//        }
//        if (bb) {
//            System.out.println(" b is legal");
//        } else {
//            System.out.println(" b is illegal");
//        }

    }
}

//    Scanner scanner = new Scanner(System.in);
//        System.out.println("input the first value");
//        int valuOne = scanner.nextInt();
//        System.out.println("input the seccond one");
//        int valuTwo = scanner.nextInt();
//        int sum = valuOne%valuTwo;
//        System.out.println("product is" +sum);