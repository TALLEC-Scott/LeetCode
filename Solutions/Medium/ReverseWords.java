package org.example;

    import java.util.StringJoiner;

public class ReverseWords {
    public String reverseWords(String s) {
        StringJoiner sj = new StringJoiner(" ");
        var words = s.trim().split("\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            sj.add(words[i]);
        }
        return sj.toString();
    }

    public static void main(String[] args) {
        var input = "  hello world  ";
        var s = new ReverseWords();
        var output = s.reverseWords(input);
        System.out.println(output);
    }
}
