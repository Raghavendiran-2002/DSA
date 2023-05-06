public class SearchSortedRotatedArray {

  static int searchNaive(int arr[], int x) {
    for (int i = 0; i < arr.length; i++) if (arr[i] == x) return i;
    return -1;
  }

  static int searchEff(int arr[], int x) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] == x) return mid;
      if (arr[low] <= arr[mid]) {
        if (x >= arr[low] && x < arr[mid]) high = mid - 1; else low = mid + 1;
      } else {
        if (x > arr[mid] && x <= arr[high]) low = mid + 1; else high = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 100, 200, 400, 1000, 10, 20 };
    System.out.println();
  }
}
