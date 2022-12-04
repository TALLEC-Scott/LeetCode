package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class FrequencySort {
    public String frequencySort(String s) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        ArrayList<ArrayList<Character>> table = new ArrayList<>(s.length());
        for (int i = 0; i <s.length(); i++) {
            Character c = s.charAt(i);
            Integer count = hashMap.get(c);
            if (count == null)
                count = 0;
            

        }
        return null;


    }


}
