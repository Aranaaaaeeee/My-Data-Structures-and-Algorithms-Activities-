public class MergeSort {
    // Function to merge two halves
    public static void merge(int[] array, int left, int mid, int right) {
        // Find sizes of the two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int h = 0; h < n1; h++)
            leftArray[h] = array[left + h];
        for (int h = 0; h < n2; h++)
            rightArray[h] = array[mid + 1 + h];

        // Initial indexes of left and right subarrays
        int h = 0, i = 0;

        // Initial index of the merged subarray
        int j = left;
        while (h < n1 && i < n2) {
            if (leftArray[h] <= rightArray[i]) {
                array[j] = leftArray[h];
                h++;
            } else {
                array[j] = rightArray[i];
                i++;
            }
            j++;
        }

        // Copy the remaining elements of leftArray, if any
        while (h < n1) {
            array[j] = leftArray[h];
            h++;
            j++;
        }

        // Copy the remaining elements of rightArray, if any
        while (i < n2) {
            array[j] = rightArray[i];
            i++;
            j++;
        }
    }

    // Function to sort the array using merge sort
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = (left + right) / 2;

            // Recursively sort first and second halves
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    // Main function to test merge sort
    public static void main(String[] args) {
        int[] array = {4, 17, 12, 1, 3, 11};

        System.out.println("The Unsorted Arrays are:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Sorting array using merge sort
        mergeSort(array, 0, array.length - 1);

        System.out.println("\nSorted Arrays:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
