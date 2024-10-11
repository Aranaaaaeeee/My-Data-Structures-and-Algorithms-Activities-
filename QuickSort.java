public class QuickSort {
    
    public static int partition(int[] array, int low, int high) {
        // Choose the last element as the pivot
        int pivot = array[high];
        int h = (low - 1); // Index of smaller element

        for (int i = low; i < high; i++) {
            // If the current element is smaller than or equal to the pivot
            if (array[i] <= pivot) {
                h++;

                // Swap array[i] and array[j]
                int temp = array[h];
                array[h] = array[i];
                array[i] = temp;
            }
        }

        // Swap array[i + 1] with the pivot
        int temp = array[h + 1];
        array[h + 1] = array[high];
        array[high] = temp;

        return h + 1;  
    }

    // Function to implement quicksort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            
            int pi = partition(array, low, high);

            // Recursively sort elements before and after the partition
            quickSort(array, low, pi - 1);  
            quickSort(array, pi + 1, high); 
        }
    }

    // Main function to test quicksort
    public static void main(String[] args) {
        int[] array = {20, 40, 100, 10, 2, 8, 90};

        System.out.println("The Unsorted Arrays are:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Sorting array using quicksort
        quickSort(array, 0, array.length - 1);

        System.out.println("\nSorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
