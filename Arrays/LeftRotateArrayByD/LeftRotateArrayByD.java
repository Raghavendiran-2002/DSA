public class LeftRotateArrayByD {

  static void rotateNaive(int arr[], int d) {
    for (int i = 0; i < d; i++) {
      leftRotateOne(arr);
    }
  }

  static void leftRotateOne(int arr[]) {
    int temp = arr[0];
    for (int i = 1; i < arr.length; i++) arr[i - 1] = arr[i];
    arr[arr.length - 1] = temp;
  }

  static void rotateMethod(int arr[], int d) {
    int temp[] = new int[d];
    for (int i = 0; i < d; i++) {
      temp[i] = arr[i];
    }
    for (int i = d; i < arr.length; i++) {
      arr[i - d] = arr[i];
    }
    for (int i = 0; i < d; i++) {
      arr[arr.length - d + i] = temp[i];
    }
  }

  static void rotateEff(int arr[], int d) {
    reverse(arr, 0, d - 1);
    reverse(arr, d, arr.length - 1);
    reverse(arr, 0, arr.length - 1);
  }

  static void reverse(int[] arr, int low, int high) {
    while (low < high) {
      int temp = arr[low];
      arr[low] = arr[high];
      arr[high] = temp;
      low++;
      high--;
    }
  }

  public static void main(String[] args) {}
}
