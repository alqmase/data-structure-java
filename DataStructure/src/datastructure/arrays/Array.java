/**
 * @author      Mohammed Alqmase <alqumasi@gmail.com>
 * @version 0.1
 * @since 0.1
 */
package datastructure.arrays;

public class Array {

    /**
     * This method performs a linear search on an array to find a specific
     * element. It returns the index of the element if found, or -1 if the
     * element is not present in the array.
     *
     * @param arr The array to be searched
     * @param target The element to be searched for
     * @return The index of the target element, or -1 if not found
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method performs a binary search algorithm on a sorted array to find
     * the index of a target element.
     *
     * @param arr the sorted array to be searched
     * @param target the element to be found in the array
     * @return the index of the target element if found , -1 otherwise
     *
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * This method performs the insertion sort algorithm on an array of
     * integers. The insertion sort algorithm works by dividing the array into a
     * sorted and an unsorted portion. It iterates through the unsorted portion,
     * comparing each element with the elements in the sorted portion, and
     * inserts it at the correct position in the sorted portion.
     *
     * @param arr The array of integers to be sorted.
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /**
     * This method implements the bubble sort algorithm to sort an array of
     * integers in ascending order.
     *
     * @param arr The array of integers to be sorted
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * This method prints the elements of an array.
     *
     * @param arr The array to be printed.
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            // Print a comma after each element except the last one
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); // Print a new line after printing the array
    }
}
