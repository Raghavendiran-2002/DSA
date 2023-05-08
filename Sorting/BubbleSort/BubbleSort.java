import java.util.Arrays;

public class BubbleSort {

  static void bubbleSort(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      //   for (int j = 0; j < arr.length - 1; j++) { // Unoptimized
      for (int j = 0; j < arr.length - i - 1; j++) { // Optimized
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  static void bubbleSortOptimized(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      boolean swapped = false;
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapped = true;
        }
      }
      if (swapped == false) break;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 10, 8, 20, 5 };
    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
    for (int i : arr) {
      System.out.println(i);
    }
  }
}
