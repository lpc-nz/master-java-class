package com.company;

import java.util.Scanner;

public class MinimumChallenge {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter how many number your want to check min");
        int count = scanner.nextInt();
        int[] myArray = readIntegers(count);
        int minNumber = (findMin(myArray));
        System.out.println("Your minimum number is " + minNumber);
    }

    public static int[] readIntegers(int count){
        int[] array = new int[count];
        System.out.println("Enter " + count + " integers number");

        for(int i = 0 ; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int minNumber = array[0];
        for (int j : array) {
            if (j <= minNumber) {
                minNumber = j;
            }
        }
        return minNumber;
    }
}
