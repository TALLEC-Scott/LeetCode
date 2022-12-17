package Easy;

public class RemoveDuplicates {

    public String removeDuplicates(String s) {
        int index = 0;
        StringBuilder sb = new StringBuilder(s);
        while (index < sb.length()-1 ) {
            if (sb.charAt(index) == sb.charAt(index+1)) {
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
        var entry = "azxxzy";
        var output = new RemoveDuplicates().removeDuplicates(entry);
        System.out.println(output);
    }
}
