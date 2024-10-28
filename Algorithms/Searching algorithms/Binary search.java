public class Searching{
    public static int binarySearch(int array[], int value){

        int start = 0;
        int end = array.length-1;
        int middle;;
        while(start <= end){

            middle = (start+end)/2;

            if(array[middle] == value){
                System.out.println("The element "+value+ " found at index "+middle+" .");
                return middle;
            }

            if(value > array[middle])
                start = middle+1;
            else
                end = middle-1;

        }
        System.out.println("The element "+value+ " is not found.");
        return -1;
    }
}

/*
Time complexity - O(log n)

Space complexity - measures the maximum memory usage at any given time during execution.
    Iterative binary search: O(1) space complexity.
    Recursive binary search: O(logn) space complexity due to the call stack.

*/