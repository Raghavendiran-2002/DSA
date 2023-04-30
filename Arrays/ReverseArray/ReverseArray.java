public class ReverseArray {

  static void reverse1(int arr[]) {
    int low = 0, high = arr.length - 1;
    if (low < high) {
      int temp = arr[low];
      arr[low] = arr[high];
      arr[high] = temp;
      low++;
      high--;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 30, 7, 6, 5, 10 };
    reverse1(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
