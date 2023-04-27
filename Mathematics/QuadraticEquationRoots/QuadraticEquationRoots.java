import java.util.ArrayList;

class QuadraticEquationRoots {

  static ArrayList<Integer> quardraticRoots(int a, int b, int c) {
    ArrayList<Integer> res = new ArrayList<>();
    int root = (int) (Math.pow(b, 2) - (4 * a * c));
    if (root < 0) {
      res.add(-1);
      return res;
    }
    double d = Math.sqrt(root);
    int r1 = (int) Math.floor((d - b) / (2 * a));
    int r2 = (int) Math.floor((-1 * (d - b)) / (2 * a));
    if (r1 > r2) {
      res.add(r1);
      res.add(r2);
    } else {
      res.add(r2);
      res.add(r1);
    }
    return res;
  }

  public static void main(String[] args) {
    System.out.println();
  }
}
