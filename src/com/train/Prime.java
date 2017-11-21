package com.train;

public class Prime {
    public static void main(String[] argv) {
        int n = 27;

        if (!isPrime(n)) {
            System.out.println(n + " is not a prime number");
        } else {
            System.out.println(n + " is a prime number");
        }
    }

    public static boolean isPrime(int n) {
        boolean result = true;

        switch (n) {
            case 0:
                result = false;
                break;
            case 1:
                result = true;
                break;
            case 2:
                result = true;
                break;
            default:
                for(int i = 2; i < n; i ++) {
                    if (n % i == 0) {
                        result = false;
                        break;
                    }
                }
                break;
        }

        return result;
    }
}
