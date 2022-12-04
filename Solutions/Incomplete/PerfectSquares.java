package org.example;

import java.util.ArrayList;

public class PerfectSquares {


    public ArrayList<Integer> perfectSquares = new ArrayList<Integer>();

    private void setPerfectSquares()
    {
        var res = 1;
        var increment = 2;
        while (res <= 10000)
        {
            perfectSquares.add(res);
            res += increment;
            increment+=2;
        }
    }
    public int numSquares(int n) {
        int x;
//        while (n != 1) {
//            x = (int) Math.sqrt(n);
//            n -= x;
//        }
        var res = Math.sqrt((double) n);
        return (int) res;

    }

    public static void main(String[] args) {
        var x = new PerfectSquares();
        var res = x.numSquares(17);
        x.setPerfectSquares();
        System.out.println(res);
        System.out.println(x.perfectSquares);
    }
}
