public class SecondLargestElement {

  static int findLargest(int arr[], int n) {
    int largest = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] > arr[largest]) largest = i;
    }
    return largest;
  }

  static int secondLargestNaive(int arr[], int n) {
    int largest = findLargest(arr, n);
    int res = -1;
    for (int i = 0; i < n; i++) {
      if (arr[i] != arr[largest]) {
        if (res == -1) res = i; else if (arr[i] > arr[res]) res = i;
      }
    }
    return res;
  }

  static int secondLargestEff(int arr[], int n) {
    int res = -1, largest = 0;
    for (int i = 1; i < n; i++) {
      if (arr[i] > arr[largest]) {
        res = largest;
        largest = i;
      } else if (arr[i] != arr[largest]) {
        if (res == -1 || arr[i] > arr[res]) res = i;
      }
    }
    return res;
  }

  public static void main(String[] args) {}
}
