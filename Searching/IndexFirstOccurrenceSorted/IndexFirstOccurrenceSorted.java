import java.io.FileReader;

class IndexFirstOccurrenceSorted {

  static int firstOccRecu(int arr[], int low, int high, int x) {
    if (low > high) return -1;
    int mid = (low + high) / 2;
    if (arr[mid] == x) {
      if (
        mid == 0 || arr[mid - 1] != arr[mid]
      ) return mid; else return firstOccRecu(arr, low, mid - 1, x);
    } else if (arr[mid] > x) return firstOccRecu(
      arr,
      low,
      mid - 1,
      x
    ); else return firstOccRecu(arr, mid + 1, high, x);
  }

  static int firstOccIter(int arr[], int x) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] < x) low = mid + 1; else if (arr[mid] > x) high =
        mid - 1; else if (
        mid == 0 || arr[mid - 1] != arr[mid]
      ) return mid; else high = mid - 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 5, 10, 10, 15, 20, 20, 20 };
    System.out.println(firstOccRecu(arr, 0, arr.length, 20));
    System.out.println(firstOccIter(arr, 20));
  }
}
