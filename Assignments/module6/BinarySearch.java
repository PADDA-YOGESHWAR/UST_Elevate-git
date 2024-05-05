public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    private static int binarySearch(int[] arr, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Element found
            } else if (arr[mid] < target) {
                return binarySearch(arr, target, mid + 1, high); // Search in the right half
            } else {
                return binarySearch(arr, target, low, mid - 1); // Search in the left half
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 7;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
