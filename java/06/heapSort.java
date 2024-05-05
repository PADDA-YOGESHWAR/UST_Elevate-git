public class heapSort {
    public void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Heap sort
        for (int i = n - 1; i > 0; i--) {
            // Swap root (largest element) with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify root element
            heapify(arr, i, 0);
        }
    }

    void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    // Utility function to print array
    void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        heapSort heapSort = new heapSort();

        // Sorting small dataset
        int[] smallArray = {12, 11, 13, 5, 6, 7};
        System.out.println("Original small array:");
        heapSort.printArray(smallArray);
        heapSort.heapSort(smallArray);
        System.out.println("Sorted small array:");
        heapSort.printArray(smallArray);

        // Sorting large dataset
        int n = 10000;
        int[] largeArray = new int[n];
        for (int i = 0; i < n; i++) {
            largeArray[i] = (int) (Math.random() * 10000); // Random values up to 10000
        }
        long startTime = System.nanoTime();
        heapSort.heapSort(largeArray);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Convert to milliseconds
        System.out.println("Time taken to sort large array of size " + n + ": " + duration + " milliseconds");
    }
}
