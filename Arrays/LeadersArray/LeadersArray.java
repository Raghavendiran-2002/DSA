public class LeadersArray {

  static void leaderArray(int arr[]) {
    int max = 0;
    for (int i = arr.length - 1; i > 0; i--) {
      if (arr[i] > max) {
        System.out.print(arr[i] + " ");
      }
      max = Math.max(arr[i], max);
    }
  }

  static void leaderArrayNaive(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      boolean flag = false;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] <= arr[j]) {
          flag = true;
          break;
        }
      }
      if (flag == false) {
        System.out.print(arr[i] + " ");
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 7, 10, 4, 10, 6, 5, 2 };
    leaderArrayNaive(arr);
    System.out.println();
    leaderArray(arr);
  }
}
