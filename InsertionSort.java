public class InsertionSort {
    // Function to perform insertion sort
    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int d = 1; d < n; d++) {
            int key = array[d];
            int e = d - 1;

            // Move elements of the sorted segment that are greater than 'key' one position to the right
            while (e >= 0 && array[e] > key) {
                array[e + 1] = array[e];
                e--;
            }

            // Insert the key element at its correct position
            array[e + 1] = key;
        }
    }

    // Main function to test insertion sort
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};

        System.out.println("The Unsorted Arrays are:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Sorting array using insertion sort
        insertionSort(array);

        System.out.println("\nSorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
