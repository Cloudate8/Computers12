package com.cloudate9.module3.part2;

public class Tower {

    public static void move(int n, int from, int to, int spare) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
        } else {
            move(n - 1, from, spare, to);
            System.out.println("Move disk " + n + " from " + from + " to " + to);
            move(n - 1, spare, to, from);
        }
    }

    public static void main(String[] args) {
        int height = 4;
        Tower.move(height, 1, 2, 3);
    }
}
