package Easy;

public class MakeGood {
    public static boolean equals(Character c1, Character c2)
    {
        if(Character.isUpperCase(c1) ^ Character.isUpperCase(c2))
            return Character.toLowerCase(c1) == Character.toLowerCase(c2);
        return false;
    }
    public String makeGood(String s) {
        int index = 0;
        StringBuilder sb = new StringBuilder(s);
        while (index < sb.length()-1 ) {
            if (MakeGood.equals(sb.charAt(index), sb.charAt(index+1))) {
                sb.delete(index, index + 2);
                index--;
                index = Math.max(index, 0);
            }
            else {
                index++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        var s = "abBAcC";
        var test = new MakeGood();
        var res = test.makeGood(s);
        System.out.println(res);
    }
}
