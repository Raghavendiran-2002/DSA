import java.util.ArrayDeque;

public class PreviousGreaterElement {

  static void printPrevious(int arr[], int n) {
    ArrayDeque<Integer> s = new ArrayDeque<>();
    s.add(arr[0]);
    System.out.print(-1 + " ");
    for (int i = 1; i < n; i++) {
      while (s.isEmpty() == false && s.peek() <= arr[i]) {
        s.pop();
      }
      int pg = s.isEmpty() ? -1 : s.peek();
      System.out.print(pg + " ");
      s.push(arr[i]);
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 18, 12, 13, 14, 11, 16 };

    printPrevious(arr, arr.length);
  }
}
