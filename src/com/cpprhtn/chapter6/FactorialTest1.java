package com.cpprhtn.chapter6;

public class FactorialTest1 {
    public static void main(String args[]) {
        System.out.println(factorial(4));
    }

    static long factorial(int n) {
        long result=0;

        if (n == 1) return 1;

        return n * factorial(n-1);
    }
}
