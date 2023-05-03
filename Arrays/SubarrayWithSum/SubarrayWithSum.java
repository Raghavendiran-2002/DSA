public class SubarrayWithSum {

  static boolean isSubSum(int arr[], int sum) {
    for (int i = 0; i < arr.length; i++) {
      int curr = 0;
      for (int j = i; j < arr.length; j++) {
        curr += arr[i];
        if (curr == sum) return true;
      }
    }
    return false;
  }

  static boolean isSubSumSlidingWindow(int arr[], int sum) {
    int curr = 0, s = 0;
    for (int i = 0; i < arr.length; i++) {
      curr += arr[i];
      while (sum < curr) {
        curr -= arr[s];
        s++;
      }
      if (curr == sum) return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[] = { 3, 2, 0, 4, 7 };
    System.out.println(isSubSum(arr, 6));
  }
}
