public class SelectionSort {

  static void selectSortNaive(int arr[]) {
    int temp[] = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      int min = 0;
      for (int j = 1; j < arr.length; j++) {
        if (arr[j] < arr[min]) min = j;
      }
      temp[i] = arr[min];
      arr[min] = Integer.MAX_VALUE;
    }
    for (int i = 0; i < arr.length; i++) arr[i] = temp[i];
  }

  static void selectSortEff(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < arr.length; j++) if (arr[j] < arr[min]) min = j;
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 90, 80, 90, 25 };
    selectSortEff(arr);
    for (int i : arr) {
      System.out.println(i);
    }
  }
}
