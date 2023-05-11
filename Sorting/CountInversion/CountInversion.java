public class CountInversion {

  static int countInversionNaive(int arr[]) {
    int res = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) res++;
      }
    }
    return res;
  }

  static int countInversionEff(int arr[], int l, int r) {
    int res = 0;
    if (l < r) {
      int m = l + (r - l) / 2;
      res += countInversionEff(arr, l, m);
      res += countInversionEff(arr, m + 1, r);
      res += countandmerge(arr, l, m, r);
    }
    return res;
  }

  static int countandmerge(int arr[], int l, int m, int r) {
    int n1 = m - l + 1, n2 = r - m;
    int left[] = new int[n1];
    int right[] = new int[n2];
    for (int i = 0; i < n1; i++) {
      left[i] = arr[i];
    }
    for (int i = 0; i < n2; i++) {
      right[i] = arr[i];
    }
    int res = 0, i = 0, j = 0, k = l;
    while (i < n1 && j < n2) {
      if (left[i] <= right[j]) {
        arr[k] = left[i];
        i++;
      } else {
        arr[k] = right[j];
        j++;
        res = res + (n1 - i);
      }
      k++;
    }
    while (i < n1) {
      arr[k] = left[i];
      i++;
      k++;
    }
    while (i < n2) {
      arr[k] = right[j];
      j++;
      k++;
    }
    return res;
  }

  public static void main(String[] args) {}
}
