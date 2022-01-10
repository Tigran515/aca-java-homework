package aca.homeworks.day14;

public class ArrayNumbersSum {   //TASK# 1.1

    public static int sumDigits(int[] arr, int i) {
        if (i == 0) {
            return 0;
        } else {
            return arr[i - 1] + sumDigits(arr, i - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 8};
        System.out.println(sumDigits(array, array.length));
    }
}
