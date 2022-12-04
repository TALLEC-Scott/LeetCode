package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;

public class ReverseVowels {
    private static final HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    private boolean isVowel(Character c) {
        c = Character.toLowerCase(c);
        return vowels.contains(c);
    }

    public static String swap(String word, int i, int j) {
        var input = word.toCharArray();
        char tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
        return new String(input);
    }

    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i != j) {
            while (i < s.length() && !isVowel(s.charAt(i))) {
                i++;
            }
            while (j >= 0 && !isVowel(s.charAt(j))) {
                j--;
            }
            if (i >= j)
                return s;
            s = ReverseVowels.swap(s, i, j);
            i++;
            j--;
        }
        return s;
    }

    public static void main(String[] args) throws IOException {
        ReverseVowels obj = new ReverseVowels();
        Path path = Paths.get("/home/scott/Projects/LeetCode/untitled/src/main/resources/test");
        String content = new String(Files.readAllBytes(path));
        var res = content.split(",");
        var size = res.length;

        for (var entry :
                res) {
            System.out.println(obj.reverseVowels(entry));

        }
        System.out.println(size);

    }
}
