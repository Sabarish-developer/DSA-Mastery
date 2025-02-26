import java.util.Arrays;
import java.util.Random;

class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Selection sort");
        int[] arr = new int[8];
        // Populating array with random values -500 to 500
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (-500) + r.nextInt((500 + 500 + 1));
        }
        System.out.print("Unsorted array : ");
        System.out.println(Arrays.toString(arr));
        selectionsort(arr);
        System.out.print("Sorted array : ");
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionsort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
/*
 * Why Was Selection Sort Invented?
 * Selection Sort was developed as a simple, easy-to-understand sorting method.
 * It is useful for:
 * 
 * 1. Early Computers (Limited Memory)
 * Early computers had limited RAM and no dynamic memory allocation.
 * Selection Sort is in-place (i.e., it doesn’t need extra memory like Merge
 * Sort).
 * 
 * 2. Simplicity & Teaching Purposes
 * It is one of the easiest sorting algorithms to understand.
 * Often used to introduce sorting concepts in programming courses.
 * 
 * 3. Minimizing Swaps
 * Selection Sort does fewer swaps than Bubble Sort.
 * While Bubble Sort swaps on every comparison, Selection Sort only swaps once
 * per pass (at the end).
 * This is useful in cases where swap operations are costly (e.g., flash memory,
 * where writes are slow).
 * 
 * Time complexity - O(n^2) O(n^2) O(n^2)
 * Space complexity - O(1)
 */