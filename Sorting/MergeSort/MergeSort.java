import java.util.Arrays;

public class MergeSort {

  static void mergeSort(int arr[], int low, int high) {
    if (high > low) {
      int mid = low + (high - low) / 2;
      mergeSort(arr, low, mid);
      mergeSort(arr, mid + 1, high);
      merge(arr, low, mid, high);
    }
  }

  static void merge(int arr[], int low, int mid, int high) {
    int left[] = new int[mid - low + 1];
    int right[] = new int[high - mid];
    for (int i = 0; i < left.length; i++) left[i] = arr[i + low];
    for (int j = 0; j < right.length; j++) right[j] = arr[mid + 1 + j];
    int i = 0, j = 0, k = low;
    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        arr[k] = left[i];
        i++;
        k++;
      } else {
        arr[k] = right[j];
        k++;
        j++;
      }
    }
    while (i < left.length) {
      arr[k] = left[i];
      i++;
      k++;
    }
    while (j < right.length) {
      arr[k] = right[j];
      j++;
      k++;
    }
  }

  public static void main(String[] args) {
    int a[] = new int[] { 10, 5, 30, 15, 7 };
    int l = 0, r = 4;
    mergeSort(a, l, r);
    System.out.println(Arrays.toString(a));
  }
}
