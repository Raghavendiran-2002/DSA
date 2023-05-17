public class RotateMatrixAnticlockwiseby90 {

  static void rotateMatixNaive(int arr[][]) {
    int temp[][] = new int[arr.length][arr[0].length];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        temp[arr.length - j - 1][i] = arr[i][j];
      }
    }
    for (int i = 0; i < arr.length; i++) for (
      int j = 0;
      j < arr[0].length;
      j++
    ) arr[i][j] = temp[i][j];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  static void rotateMatixEff(int arr[][]) {
    for (int i = 0; i < arr.length; i++) for (
      int j = i + 1;
      j < arr.length;
      j++
    ) {
      int temp = arr[i][j];
      arr[i][j] = arr[j][i];
      arr[j][i] = temp;
    }

    for (int i = 0; i < arr.length; i++) {
      int low = 0, high = arr.length - 1;
      while (low < high) {
        int temp = arr[low][i];
        arr[low][i] = arr[high][i];
        arr[high][i] = temp;
        low++;
        high--;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int arr[][] = {
      { 1, 2, 3, 4 },
      { 5, 6, 7, 8 },
      { 9, 10, 11, 12 },
      { 13, 14, 15, 16 },
    };
    // rotateMatixNaive(arr);
    rotateMatixEff(arr);
  }
}
