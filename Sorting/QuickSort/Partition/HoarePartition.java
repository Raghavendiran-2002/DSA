public class HoarePartition {

  static int hoarePartition(int arr[], int l, int h) {
    int pivot = arr[l];
    int i = l - 1, j = h + 1;
    while (true) {
      do {
        i++;
      } while (arr[i] < pivot);
      do {
        j++;
      } while (arr[j] > pivot);
      if (i >= j) return j;
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
  }

  static void quickSort(int arr[], int l, int h) {
    if (l < h) {
      int p = hoarePartition(arr, l, h);
      quickSort(arr, l, p);
      quickSort(arr, p + 1, h);
    }
  }

  public static void main(String[] args) {}
}
