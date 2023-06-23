public class PairwiseSwapChangingReferenceM2 {

  static void traverse(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println();
  }

  static Node swapData(Node head) {
    if (head == null || head.next == null) return head;
    Node curr = head.next.next;
    Node prev = head;
    head = head.next;
    head.next = prev;
    while (curr != null && curr.next != null) {
      prev.next = curr.next;
      prev = curr;
      Node next = curr.next.next;
      curr.next.next = curr;
      curr = next;
    }
    prev.next = curr;
    return head;
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

  Node(int x) {
    data = x;
  }
}
