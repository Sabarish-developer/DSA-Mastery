import java.util.Arrays;
import java.util.Random;

class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Insertion sort");
        int[] arr = new int[8];
        // Populating array with random values -500 to 500
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (-500) + r.nextInt((500 + 500 + 1));
        }
        System.out.print("Unsorted array : ");
        System.out.println(Arrays.toString(arr));
        insertionsort(arr);
        System.out.print("Sorted array : ");
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionsort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int element = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > element) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = element;
        }
    }
}
/*
 * Similar to human manual sorting,
 * Eg: Sorting the playing cards
 * Shell sort is improved version of this by Donald Shell (1959)
 * Efficient for Small or Nearly Sorted Data
 * 
 * Time complexity - O(n) O(n^2) O(n^2)
 * Space complexity - O(1)
 */