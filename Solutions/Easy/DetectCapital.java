package Easy;

public class DetectCapital {


    public boolean detectCapitalUse(String word) {
        if (word.toLowerCase().equals(word) || word.toUpperCase().equals(word))
            return true;
        if (Character.isLowerCase(word.charAt(0)))
            return false;
        return word.substring(1).equals(word.substring(1).toLowerCase());
    }

    public static void main(String[] args) {
        var x = new DetectCapital();
        var res = x.detectCapitalUse("HELLO");
        System.out.println(res);
    }
}
