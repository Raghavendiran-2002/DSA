public class PrefixSum {

  static int getSumNaive(int arr[], int l, int r) {
    int res = 0;
    for (int i = l; i <= r; i++) {
      res += arr[i];
    }
    return res;
  }

  static int[] ps;

  static void getSumEffMain(int arr[], int l, int r) {
    ps = new int[arr.length];
    ps[0] = arr[0];
    for (int i = 1; i < arr.length; i++) {
      ps[i] = ps[i - 1] + arr[i];
    }
  }

  static int getSumEff(int l, int r) {
    if (l == 0) return ps[r];
    return ps[r] - ps[l];
  }

  public static void main(String[] args) {}
}
