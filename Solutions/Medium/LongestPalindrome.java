package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class LongestPalindrome {


    public static boolean genericIsPalindrome(String word)
    {
        for(int i = 0; i <  word.length()/2; i++)
        {
            if (word.charAt(i) != word.charAt(word.length()-i-1))
                return false;
        }
        return true;
    }

    public static boolean isPair(String word)
    {
        return word.charAt(0) == word.charAt(1);
    }
    public static String flip(String word)
    {
        return "" + word.charAt(1) + word.charAt(0);
    }
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        int res = 0;
        int numberOfLonePairs = 0;
        for(String word: words)
        {
            var value = hashMap.get(word);
            if(value != null)
            {
                if (LongestPalindrome.isPair(word))
                {
                    numberOfLonePairs--;
                }
                res += 4;

                if (--value == 0) {
                    hashMap.remove(word);
                }
                else
                    hashMap.put(word, value);
            }
            else
            {
                var val = hashMap.get(flip(word));
                if (val == null)
                    val = 0;
                hashMap.put(flip(word), val + 1);
                if (LongestPalindrome.isPair(word))
                    numberOfLonePairs++;


            }
        }
        if (numberOfLonePairs != 0)
            res +=2;
        return res;
    }

    public static void main(String[] args) {
        LongestPalindrome solution = new LongestPalindrome();
        String[] test = {"qo","fo","fq","qf","fo","ff","qq","qf","of","of","oo","of","of","qf","qf","of"};

        var adf = "fo fq  fo ff of qf of";

        var sol = solution.longestPalindrome(test);
        System.out.println(sol);
    }

}