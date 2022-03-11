package com.company;

public class ForLoop {
    public static void main(String[] args) {
        int total = 10000;
        for(int i = 8; i > 1; i-- ){
            double result = calculateInterest(total, i);
            System.out.println(i + "% interest rate of 10.000 is: " + result);
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
