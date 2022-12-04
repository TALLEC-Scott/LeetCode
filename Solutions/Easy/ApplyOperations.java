package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class ApplyOperations {
    public int[] applyOperations(int @NotNull [] nums) {
        for(int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] == nums[i+1])
            {
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 0)
                count += 1;
            else if (count != 0)
            {
                nums[i-count] = nums[i];
                nums[i] = 0;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        var t = new ApplyOperations();
        var res = t.applyOperations(new int[]{1, 2, 2, 1, 1, 0});
        System.out.println(Arrays.toString(res));
    }
}
