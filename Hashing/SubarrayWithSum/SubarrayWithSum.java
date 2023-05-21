import java.util.HashSet;
import java.util.Set;

public class SubarrayWithSum {

  static boolean isSubArrayNaive(int arr[], int sum) {
    for (int i = 0; i < arr.length; i++) {
      int curr_sum = 0;
      for (int j = i; j < arr.length; j++) {
        curr_sum += arr[j];
        if (curr_sum == sum) return true;
      }
    }
    return false;
  }

  static boolean isSubArrayEff(int arr[], int sum) {
    int pre_sum = 0;
    Set<Integer> hs = new HashSet<Integer>();
    for (int i : arr) {
      pre_sum += i;
      if (pre_sum == sum) return true;
      if (hs.contains(pre_sum - sum)) return true;
      hs.add(pre_sum);
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[] = { 5, 8, 6, 13 };
    System.out.println(isSubArrayNaive(arr, 14));
    System.out.println(isSubArrayEff(arr, 14));
  }
}
