// This Program demonstrates a simple Insertion Sorting Structure
import java.util.Arrays;

class InsertionSort {
  void insertionSort(int array[]) {
    int n = array.length;
    for (int j = 1; j < n; j++) {
      int key = array[j];
      int i = j - 1;
      while ((i > -1) && (array[i] > key)) {
        array[i + 1] = array[i];
        i--;
      }
      array[i + 1] = key;
    }
  }

  public static void main(String a[]) {
    int[] arr = { 8, 22, 5, 15, 18, 32, 3, 72 };
    System.out.println("Unsorted Array: ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();

    insertionSort(array);

    System.out.println("Sorted Array: ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
