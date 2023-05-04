class BinarySearchIterative {

  static int search(int arr[], int x) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] > x) high = mid - 1; else if (
        arr[mid] == x
      ) return mid; else low = mid + 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 40, 50, 60 };
    System.out.println(search(arr, 50));
  }
}
