package org.example;

import java.util.HashSet;
import java.util.Set;

public class RandomizedSet {

    Set<Integer> set;
    public RandomizedSet() {
        set = new HashSet<>();

    }

    public boolean insert(int val) {
        return set.add(val);
    }

    public boolean remove(int val) {
        return set.remove(val);
    }

    public int getRandom() {
        var arr = set.toArray();
        int rand = (int) (Math.random() * arr.length);
        return (int) arr[rand];
    }

    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        var val = 4;
        boolean param_1 = obj.insert(val);
        obj.insert(5);
        obj.insert(6);

        obj.insert(8);
        obj.insert(10);

        boolean param_2 = obj.remove(val);
        int param_3 = obj.getRandom();
        System.out.println(param_3);
        Integer x = new Integer(3);
        x.toString();
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
