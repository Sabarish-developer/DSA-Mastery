import java.util.ArrayList;

public class RabinKarp {
    private static final int prime = 101;

    ArrayList<Integer> search(String pattern, String text) {
        int n = text.length();
        int m = pattern.length();

        ArrayList<Integer> result = new ArrayList<>();
        if (m > n) {
            return result;
        }
        int textHashValue = calculateHash(text, m);
        int patternHashValue = calculateHash(pattern, m);

        for (int i = 0; i <= n - m; i++) {
            if (textHashValue == patternHashValue && text.substring(i, i + m).equals(pattern)) {
                result.add(i + 1);
            }
            if (i < n - m) {
                textHashValue = recalculateHash(text, i, textHashValue, i + m);
            }
        }
        return result;
    }

    private static int calculateHash(String s, int length) {
        int hash = 0;
        for (int i = 0; i < length; i++)
            hash += (s.charAt(i) * prime);
        return hash;
    }

    private static int recalculateHash(String text, int oldIndex, int oldHash, int newIndex) {
        int oldCharValue = text.charAt(oldIndex) * prime;
        int newHash = oldHash + (text.charAt(newIndex) * prime);
        newHash -= oldCharValue;
        return newHash;
    }

}