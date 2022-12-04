package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.StreamSupport;

public class WordSearchII {

    public static boolean[][] deepCopyIntMatrix(boolean[][] input) {
        if (input == null)
            return null;
        boolean[][] result = new boolean[input.length][];
        for (int r = 0; r < input.length; r++) {
            result[r] = input[r].clone();
        }
        return result;
    }

    public static Boolean Recursive(char[][] board, String word, int x, int y, int word_index,boolean[][] mark)
    {
        if (word_index >= word.length())
            return true;
        if (x < 0 || x >= board[0].length || y < 0 || y >= board.length || mark[y][x])
        {
            return false;
            //Do nothing
        }
        mark[y][x] = true;

        if (board[y][x] == word.charAt(word_index)) {

            return
            Recursive(board, word, x + 1, y, word_index + 1, WordSearchII.deepCopyIntMatrix(mark)) ||
            Recursive(board, word, x - 1, y, word_index + 1, WordSearchII.deepCopyIntMatrix(mark)) ||
            Recursive(board, word, x, y + 1, word_index + 1, WordSearchII.deepCopyIntMatrix(mark)) ||
            Recursive(board, word, x, y - 1, word_index + 1, WordSearchII.deepCopyIntMatrix(mark));
        }

        return false;

    }
    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        if (board.length == 0)
            return res;
        for (var word :
                words) {



            outer : for (int y = 0; y < board.length; y++) {
                for (int x = 0; x < board[0].length; x++) {
                    boolean[][] mark = new boolean[board.length][board[0].length];

                    if(WordSearchII.Recursive(board, word,x,y,0,mark)) {
                        res.add(word);
                        break outer;
                    }
                }

            }
        }


        return res;
    }

    public static void main(String[] args) {
        WordSearchII wordSearchII = new WordSearchII();
        char[][] board = {{'a','b','c'},{'a','e','d'},{'a','f','g'}};
        boolean mark[][] = new boolean[board.length][board[0].length];
        String[] words = {"eaabcdgfa", "abcd", "abcc"};
        var res = wordSearchII.findWords(board,words);
        var res2 = WordSearchII.Recursive(board, "eaabcdgfa", 1, 1, 0, mark);
       System.out.println(res);
        System.out.println(res2);
        /**
         * a  b  c
         * a  e  d
         * a  f  g
         */

        //TODO: not fast enough, need to use trie structure whatever the fuck that means

    }
}
