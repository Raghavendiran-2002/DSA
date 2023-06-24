public class TwoStackWithArray {

  public static void main(String[] args) {
    TwoStack ts = new TwoStack(5);
    ts.push1(5);
    ts.push2(10);
    ts.push2(15);
    ts.push1(11);
    ts.push2(7);
    System.out.println("Popped element from stack1 is: " + ts.pop1());
    ts.push2(40);
    System.out.println("Popped element from stack2 is: " + ts.pop2());
  }
}

class TwoStack {

  int arr[];
  int cap, top1, top2;

  TwoStack(int n) {
    cap = n;
    top1 = -1;
    top2 = n;
    arr = new int[n];
  }

  boolean push1(int x) {
    if (top1 < top2 - 1) {
      top1++;
      arr[top1] = x;
      return true;
    }
    return false;
  }

  boolean push2(int x) {
    if (top1 < top2 - 1) {
      top2--;
      arr[top2] = x;
      return true;
    }
    return false;
  }

  int pop1() {
    if (top1 >= 0) {
      int x = arr[top1];
      top1--;
      return x;
    }
    return -1;
  }

  int pop2() {
    if (top2 < cap) {
      int x = arr[top2];
      top2++;
      return x;
    }
    return -1;
  }

  int size1() {
    return top1 + 1;
  }

  int size2() {
    return top2 + 1;
  }
}
