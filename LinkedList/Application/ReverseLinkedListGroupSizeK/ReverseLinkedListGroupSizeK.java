public class ReverseLinkedListGroupSizeK {

  static Node reverseK(Node head, int k) {
    Node curr = head, prevFirst = null;
    boolean isFirstPass = true;
    while (curr != null) {
      Node first = curr, prev = null;
      int count = 0;
      while (curr != null && count < k) {
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        count++;
      }
      if (isFirstPass) {
        head = prev;
        isFirstPass = false;
      } else {
        prevFirst.next = prev;
      }
      prevFirst = first;
    }
    return head;
  }

  static void printlist(Node head) {
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
    head.next.next.next.next.next = new Node(60);
    head.next.next.next.next.next.next = new Node(70);
    printlist(head);
    head = reverseK(head, 3);
    printlist(head);
  }
}

class Node {

  int data;
  Node next;

  Node(int x) {
    data = x;
  }
}
