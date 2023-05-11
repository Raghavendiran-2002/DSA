import java.util.Arrays;

public class MinimumDifference {

  static int minDifNaive(int arr[]) {
    int res = Integer.MAX_VALUE;
    for (int i = 1; i < arr.length; i++) for (int j = 0; j < i; j++) res =
      Math.min(res, Math.abs(arr[i] - arr[j]));
    return res;
  }

  static int minDifEff(int arr[]) {
    Arrays.sort(arr);
    int res = Integer.MAX_VALUE;
    for (int i = 1; i < arr.length; i++) {
      res = Math.min(res, arr[i] - arr[i - 1]);
    }
    return res;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 8, 12, 5, 18 };
    System.out.println(minDifNaive(arr));
    System.out.println(minDifEff(arr));
  }
}
