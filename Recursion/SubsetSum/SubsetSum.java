public class SubsetSum {

  static int subset(int arr[], int n, int sum) {
    if (n == 0) return (sum == 0) ? 1 : 0;
    return subset(arr, n - 1, sum) + subset(arr, n - 1, sum - arr[n - 1]);
  }

  public static void main(String[] args) {
    System.out.println(subset(new int[] { 10, 20, 15 }, 2, 25));
  }
}
