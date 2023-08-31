package datastructure.arrays;

public class Execution {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 0, 8};
        int index = Array.linearSearch(arr, 0);
        System.out.println(index);
        
        Array.bubbleSort(arr);
        Array.printArray(arr);
    }
}
