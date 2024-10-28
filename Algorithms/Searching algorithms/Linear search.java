public class Searching {
    public static int linearSearch(int[] array, int value){
        for(int i=0; i<array.length; i++){
            if(array[i] == value){
                System.out.println("The element "+ value+ " found at index "+ i+ " .");
                return i;
            }
        }
        System.out.println("The element "+ value+ " is not found.");
        return -1;
    }
}



/*
Time complexity - O(n)
Space complexity - O(1)

*/