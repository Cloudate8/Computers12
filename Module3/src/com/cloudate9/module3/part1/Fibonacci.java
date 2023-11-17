package com.cloudate9.module3.part1;

public class Fibonacci {

    public static int generateNumber(int n) {
        return (n <= 1) ? n : generateNumber(n - 1) + generateNumber(n - 2);
    }

    public static int generateSum(int n) {
        return (n <= 0) ? 0 : generateNumber(n + 2) - 1;
    }

    public static void main(String[] args) {
        System.out.println(generateSum(5));
        System.out.println(generateSum(10));
        System.out.println(generateSum(-1));
    }

}
