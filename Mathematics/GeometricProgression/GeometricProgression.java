class GeometricProgression {

  static double calcuateGP(int A, int B, int N) {
    double res = 0;
    for (int i = 0; i < N; i++) {
      res = A * Math.pow(B, i);
    }
    return res;
  }

  static double calcuateGPSub(int A, int B, int N) {
    double r = (double) B / A;
    if (N == 1) {
      return A;
    } else return A * (Math.pow(r, N - 1));
  }

  public static void main(String[] args) {
    System.out.println(calcuateGP(2, 3, 1));
  }
}
