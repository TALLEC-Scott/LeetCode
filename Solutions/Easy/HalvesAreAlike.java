package Easy;

public class HalvesAreAlike {
    private static boolean isVowel(Character c)
    {
        return (c == 'a' || c == 'e' || c == 'o' || c == 'u' || c=='i' || c == 'y');
    }
    public boolean halvesAreAlike(String s) {
        s  = s.toLowerCase();

        int firstHalf = 0;
        int secondHalf = 0;

        for (int i = 0; i < s.length(); i++) {
            if (HalvesAreAlike.isVowel(s.charAt(i))) {
                if (i < s.length() / 2)
                    firstHalf++;
                else
                    secondHalf++;
            }
        }
        return firstHalf == secondHalf;
    }

    public static void main(String[] args) {

    }
}
