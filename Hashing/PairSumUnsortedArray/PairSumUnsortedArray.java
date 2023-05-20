import java.util.HashSet;

public class PairSumUnsortedArray {

  static boolean isPair(int arr[], int sum) {
    HashSet<Integer> hs = new HashSet<Integer>();
    for (int i : arr) {
      if (hs.contains(sum - i)) return true; else hs.add(i);
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[] = { 8, 3, 4, 2, 5 };
    int sum = 6;
    System.out.println(isPair(arr, sum));
  }
}
