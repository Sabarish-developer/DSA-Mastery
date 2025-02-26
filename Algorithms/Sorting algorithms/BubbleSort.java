import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Bubble sort");
        int[] arr = new int[20];
        // Populating array with random values -500 to 500
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (-500) + r.nextInt((500 + 500 + 1));
        }
        System.out.println(Arrays.toString(arr));
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubblesort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
/*
 * Before the inner loop starts, set swapped = false.
 * If a swap occurs during the pass, set swapped = true.
 * If no swaps occur in a pass, it means the array is already sorted, so we
 * break out of the loop early.
 * 
 * Time complexity - O(n) O(n^2) O(n^2)
 * Space complexity - O(1)
 */