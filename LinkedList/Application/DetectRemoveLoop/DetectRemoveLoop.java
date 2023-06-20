public class DetectRemoveLoop {

  static void removeLoop(Node head) {
    Node slow = head, fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        break;
      }
    }
    if (slow != fast) return;
    slow = head;
    while (slow.next != fast.next) {
      slow = slow.next;
      fast = fast.next;
    }
    fast.next = null;
  }

  static void traverse(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Node head = new Node(15);
    head.next = new Node(10);
    head.next.next = new Node(12);
    head.next.next.next = new Node(20);
    head.next.next.next.next = head.next;
    removeLoop(head);
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
