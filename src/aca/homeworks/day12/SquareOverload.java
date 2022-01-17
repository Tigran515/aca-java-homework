package aca.homeworks.day12;

public class SquareOverload {   //TASK# 6

    public static float square(int circleRadius) {
        float p = (float) 3.14;

        return circleRadius * circleRadius * p;
    }

    public static float square(float squareSide) {

        return squareSide * squareSide;
    }

    public static int square(int a, int b) {

        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(square(2));
    }
}
