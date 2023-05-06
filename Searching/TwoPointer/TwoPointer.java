public class TwoPointer {

  static boolean isPairNaive(int arr[], int x) {
    for (int i = 0; i < arr.length; i++) for (
      int j = i + 1;
      j < arr.length;
      j++
    ) if (arr[i] + arr[j] == x) return true;

    return false;
  }

  static boolean isPairEff(int arr[], int x) {
    int i = 0, j = arr.length - 1;
    while (i < j) {
      if (arr[i] + arr[j] == x) return true; else if (
        arr[i] + arr[j] < x
      ) i++; else j++;
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 5, 8, 12, 30 };
    System.out.println(isPairEff(arr, 17));
    System.out.println(isPairNaive(arr, 17));
  }
}
