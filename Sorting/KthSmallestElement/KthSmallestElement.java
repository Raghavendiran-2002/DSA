import java.util.Arrays;

public class KthSmallestElement {

  static int kSmallestNaive(int arr[], int k) {
    Arrays.sort(arr);
    return arr[k - 1];
  }

  static int kSmallestEff(int arr[], int k) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
      int p = partition(arr, low, high);
      if (p == k - 1) return p; else if (p > k - 1) high = p - 1; else low =
        p + 1;
    }
    return 0;
  }

  static int partition(int arr[], int l, int h) {
    int pivot = arr[h];
    int i = l - 1;
    for (int j = l; j <= h - 1; j++) {
      if (arr[j] < pivot) {
        l++;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[h];
    arr[h] = temp;
    return i + 1;
  }

  public static void main(String[] args) {}
}
