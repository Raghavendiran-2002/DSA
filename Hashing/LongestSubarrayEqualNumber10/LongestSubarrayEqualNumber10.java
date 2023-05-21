import java.util.HashMap;

public class LongestSubarrayEqualNumber10 {

  static int longSubarrayNaive(int arr[]) {
    int res = 0;
    for (int i = 0; i < arr.length; i++) {
      int c0 = 0, c1 = 0;
      for (int j = i; j < arr.length; j++) {
        if (arr[j] == 0) c0 = c0 + 1; else c1 = c1 + 1;
        if (c0 == c1) res = Math.max(res, c0 + c1);
      }
    }
    return res;
  }

  static int longSubarrayEff(int arr[]) {
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    int sum = 0, maxLen = 0;
    for (int i = 0; i < arr.length; i++) arr[i] = (arr[i] == 0) ? -1 : 1;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (sum == 0) maxLen = i + 1;
      if (hm.containsKey(sum + arr.length) == true) {
        if (maxLen < i - hm.get(sum + arr.length)) maxLen =
          i - hm.get(sum + arr.length);
      } else hm.put(sum + arr.length, i);
    }
    return maxLen;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 1, 1, 0, 1, 0 };
    System.out.println(longSubarrayNaive(arr));
    System.out.println(longSubarrayEff(arr));
  }
}
