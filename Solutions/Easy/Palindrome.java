package org.example;

public class Palindrome {

    public boolean isPalindrome(int x) {
        //TODO :  if the reversed number is larger than int.MAXint.MAX, we will hit integer overflow problem.
        //TODO : Deal with this
        if (x < 0)
            return false;
        int xCopy = x;
        long xInverted = 0;
        while (xCopy != 0) {
            xInverted *= 10;
            xInverted += xCopy % 10;
            xCopy = xCopy / 10;
        }
        if (xInverted > Integer.MAX_VALUE) {
           // System.out.println(xInverted);
            return x == (int) xInverted;
        }
        return false;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        for (int i = 0 ; i < 2147483647; i++) {
            System.out.println(i);
            if (palindrome.isPalindrome(i))
                System.out.println(i);

        }
            var res = palindrome.isPalindrome(2147399999);
        System.out.println(res);
        long x = 2147483647;
        x++;
        System.out.println((int) x);


    }
}
