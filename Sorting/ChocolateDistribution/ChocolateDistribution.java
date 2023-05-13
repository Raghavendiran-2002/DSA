import java.util.Arrays;

public class ChocolateDistribution {

  static int chocoDisMinDiff(int arr[], int m) {
    int n = arr.length;
    if (m > n) return -1;
    Arrays.sort(arr);
    int res = arr[m - 1] - arr[0];
    for (int i = 1; (i + m - 1) < n; i++) res =
      Math.min(res, arr[i + m - 1] - arr[i]);
    return res;
  }

  public static void main(String[] args) {
    int arr[] = { 7, 3, 1, 8, 9, 12, 56 };
    System.out.println(chocoDisMinDiff(arr, 3));
  }
}
