import java.util.Arrays;

public class ShellSortDemo {
    
    
    public static void shellSort(int[] arr) {
        int n = arr.length;
        
        for (int gap = n/2; gap > 0; gap /= 2) {
            
            for (int i = gap; i < n; i += 1) {
                
                int temp = arr[i];
                
                
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                
               
                arr[j] = temp;
            }
        }
    }
    
   
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        
        int[] arr1 = {12, 34, 54, 2, 3};
        int[] arr2 = {64, 25, 12, 22, 11};
        int[] arr3 = {38, 27, 43, 3, 9, 82, 10};
        
        
        System.out.println("Original array 1:");
        printArray(arr1);
        shellSort(arr1);
        System.out.println("Sorted array 1:");
        printArray(arr1);
        
        System.out.println("\nOriginal array 2:");
        printArray(arr2);
        shellSort(arr2);
        System.out.println("Sorted array 2:");
        printArray(arr2);
        
        System.out.println("\nOriginal array 3:");
        printArray(arr3);
        shellSort(arr3);
        System.out.println("Sorted array 3:");
        printArray(arr3);
    }
}
