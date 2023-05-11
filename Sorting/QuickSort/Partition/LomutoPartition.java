public class LomutoPartition {

  static int lomuto(int arr[], int l, int h) {
    int pivot = arr[h];
    int i = l - 1;
    for (int j = l; j <= h - 1; j++) {
      if (arr[j] < pivot) {
        l++;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[h];
    arr[h] = temp;
    return i + 1;
  }

  static void quickSort(int arr[], int l, int h) {
    if (l < h) {
      int p = lomuto(arr, l, h);
      quickSort(arr, l, p - 1);
      quickSort(arr, p + 1, h);
    }
  }

  public static void main(String[] args) {}
}
