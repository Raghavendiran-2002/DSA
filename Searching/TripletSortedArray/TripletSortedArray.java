public class TripletSortedArray {

  static boolean isTripletNaive(int arr[], int x) {
    for (int i = 0; i < arr.length - 2; i++) for (
      int j = i + 1;
      j < arr.length - 1;
      j++
    ) for (int k = j + 1; k < arr.length; k++) if (
      arr[i] + arr[j] + arr[k] == x
    ) return true;
    return false;
  }

  static boolean isTripletEff(int arr[], int x) {
    for (int i = 0; i < arr.length - 2; i++) {
      if (twoSum(arr, x - arr[i], i + 1)) return true;
    }
    return false;
  }

  static boolean twoSum(int arr[], int x, int si) {
    int i = si, j = arr.length - 1;
    while (i < j) {
      if (arr[i] + arr[j] == x) return true; else if (
        arr[i] + arr[j] < x
      ) i++; else j--;
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 5, 6, 15 };
    int arr1[] = { 2, 5, 10, 15, 18 };
    System.out.println(isTripletNaive(arr, 20));
    System.out.println(isTripletEff(arr, 20));
    System.out.println(isTripletEff(arr1, 33));
  }
}
