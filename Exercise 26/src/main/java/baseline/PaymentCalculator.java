/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Fareed Ally
 */

package baseline;

public class PaymentCalculator
{
     double balance;
     double apr;
     double monthlyPayment;
     double months;

    public  PaymentCalculator(double balance, double apr, double monthlyPayment)
    {
        this.balance = balance;
        this.apr = apr;
        this.monthlyPayment = monthlyPayment;
    }

    public int calculateMonthsUntilPaidOff()
    {
       apr = apr/100;

       months = (-(1.0/30.0) * (Math.log(1 + ((balance/monthlyPayment) * (1 - (Math.pow((1 + apr/365), 30))))))) / (Math.log(1 + apr/365));

       months = Math.ceil(months);

       return(int) months;
    }
}
