/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Fareed Ally
 */

// Ask user for balance and card and monthly payment (IN METHOD)
// Call calculateMonthsUntilPaidOff from other class
// Print final result

package baseline;

import java.util.Scanner;

public class Solution26
{
    private static final Scanner in = new Scanner(System.in);

    private double balance;
    private double apr;
    private double monthlyPayment;
    private double months;

    private double input(String prompt)
    {
        System.out.printf(prompt);
        return in.nextDouble();
    }

    public static void main(String[] args)
    {
        Solution26 main = new Solution26();

        main.balance = main.input("What is your balance? ");
        main.apr = main.input("What is the APR on the card (as a percent)? ");
        main.monthlyPayment = main.input("What is the monthly payment you can make? ");

        // Creating an object PaymentCalculator that will pass the inputs so it can calculate the months
        PaymentCalculator payment = new PaymentCalculator(main.balance, main.apr, main.monthlyPayment);

        main.months = payment.calculateMonthsUntilPaidOff();

        System.out.printf("It will take you %.0f months to pay off this card.", main.months);
    }

}
