public class SearchInLinkedListRecursive {

  static int searchLinkedList(Node head, int x, int pos) {
    if (head == null) return -1;
    if (head.data == x) return pos;
    return searchLinkedList(head.next, x, pos + 1);
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);
    head.next.next.next.next = new Node(50);
    System.out.println(searchLinkedList(head, 41, 1));
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
