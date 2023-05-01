public class StockBuySell {

  static int stockBuySellNaive(int arr[], int start, int end) {
    if (end <= start) return 0;
    int profit = 0;
    for (int i = start; i < end; i++) {
      for (int j = i + 1; j <= end; j++) {
        if (arr[j] > arr[i]) {
          int curr_profit =
            arr[j] -
            arr[i] +
            stockBuySellNaive(arr, start, i - 1) +
            stockBuySellNaive(arr, j + 1, end);
          profit = Math.max(profit, curr_profit);
        }
      }
    }
    return profit;
  }

  static int stockBuySellEff(int arr[]) {
    int profit = 0;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[i - 1]) profit += (arr[i] - arr[i - 1]);
    }
    return profit;
  }

  public static void main(String[] args) {
    int arr[] = {};
  }
}
