public class SearchRowColumnSortedMatrix {

  static void searchNaive(int mat[][], int x) {
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        if (mat[i][j] == x) {
          System.out.println("Found at C : " + i + " R : " + j);
          return;
        }
      }
    }
    return;
  }

  static void searchEff(int mat[][], int x) {
    int c = mat.length, r = mat.length;
    int i = 0, j = c - 1;
    while (i < c && j >= 0) {
      if (mat[i][j] == x) {
        System.out.print("Found at C : " + i + " R : " + j);
        return;
      } else if (mat[i][j] > x) j--; else i++;
    }
    System.out.println("Not Found");
    return;
  }

  public static void main(String[] args) {
    int arr[][] = {
      { 10, 20, 30, 40 },
      { 15, 25, 35, 45 },
      { 27, 29, 35, 45 },
      { 32, 33, 39, 50 },
    };
    int x = 29;
    searchNaive(arr, x);
    searchEff(arr, x);
  }
}
