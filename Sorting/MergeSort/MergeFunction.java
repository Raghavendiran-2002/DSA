import java.util.Arrays;

public class MergeFunction {

  static void merge(int arr[], int low, int mid, int high) {
    int n1[] = new int[mid - low + 1];
    int n2[] = new int[high - mid];
    for (int i = 0; i < n1.length; i++) n1[i] = arr[low + i];
    for (int i = 0; i < n2.length; i++) n2[i] = arr[mid + i + 1];
    int i = 0, j = 0, k = low;
    while (i < n1.length && j < n2.length) {
      if (n1[i] <= n2[j]) {
        arr[k] = n1[i];
        i++;
        k++;
      } else {
        arr[k] = n2[j];
        j++;
        k++;
      }
    }
    while (i < n1.length) {
      arr[k] = n1[i];
      k++;
      i++;
    }
    while (j < n2.length) {
      arr[k] = n2[j];
      j++;
      k++;
    }
  }

  public static void main(String[] args) {
    int a[] = new int[] { 10, 15, 20, 40, 8, 11, 15, 22, 25 };
    int l = 0, h = 8, m = 3;
    merge(a, l, m, h);
    System.out.println(Arrays.toString(a));
  }
}
