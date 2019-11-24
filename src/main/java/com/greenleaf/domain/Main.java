package com.greenleaf.domain;

import java.lang.Math;


/**
 * Created by User on 9/3/2017.
 */
public class Main {

    public static void main(String[] args){

        calcCompoundInterest(500, 2, 2, 5);

        calcCompoundInterest(500, 2, 2, 10);

        calcCompoundInterest(500, 2, 2, 12);

        calcCompoundInterest(3400, 4, 2, 3);
    }

    /**
     * We want to implement the Compound Interest given :
     * We generally want to find the A (the amount of principal + compounded interest)

     * A - Ending payment
       P - Principal
       R - Interest Rate
       N - Number of compounding a year
       T - Total number of years

     * formula : A = P( 1 + r/n)nt
     * p * Math.pow(1 + (r / n), n * t);

     */
    public static double calcCompoundInterest(int principal, int interestRate
            , int numberOfCompoundingAYear, int totalNumberOfYears) {

        if (numberOfCompoundingAYear == 0){
            throw new RuntimeException();
        }

        // Compute Amount
        double amount = principal *
                 Math.pow(1 + (interestRate/numberOfCompoundingAYear), numberOfCompoundingAYear *totalNumberOfYears);

        System.out.println(String.format("The amount returned is: %s after %d years",amount, totalNumberOfYears));
        return amount;
    }



}
