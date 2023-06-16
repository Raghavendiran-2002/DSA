public class MiddleOfLinkedList {

  static int middleLinkedListN(Node head) {
    int count = 0;
    if (head == null) return -1;
    Node curr;
    for (curr = head; curr != null; curr = curr.next) count++;
    curr = head;
    for (int i = 0; i < count / 2; i++) curr = curr.next;
    return curr.data;
  }

  static int middleLinkedListE(Node head) {
    Node slow = head, fast = head;
    if (head == null) return -1;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow.data;
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);
    head.next.next.next.next = new Node(50);
    System.out.println(middleLinkedListN(head));
    System.out.println(middleLinkedListE(head));
  }
}

class Node {

  int data;
  Node next;

  Node(int x) {
    data = x;
    next = null;
  }
}
