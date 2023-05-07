import java.util.Arrays;
import java.util.Comparator;

class ArraySort {

  public static void main(String[] args) {
    int arr1[] = { 5, 20, 12, 30 };
    char arr2[] = { 'B', 'B', 'A', 'C', 'A' };
    int arr3[] = { 5, 30, 20, 10, 8 };
    Arrays.sort(arr1);
    System.out.println(Arrays.toString(arr1));
    Arrays.sort(arr2);
    System.out.println(Arrays.toString(arr2));
    Arrays.sort(arr3, 1, 4);
    System.out.println(Arrays.toString(arr3));

    Point arr4[] = { new Point(10, 20), new Point(3, 12), new Point(5, 7) };
    Arrays.sort(arr4);
    for (Point i : arr4) {
      System.out.println(i.x + " " + i.y);
    }

    Point2 arr5[] = { new Point2(10, 20), new Point2(3, 12), new Point2(5, 7) };
    Arrays.sort(arr5, new MyCmp());
    for (Point2 i : arr5) {
      System.out.println(i.x + " " + i.y);
    }

    System.out.println();
    Integer arr6[] = { 5, 20, 10, 3, 12 };
    Arrays.sort(arr6, new EvenOddComparator());
    System.out.println(Arrays.toString(arr6));
  }
}

class Point implements Comparable<Point> {

  int x, y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int compareTo(Point p) {
    return this.x - this.y;
  }
}

class Point2 {

  int x, y;

  Point2(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class MyCmp implements Comparator<Point2> {

  public int compare(Point2 p1, Point2 p2) {
    return p1.x - p2.x;
  }
}

class EvenOddComparator implements Comparator<Integer> {

  public int compare(Integer a1, Integer a2) {
    return a1 % 2 - a2 % 2;
  }
}
