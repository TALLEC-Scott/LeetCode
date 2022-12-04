package org.example;

import jdk.jfr.Unsigned;

public class MultiplyStrings {

    private int chartoi(char c)
    {
        return c - '0';
    }
    private long atoi(String num)
    {
        long res = 0;
        for (int i = 0; i < num.length(); i++){
            int digit = chartoi(num.charAt(i));
            res*=10;
            res += digit;
        }
        return res;
    }
    public String multiply(String num1, String num2) {
        long x = atoi(num1) * atoi(num2);
        return Integer.toString((int) x);
    }

    public static void main(String[] args) {
        var bs = new MultiplyStrings();
        System.out.println(bs.atoi("5421005"));
        System.out.println(bs.multiply("123456789","987654321"));
        //Expected : "121932631112635269"
    }
}
