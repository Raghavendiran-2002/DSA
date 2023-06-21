// https://ide.geeksforgeeks.org/online-java-compiler/09baa45f-7d82-4bf2-893f-f55eb74e5f80
public class InsersectTwoLinkedListEff {

  static int getIntersect(Node head1, Node head2) {
    int c1 = count(head1);
    int c2 = count(head2);
    int d;

    if (c1 > c2) {
      d = c1 - c2;
      return -1;
    } else {
      d = c2 - c1;
      return -1;
    }
  }

  static int count(Node head) {
    int count = 0;
    Node curr = head;
    while (curr != null) {
      count++;
      curr = curr.next;
    }
    return count;
  }

  public static void main(String[] args) {}
}

class Node {

  int data;
  Node next;

  Node(int x) {
    data = x;
  }
}
