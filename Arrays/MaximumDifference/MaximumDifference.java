public class MaximumDifference {

  static int maxDif(int arr[]) {
    int res = arr[1] - arr[0];
    for (int i = 0; i < arr.length - 1; i++) for (
      int j = i + 1;
      j < arr.length;
      j++
    ) res = Math.max(res, arr[j] - arr[i]);
    return res;
  }

  static int maxDifEff(int arr[]) {
    int res = arr[1] - arr[0], minVal = arr[0];
    for (int i = 1; i < arr.length; i++) {
      res = Math.max(res, arr[i] - minVal);
      minVal = Math.min(minVal, arr[i]);
    }
    return res;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 10, 6, 4, 8, 1 };
    System.out.println(maxDif(arr));
    System.out.println(maxDifEff(arr));
  }
}
