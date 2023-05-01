public class TappingRainWater {

  static int rainWaterNaive(int arr[]) {
    int res = 0;
    for (int i = 1; i < arr.length - 1; i++) {
      int lmax = arr[i];
      for (int j = 0; j < i; j++) {
        lmax = Math.max(lmax, arr[j]);
      }
      int rmax = arr[i];
      for (int j = i + 1; j < arr.length; j++) {
        rmax = Math.max(rmax, arr[j]);
      }
      res += Math.min(lmax, rmax) - arr[i];
    }
    return res;
  }

  static int rainWaterEff(int height[]) {
    int res = 0;
    int lmax[] = new int[height.length];
    int rmax[] = new int[height.length];
    lmax[0] = height[0];
    for (int i = 1; i < height.length; i++) lmax[i] =
      Math.max(height[i], lmax[i - 1]);

    rmax[height.length - 1] = height[height.length - 1];
    for (int i = height.length - 2; i >= 0; i--) rmax[i] =
      Math.max(rmax[i + 1], height[i]);

    for (int i = 1; i < height.length; i++) res +=
      Math.min(lmax[i], rmax[i]) - height[i];

    return res;
  }

  public static void main(String[] args) {
    int arr[] = { 3, 0, 1, 2, 5 };
    System.out.println(rainWaterNaive(arr));
    System.out.println(rainWaterEff(arr));
  }
}
