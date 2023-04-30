public class RemoveDuplicates {

  static int removeDup(int arr[]) {
    int res = 1;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[res - 1]) {
        arr[res] = arr[i];
        res++;
      }
    }
    return res;
  }

  public static void main(String[] args) {}
}
