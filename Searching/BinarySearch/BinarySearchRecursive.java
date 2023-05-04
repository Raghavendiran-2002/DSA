public class BinarySearchRecursive {

  static int binarySearchRecursive(int arr[], int low, int high, int x) {
    if (low > high) return -1;
    int mid = (low + high) / 2;
    if (arr[mid] == x) return mid; else if (
      arr[mid] < x
    ) return binarySearchRecursive(
      arr,
      mid + 1,
      high,
      x
    ); else return binarySearchRecursive(arr, low, mid - 1, x);
  }

  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
    System.out.println(binarySearchRecursive(arr, 0, arr.length, 20));
  }
}
