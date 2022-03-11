package com.company;

public class ForLoop {
    public static void main(String[] args) {
//        int total = 10000;
//        for(int i = 8; i > 1; i-- ){
//            double result = calculateInterest(total, i);
//            System.out.println(i + "% interest rate of 10.000 is: " + result);
//        }

        // For loop challenge
    /*
    Create For statement using range of numbers from 1 -> 1000 inclusive
    Sum all number that can be divided with both 3 and 5 -> print those number
    break the loop if you find 5 numbers then print the sum
     */
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= 1000; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                sum = sum + i;
                count++;
                System.out.println("Number is: " + i);
            }
            if (count == 5){
                break;
            }
        }
        System.out.println("Sum = " + sum);
    }

//    public static double calculateInterest(double amount, double interestRate){
//        return (amount * (interestRate/100));
//    }



}
