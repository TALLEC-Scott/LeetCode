package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SumSubarrayMins {
    public int sumSubarrayMins(int[] arr) {
        ArrayList<Integer> arrayList;
        var res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int width = 1; width <= arr.length; width++) {
                int j = 0;
                arrayList = new ArrayList<>();

                while (j < width && i + j < arr.length) {
                    arrayList.add(arr[i + j]);
                    j++;
                }
                System.out.println(Collections.min((arrayList)));
                res += Collections.min(arrayList);
            }

        }
        return res;
    }

    public static void main(String[] args) {
        SumSubarrayMins sumSubarrayMins = new SumSubarrayMins();
        int[] arr = {3,1,2,4};
        var res = sumSubarrayMins.sumSubarrayMins(arr);
        System.out.println(res);



    }
}

