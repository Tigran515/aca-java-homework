package aca.homeworks.day6;//package com.aca;
//
//import java.util.Arrays;
//import java.util.Scanner;
////
//public class MatchingNumberCounter {    //TASK#13
//
//
//    public static void main(String[] args) {
//            int count=0;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the 1st number");
//        int numberOne = scanner.nextInt();
//        System.out.println("Enter the 2nd number");
//        int numberTwo = scanner.nextInt();
//        System.out.println("Enter the 3rd number");
//        int numberThree = scanner.nextInt();
//
//        if (numberOne == numberTwo) {
//            count= count +1;
//
//        }else if(numberTwo ==numberThree ){
//            count= count +1;
//        }
//        System.out.println("count "+count);
//
//
//    }
//}
//
//
//public class MatchingNumberCounter {
//
//    // Return the number of pairs with equal
//    // values.
//    static int countPairs(int arr[], int n) {
//        int count = 0;
//
//        // for each index i and j
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] == arr[j]) {
//                    System.out.println("arr[i] == arr[j]");
//                    count = count + 1;
//                }
//
//            }
//        }
//
//        return count;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 1};
//        int n = arr.length;
//
//        System.out.println(countPairs(arr, n));
//    }
//}
////
