import java.util.ArrayDeque;

public class NextGreaterElement {

  static void nextGreater(int arr[]) {
    ArrayDeque<Integer> s = new ArrayDeque<>();
    s.push(arr[arr.length - 1]);
    System.out.print(-1 + " ");
    for (int i = arr.length - 2; i >= 0; i--) {
      while (s.isEmpty() == false && s.peek() <= arr[i]) {
        s.pop();
      }
      int ng = s.isEmpty() ? -1 : s.peek();
      System.out.print(ng + " ");
      s.push(arr[i]);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 5, 15, 10, 8, 6, 12, 9, 18 };
    nextGreater(arr);
  }
}
