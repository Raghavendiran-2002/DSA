import java.util.HashSet;

public class SubarrayZeroSum {

  static boolean subArrays(int arr[]) {
    HashSet<Integer> hs = new HashSet<Integer>();
    int prefix_sum = 0;
    for (int i : arr) {
      prefix_sum += i;
      if (hs.contains(prefix_sum)) return true;
      if (prefix_sum == 0) return true;
      hs.add(prefix_sum);
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 4, 13, -3, -10, 5 };
    System.out.println(subArrays(arr));
  }
}
