import java.util.*;

public class KnuthMorrisPratt {
    public static void main(String[] args) {
        String text = "aabckfgnabcdedabcd";
        String pattern = "abcd";
        List<Integer> list = KMP(text, pattern);
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static List<Integer> KMP(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();
        List<Integer> indices = new ArrayList<>();
        if (m > n) {
            return indices;
        }
        int[] lps = new int[m];
        computeLps(pattern, lps);
        int i = 0, j = 0;
        while (i < n) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }
            if (j == m) {
                indices.add(i - j);
                j = lps[j - 1];
            } else if (i < n && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }
        return indices;
    }

    private static void computeLps(String pattern, int[] lps) {
        int m = pattern.length();
        if (m == 0) {
            return;
        }
        int length = 0;
        int i = 1;
        lps[0] = 0;
        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0)
                    length = lps[length - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return;
    }
}