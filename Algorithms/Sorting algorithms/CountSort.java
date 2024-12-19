import java.util.*;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = { 5, 6, -3, 2, 10 };
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countSort(int[] arr) {

        if (arr == null || arr.length <= 1)
            return;

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }

        int range = max - min + 1;
        int[] count = new int[range];
        for (int num : arr) {
            count[num - min]++;
        }

        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                arr[index] = i + min;
                count[i]--;
                index++;
            }
        }
    }
}

/*
 * Time complexity - O(n+m)
 * Space complexity - O(m)
 */