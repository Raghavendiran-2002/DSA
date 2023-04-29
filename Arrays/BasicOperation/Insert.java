class Insert {

  static int insert(int arr[], int n, int x, int cap, int pos) {
    if (n == cap) return n;
    int index = pos - 1;
    for (int i = n - 1; i >= index; i--) arr[i + 1] = arr[i];
    arr[index] = x;
    return n + 1;
  }

  public static void main(String[] args) {
    int arr[] = { 5, 3, 7, 10, 20 };
    System.out.println(insert(arr, arr.length - 1, 10, arr.length, 2));
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
