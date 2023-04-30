public class MoveZerosToEnd {

  static void moveToEnd(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        for (int j = i + 1; j < arr.length; j++) {
          int temp;
          if (arr[j] != 0) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
        }
      }
    }
  }

  static void moveToEndZerosEff(int arr[]) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      int temp;
      if (arr[i] != 0) {
        temp = arr[i];
        arr[i] = arr[count];
        arr[count] = temp;
        count++;
      }
    }
  }

  public static void main(String[] args) {}
}
