import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        // If lengths are different, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare sorted arrays
        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        System.out.println(isAnagram(s, t)); // Output: true
    }
}
