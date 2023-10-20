package Easy;

import java.util.*;
import java.util.stream.Collectors;

public class KthLargest {

    int k;
    ArrayList<Integer> arrNums;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        arrNums = Arrays.stream(nums) .boxed() .collect(Collectors.toCollection(ArrayList::new));
        arrNums.sort(Collections.reverseOrder());
    }

    public int add(int val) {
        int index = Collections.binarySearch(arrNums, val, Collections.reverseOrder());
        if ( index < 0)
            index = -index - 1;
        arrNums.add(index, val);
        return arrNums.get(this.k-1);
    }


    public static void main(String[] args) {
        int[] test = new int[]{4,5,8,2};
        var kth = new KthLargest(3,test);
        System.out.println(kth.add(3));// return 4
        kth.add(5);   // return 5
        kth.add(10);  // return 5
        kth.add(9);   // return 8
        kth.add(4);   // return 8


    }
}
