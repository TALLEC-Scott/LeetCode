package org.example;

import java.lang.reflect.Array;
import java.util.*;

/**
 * You are given a 0-indexed integer array nums of length n.
 *
 * The average difference of the index i is the absolute difference between the average of the first i + 1 elements of nums and the average of the last n - i - 1 elements. Both averages should be rounded down to the nearest integer.
 *
 * Return the index with the minimum average difference. If there are multiple such indices, return the smallest one.
 *
 * Note:
 *
 *     The absolute difference of two numbers is the absolute value of their difference.
 *     The average of n elements is the sum of the n elements divided (integer division) by n.
 *     The average of 0 elements is considered to be 0.
 *
 *
 * Interesting challenge, at first I thought of using Arrays.copyOfRange and computing the average for the 2
 * sub arrays. But doing this would require copying the array of length n, n times. Making the spatial complexity around
 * n**2. And also the time complexity, n**2. If I could do it in one pass and in place that would be way better.
 * What I'm thinking of instead, of reading nums every time the i changes. I just remove one value from one, and add
 * another to the other.
 */

public class MinimumAverageDifference {


    public int minimumAverageDifference(int[] nums) {

        var min = Integer.MAX_VALUE;
        int min_index = 0;

        var end = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        List<Integer> begin = new ArrayList<>();
        for (int i =  0; i < nums.length; i++) {

            begin.add(end.get(0));
            end.remove(end.get(0));
            var endAvgf = end.stream().mapToDouble(d -> d).average().orElse(0);
            var beginAvgf = begin.stream().mapToDouble(d -> d).average().orElse(0);
            var endAvgi = (int) endAvgf;
            var beginAvgi = (int) beginAvgf;

            var absDiff = Math.abs(endAvgi - beginAvgi);
            if (absDiff < min) {
                min = absDiff;
                min_index = i;
            }
        }
        return min_index;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 3};
        var obj = new MinimumAverageDifference();
        var res = obj.minimumAverageDifference(nums);
        System.out.println(res);
    }
}
