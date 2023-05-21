import java.util.HashMap;

public class LongestSubarraySum {

  static int isMaxLenNaive(int arr[], int sum) {
    int res = 0;
    for (int i = 0; i < arr.length; i++) {
      int curr_sum = 0;
      for (int j = i; j < arr.length; j++) {
        curr_sum += arr[j];
        if (curr_sum == sum) res = Math.max(res, j - i + 1);
      }
    }
    return res;
  }

  static int isMaxLenEff(int arr[], int sum) {
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    int pre_sum = 0, res = 0;
    for (int i = 0; i < arr.length; i++) {
      pre_sum += arr[i];
      if (pre_sum == sum) res = 1 + i;
      if (hm.containsKey(pre_sum) == false) hm.put(pre_sum, i);
      if (hm.containsKey(pre_sum - sum) == true) res =
        Math.max(res, i - hm.get(pre_sum - sum));
    }
    return res;
  }

  public static void main(String[] args) {
    int arr[] = { 3, 1, 0, 1, 8, 2, 3, 6 };
    int sum = 4;
    System.out.println(isMaxLenNaive(arr, sum));
    System.out.println(isMaxLenEff(arr, sum));
  }
}
