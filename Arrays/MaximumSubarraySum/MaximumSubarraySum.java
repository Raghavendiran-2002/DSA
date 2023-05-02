public class MaximumSubarraySum {

  static int maxSumNaive(int arr[]) {
    int res = arr[0];
    for (int i = 0; i < arr.length; i++) {
      int curr = 0;
      for (int j = i; j < arr.length; j++) {
        curr = curr + arr[j];
        res = Math.max(res, curr);
      }
    }
    return res;
  }

  static int maxSumEff(int arr[]) {
    int res = arr[0];
    int maxEnding = arr[0];
    for (int i = 1; i < arr.length; i++) {
      maxEnding = Math.max(maxEnding + arr[i], arr[i]);
      res = Math.max(res, maxEnding);
    }
    return res;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, -8, 7, -1, 2, 3 };
    System.out.println(maxSumEff(arr));
    System.out.println(maxSumNaive(arr));
  }
}
