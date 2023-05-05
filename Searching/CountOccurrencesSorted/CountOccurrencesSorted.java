public class CountOccurrencesSorted {

  static int countOccurrences(int arr[], int x) {
    int first = firstOcc(arr, x);
    if (first == -1) return 0; else return (lastOcc(arr, x) - first + 1);
  }

  static int lastOcc(int arr[], int x) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] < x) {
        low = mid + 1;
      } else if (arr[mid] > x) high = mid - 1; else {
        if (
          mid == arr.length - 1 || arr[mid] != arr[mid + 1]
        ) return mid; else low = mid + 1;
      }
    }
    return -1;
  }

  static int firstOcc(int arr[], int x) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] < x) low = mid + 1; else if (arr[mid] > x) high =
        mid - 1; else {
        if (mid == 0 || arr[mid] != arr[mid - 1]) return mid; else high =
          mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 10, 20, 20, 20, 40, 40 };
    System.out.println(countOccurrences(arr, 20));
  }
}
