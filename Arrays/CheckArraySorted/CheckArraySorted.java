public class CheckArraySorted {

  static boolean checkSortedNaive(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[i]) return false;
      }
    }
    return true;
  }

  static boolean checkSortedEff(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < arr[i - 1]) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6 };
    int brr[] = { 2, 1, 3, 4, 5, 6 };
  }
}
