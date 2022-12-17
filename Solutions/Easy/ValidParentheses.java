package Easy;

import java.util.HashSet;
import java.util.List;
import java.util.Stack;

class ValidParentheses {
    public static boolean valid(char c1, char c2)
    {
        if (c1 == '(' && c2 == ')')
            return true;
        if (c1 == '[' && c2 == ']')
            return true;
        if (c1 == '{' && c2 == '}')
            return true;
        return false;
    }
    public boolean isValid(String s) {
        HashSet<Character> close_bracket = new HashSet<>(List.of(')', ']', '}'));
        char c;
        var stk = new Stack<Character>();
        for (int i = 0; i < s.length(); i++)
        {
            c = s.charAt(i);
            if (!close_bracket.contains(c))
                stk.add(c);
            else if (stk.empty() || !ValidParentheses.valid(stk.pop(), c))
                return false;
        }
        return stk.empty();
    }
}
