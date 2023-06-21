public class PairwiseSwapDataM1 {

  static void swapData(Node head) {
    while (head != null && head.next != null) {
      int temp = head.data;
      head.data = head.next.data;
      head.next.data = temp;
      head = head.next.next;
    }
  }

  static void traverse(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);
    traverse(head);
    swapData(head);
    traverse(head);
  }
}

class Node {

  int data;
  Node next;

  Node(int d) {
    data = d;
  }
}
