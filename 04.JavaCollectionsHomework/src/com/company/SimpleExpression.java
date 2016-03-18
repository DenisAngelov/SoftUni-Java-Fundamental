package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class SimpleExpression {

    public static void main (String[] args){

        // You are given an arithmetic expression, consisting of positive numbers and '+' and '-' between them.
        // Write a program to calculate the value of the expression

        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        expression = expression.replace(" ", "");
        String[] numbers = expression.split("[^0-9.]+");
        String[] operators = expression.split("[0-9.]+");
        BigDecimal result = new BigDecimal(numbers[0]);

        for (int i = 1; i < operators.length; i++) {
            BigDecimal number = new BigDecimal(numbers[i]);
            if (operators[i].equals("+")){
                result = result.add(number);
            }else{
                result = result.subtract(number);
            }
        }

        System.out.println(result.toPlainString());
        //  5 -33   + 12 -  55-  1  - 2+6

    }
}