public class SortArraywithTwoTypesElement {

  static void segregatePosNegNaive(int arr[]) {
    int temp[] = new int[arr.length];
    int i = 0;
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] < 0) {
        temp[i] = arr[j];
        i++;
      }
    }
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] >= 0) {
        temp[i] = arr[j];
        i++;
      }
    }
    for (int j = 0; j < arr.length; j++) {
      arr[j] = temp[j];
    }
  }

  static void segregatePosNegEff(int arr[]) {
    int i = -1, j = arr.length;
    while (true) {
      do {
        i++;
      } while (arr[i] < 0);
      do {
        j--;
      } while (arr[j] >= 0);
      if (i >= j) return;
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
  }

  public static void main(String[] args) {}
}
