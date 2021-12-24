package aca.homeworks.day4;

import java.util.Random;

class RandomNumberGenerator {    //TASK#3

    public static void main(String[] args) {
        Random random = new Random();
        int rangeStart = 2;
        int rangeEnd = 7;
        int mainRange = rangeStart + (rangeEnd - rangeStart + 1);
        int randomNumber = random.nextInt(mainRange);

        System.out.println("random number is " + randomNumber);
    }

}



//class RandomNumberGenerator {
//
//    public static void main(String args[]) {
//        Random rand = new Random();
//        int range = 10;
//        int intRandom = rand.nextInt(range);    // bound
//        System.out.println("Random number is  " + intRandom);
////
//    }
//}