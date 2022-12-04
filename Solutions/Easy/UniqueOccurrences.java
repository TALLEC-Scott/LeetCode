package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int num:
             arr) {
            hashMap.merge(num, 1, Integer::sum);
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (var val :
                hashMap.values()) {
            if(!hashSet.add(val))
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        var t = new UniqueOccurrences();
        System.out.println(t.uniqueOccurrences(new int[]{0, 0, 0, 0, 0,1,2,2,1,1,3}));

    }
}
