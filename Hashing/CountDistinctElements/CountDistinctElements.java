import java.util.HashSet;

public class CountDistinctElements {

  private static int countElements(int arr[]) {
    HashSet<Integer> hm = new HashSet<Integer>();
    for (int i : arr) {
      hm.add(i);
    }
    return hm.size();
  }

  private static int countElementsNaive(int arr[]) {
    int res = 0;
    for (int i = 0; i < arr.length; i++) {
      boolean flag = false;
      for (int j = 0; j < i; j++) {
        if (arr[i] == arr[j]) {
          flag = true;
          break;
        }
      }
      if (flag == false) res++;
    }
    return res;
  }

  public static void main(String[] args) {
    int arr[] = { 15, 12, 13, 12, 13, 13, 18 };
    System.out.println(countElements(arr));
    System.out.println(countElementsNaive(arr));
  }
}
