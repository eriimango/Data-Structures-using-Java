// This program demonstrates a simple Insertion Sort operation of the LinkedList Structure. It will output the unordered sort nodes and the sorted sort nodes.
// author: ericka h.
import java.util.Arrays;

class InsertionSort {
    void insertionSort(int array[]) {
        // sorting structure algorithm
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) { // swapping node from right for smaller node elements
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key; // new key after smallest element
        }
    }

    // Program driver
    public static void main(String args[]) {
        int[] arr = { 8, 22, 5, 15, 18, 32, 3, 72 };

        // displays unsorted array contents
        System.out.println("Unsorted Array: ");
        System.out.print(Arrays.toString(arr));

        System.out.println();

        // initiate sorted array
        InsertionSort sort = new InsertionSort();
        sort.insertionSort(arr);

        // displays sorted array contents
        System.out.println("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

