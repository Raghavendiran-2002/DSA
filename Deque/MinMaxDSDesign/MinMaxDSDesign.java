import java.util.ArrayDeque;

public class MinMaxDSDesign {

  public static void main(String[] args) {
    MyDS ds = new MyDS();

    ds.insertMin(10);
    ds.insertMax(15);
    ds.insertMin(5);

    int x = ds.extractMin();
    System.out.println(x);

    x = ds.extractMax();
    System.out.println(x);

    ds.insertMin(8);
  }
}

class MyDS {

  ArrayDeque<Integer> dq;

  MyDS() {
    dq = new ArrayDeque<>();
  }

  void insertMin(int x) {
    dq.addFirst(x);
  }

  void insertMax(int x) {
    dq.addLast(x);
  }

  int getMax() {
    return dq.getLast();
  }

  int getMin() {
    return dq.getFirst();
  }

  int extractMin() {
    return dq.removeFirst();
  }

  int extractMax() {
    return dq.removeFirst();
  }
}
