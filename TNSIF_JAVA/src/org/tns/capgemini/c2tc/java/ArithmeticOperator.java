package org.tns.capgemini.c2tc.java;

public class ArithmeticOperator {

    public static void main(String[] args) {
        int a = 10, b = 5;

        int sum = a + b;
        System.out.println("addition : " + sum);

        int diff = a - b;
        System.out.println("sub : " + diff);

        int prod = a * b;
        System.out.println("mul : " + prod);

        int quotient = a / b;
        System.out.println("division : " + quotient);

        int remainder = a % b;
        System.out.println("remainder : " + remainder);
    }
}