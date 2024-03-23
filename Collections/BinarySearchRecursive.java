public class BinarySearchRecursive {
    // Function to perform binary search recursively
    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            // If the element is present at the middle itself
            if (arr[mid] == target)
                return mid;

            // If the element is smaller than mid, then it can only be present in the left subarray
            if (arr[mid] > target)
                return binarySearch(arr, low, mid - 1, target);

            // Else the element can only be present in the right subarray
            return binarySearch(arr, mid + 1, high, target);
        }

        // Element is not present in the array
        return -1;
    }

    // Main method to test the binary search algorithm
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        int result = binarySearch(arr, 0, arr.length - 1, target);
        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found in the array");
    }
}
