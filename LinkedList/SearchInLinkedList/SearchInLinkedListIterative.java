public class SearchInLinkedListIterative {

  static int searchLinkedList(Node head, int x) {
    if (head == null) System.out.println("Null");
    int pos = 1;
    while (head != null) {
      if (head.data == x) {
        return pos;
      }
      pos++;
      head = head.next;
    }
    return -1;
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);
    System.out.println(searchLinkedList(head, 41));
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
