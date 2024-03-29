import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {

  public static void main(String[] args) {
    int arr[] = new int[] { 1, 9, 3, 4, 2, 10, 13 };

    int n = arr.length;

    System.out.println(findLongestEff(arr, n));
  }

  static int findLongestEff(int arr[], int n) {
    HashSet<Integer> s = new HashSet<>();
    int res = 0;

    for (int i = 0; i < n; i++) s.add(arr[i]);

    for (int i = 0; i < n; i++) {
      if (!s.contains(arr[i] - 1)) {
        int curr = 1;
        while (s.contains(curr + arr[i])) curr++;

        res = Math.max(res, curr);
      }
    }
    return res;
  }

  static int findLongestNaive(int arr[], int n) {
    Arrays.sort(arr);
    int res = 1, curr = 1;
    for (int i = 1; i < n; i++) {
      if (arr[i] == arr[i - 1] + 1) curr++; else {
        res = Math.max(res, curr);
        curr = 1;
      }
    }
    res = Math.max(res, curr);
    return res;
  }
}
