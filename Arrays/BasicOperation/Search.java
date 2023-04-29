public class Search {

  // Unsorted
  static int searchUnSorted(int arr[], int n, int x) {
    for (int i = 0; i < n; i++) {
      if (arr[i] == x) return i;
    }
    return -1;
  }

  // Sorted
  // use Binary Search

  public static void main(String[] args) {
    int arr[] = { 20, 5, 7, 25 };
    System.out.println(searchUnSorted(arr, arr.length, 5));
  }
}
