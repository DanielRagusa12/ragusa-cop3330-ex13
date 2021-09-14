package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class App
{
    public static void main( String[] args )
    {
        int P;
        double r;
        int t;
        int n;
        double investment_amount;
        Scanner input=new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        P=input.nextInt();

        System.out.print("What is the rate? ");
        r=input.nextDouble();

        System.out.print("What is the number of years? ");
        t=input.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        n=input.nextInt();


        double rate_converted=r/100;

        investment_amount=(1+rate_converted/n);

        investment_amount=Math.pow(investment_amount,n*t)*P;

        BigDecimal cent_rounding = new BigDecimal(investment_amount).setScale(2, RoundingMode.HALF_UP);
        double investment_rounded = cent_rounding.doubleValue();

        System.out.println("$"+(P)+" invested at "+(r)+"% for "+(t)+" years compounded "+ (n)+ " times per year is $"+(investment_rounded)+".");
        
    }
}

