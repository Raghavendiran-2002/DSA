import java.util.HashSet;

public class InsersectTwoLinkedListHashing {

  static int getIntersect(Node head1, Node head2) {
    HashSet<Integer> hs = new HashSet<Integer>();
    Node curr = head1;
    while (curr != null) {
      hs.add(curr.data);
      curr = curr.next;
    }
    curr = head2;
    while (curr != null) {
      if (hs.contains(curr.data)) {
        return curr.data;
      }
      curr = curr.next;
    }
    return -1;
  }

  public static void main(String[] args) {
    Node newNode;

    Node head1 = new Node(10);

    Node head2 = new Node(3);

    newNode = new Node(6);
    head2.next = newNode;

    newNode = new Node(9);
    head2.next.next = newNode;

    newNode = new Node(15);
    head1.next = newNode;
    head2.next.next.next = newNode;

    newNode = new Node(30);
    head1.next.next = newNode;

    head1.next.next.next = null;

    System.out.print(getIntersect(head1, head2));
  }
}

class Node {

  int data;
  Node next;

  Node(int x) {
    data = x;
  }
}
