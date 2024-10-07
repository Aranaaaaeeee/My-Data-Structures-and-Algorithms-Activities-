public class SelectionSort {
    // Function to perform selection sort on an array
    public static void selectionSort(int[] array) {
        int n = array.length;

        // Traverse through the entire array
        for (int h = 0; h < n - 1; h++) {
            // Assume the current index is the minimum
            int minIndex = h;

            // Find the minimum element in the remaining unsorted part
            for (int i = h + 1; i < n; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;  // Update the index of the minimum element
                }
            }

            // Swap the found minimum element with the first unsorted element
            if (minIndex != h) {
                int temp = array[minIndex];
                array[minIndex] = array[h];
                array[h] = temp;
            }
        }
    }

    // Main function to test selection sort
    public static void main(String[] args) {
        int[] array = {94, 15, 52, 82, 9};

        System.out.println("The Unsorted Arrays are:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Sorting array using selection sort
        selectionSort(array);

        System.out.println("\nSorted Arrays:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
