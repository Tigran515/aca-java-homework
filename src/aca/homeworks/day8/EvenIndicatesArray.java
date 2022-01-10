package aca.homeworks.day8;

import java.util.Scanner;
//Task# 1

//
//public class EvenIndicatesArray {     Version 1
//
//    public static void findEvenIndex(int size) {
//        int[] array = new int[size];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i;
//        }
//        for (int j = 0; j < array.length; j += 2) {
//            System.out.println(array[j]);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the array size");
//        int size = scanner.nextInt();
//
//        findEvenIndex(size);
//    }
//}
public class EvenIndicatesArray {      //Version 2

    public static void evenIndex(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        evenIndex(number);
    }
}


