package com.train;

public class factorial {
    public static void main(String[] args) {
        int n = 19;

        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        int result = 1;

        if (n < 0) {
            return 0;
        }

        switch (n) {
            case 0:
                result = 1;
                break;
            case 1:
                result = 1;
                break;
            default:
                for (int i = 1; i <= n; i ++) {
                    result *= i;
                }
                break;
        }

        return result;
    }
}
