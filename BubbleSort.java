import java.util.Scanner;

public class BubbleSortProgram {
    
    // Function to perform Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped, the array is already sorted
            if (!swapped)
                break;
        }
    }
    
    // Function to print an array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        // Input: elements of the array
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Original array
        System.out.println("Original array:");
        printArray(arr);
        
        // Sorting the array
        bubbleSort(arr);
        
        // Sorted array
        System.out.println("Sorted array (Ascending Order):");
        printArray(arr);
        
        sc.close();
    }
}