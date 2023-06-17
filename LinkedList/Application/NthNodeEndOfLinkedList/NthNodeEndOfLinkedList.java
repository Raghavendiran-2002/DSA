public class NthNodeEndOfLinkedList {

  static int findNnodeN(Node head, int n) {
    if (head == null) return -1;
    int count = 0, k = 1;
    Node curr = head;
    while (curr != null) {
      curr = curr.next;
      count++;
    }
    if (count < n) return -1;
    curr = head;
    while (k < count - n + 1) {
      curr = curr.next;
      k++;
    }
    return curr.data;
  }

  static int findNnodeE(Node head, int x) {
    if (head == null) return -1;
    Node first = head;
    for (int i = 0; i < x; i++) {
      if (first == null) return -1;
      first = first.next;
    }
    Node second = head;
    while (first != null) {
      second = second.next;
      first = first.next;
    }
    return second.data;
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);
    head.next.next.next.next = new Node(50);
    System.out.println(findNnodeN(head, 5));
    System.out.println(findNnodeE(head, 4));
  }
}

class Node {

  int data;
  Node next;

  Node(int x) {
    data = x;
  }
}
