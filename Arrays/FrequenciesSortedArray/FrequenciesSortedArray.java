public class FrequenciesSortedArray {

  static void countFreq(int arr[]) {
    int freq = 1, i = 1;
    while (i < arr.length) {
      while (i < arr.length && arr[i] == arr[i - 1]) {
        freq++;
        i++;
      }
      System.out.print(arr[i - 1] + " " + freq);
      i++;
      freq = 1;
    }
    if (arr.length == 1 || arr[arr.length - 1] != arr[arr.length - 2]) {
      System.out.println(arr[arr.length - 1] + " " + 1);
    }
  }

  public static void main(String[] args) {
    int arr[] = {};
    countFreq(arr);
  }
}
