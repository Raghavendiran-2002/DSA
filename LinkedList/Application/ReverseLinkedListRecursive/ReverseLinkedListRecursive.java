public class ReverseLinkedListRecursive {

  static Node reverseListM1(Node head) {
    if (head == null || head.next == null) return head;
    Node restHead = reverseListM1(head.next);
    Node restTail = head.next;
    restTail.next = head;
    head.next = null;
    return restHead;
  }

  static Node reverseListM2(Node curr, Node prev) {
    if (curr == null) return prev;
    Node next = curr.next;
    curr.next = prev;
    return reverseListM2(next, curr);
  }

  static void traverse(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);
    head.next.next.next.next = new Node(50);
    traverse(head);
    head = reverseListM2(head, null);
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
