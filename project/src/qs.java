
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class qs {
    
    static int[] array = { 10, 97, 28, 79, 111, 54, 62, 20, 44 };
    
    // A utility function to swap two elements
    static void swap(int[] arr, int i, int j)
    {
        int temp = array[i];
        array[i] = arr[j];
        array[j] = temp;
    }
  
    /* This function takes last element as pivot, places
       the pivot element at its correct position in sorted
       array, and places all smaller (smaller than pivot)
       to left of pivot and all greater elements to right
       of pivot */
    static int partition(int[] arr, int low, int high)
    {
  
        // pivot
        int pivot = array[high];
  
        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);
  
        for (int j = low; j <= high - 1; j++) {
  
            // If current element is smaller
            // than the pivot
            if (array[j] < pivot) {
  
                // Increment index of
                // smaller element
                i++;
                swap(array, i, j);
                System.out.println("Swap("+i+"-"+j+")");
            }
        }
        swap(array, i + 1, high);
        return (i + 1);
    }
  
    /* The main function that implements QuickSort
              arr[] --> Array to be sorted,
              low --> Starting index,
              high --> Ending index
     */
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
  
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(array, low, high);
            System.out.println("L = "+low+" R = "+high+" pivot = "+pi);
            System.out.println(Arrays.toString(Arrays.copyOfRange(array, low, high + 1)));
            System.out.println("------------");
            // Separately sort elements before
            // partition and after partition
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }
  
    // Function to print an array
    static void printArray(int[] arr, int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
  
        System.out.println();
    }
  
    // Driver Code
    public static void main(String[] args)
    {   // 10 28 20 79 111 54 62 97  44
        int[] arr = { 10, 97, 28, 79, 111, 54, 62, 20, 44 };
        int n = array.length;
  
        quickSort(array, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(array, n);
    }
}
