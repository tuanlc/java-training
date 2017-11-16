package com.train;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;

        System.out.println("Fibonacci with recursive");
        for(int i = 0; i < n; i++) {
            System.out.print(recursive(i) + " ");
        }

        System.out.println("\nFibonacci without recursive");
        non_recursive(n);
    }

    public static int recursive(int n) {
        int m;
        switch (n) {
            case 0:
                m = 0;
                break;
            case 1:
                m = 1;
                break;
            default:
                m = recursive(n-1) +recursive(n-2);
                break;
        }

        return m;
    }

    public static void non_recursive(int n) {
        int pre = 0;
        int tmp;
        int fibo = 0;

        for (int i = 0; i < n; i ++) {
            if (i == 0) {
                System.out.print(0 + " ");
            } else if (i==1) {
                fibo = 1;
                System.out.print(1 + " ");
            } else {
                tmp = fibo;
                fibo += pre;
                pre = tmp;

                System.out.print(fibo + " ");
            }
        }
    }
}
