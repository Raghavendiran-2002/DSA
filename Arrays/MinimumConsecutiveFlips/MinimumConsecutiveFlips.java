public class MinimumConsecutiveFlips {

  static void minFlipsNaive(int arr[]) {
    int countZeros = 0;
    int countOne = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {}
    }
  }

  static void minFlipsEff(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[i - 1]) {
        if (arr[i] != arr[0]) System.out.print(
          "From " + i + " to "
        ); else System.out.println(i - 1);
      }
    }
    if (arr[arr.length - 1] != arr[0]) System.out.println(arr.length - 1);
  }

  public static void main(String[] args) {}
}
