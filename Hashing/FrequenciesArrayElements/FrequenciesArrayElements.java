import java.util.HashMap;
import java.util.Map;

class FrequenciesArrayElements {

  private static void countFreq(int arr[]) {
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    for (int i : arr) {
      hm.put(i, hm.getOrDefault(i, 0) + 1);
    }
    for (Map.Entry<Integer, Integer> i : hm.entrySet()) {
      System.out.println(i.getKey() + "  " + i.getValue());
    }
  }

  public static void main(String[] args) {
    int arr[] = new int[] { 15, 16, 27, 27, 28, 15 };
    countFreq(arr);
  }
}
