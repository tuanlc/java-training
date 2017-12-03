package com.train;

public class Palindrome {
    public static void main(String[] argv) {
        int n = 12321;
        boolean m = palindrom(n);

        if (m) {
            System.out.println("palindrome number");
        } else {
            System.out.println("not palindrome number");
        }
    }

    public static boolean palindrom(int n) {
        String m = Integer.toString(n);
        String[] queue = new String[m.length()];

        int j = 0;
        for(int i = m.length() - 1; i >= 0; i --) {
            queue[j] = String.valueOf(m.charAt(i));
            j ++;
        }

        String result = String.join("", queue);

        int k = Integer.parseInt(result);

        return k == n;
    }
}
