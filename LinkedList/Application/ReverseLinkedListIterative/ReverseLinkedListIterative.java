import java.util.ArrayList;

public class ReverseLinkedListIterative {

  static void traverse(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println();
  }

  static Node reverseListN(Node head) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for (Node curr = head; curr != null; curr = curr.next) arr.add(curr.data);
    for (Node curr = head; curr != null; curr = curr.next) {
      curr.data = arr.remove(arr.size() - 1);
    }
    return head;
  }

  static Node reverseListE(Node head) {
    Node curr = head;
    Node prev = null;
    while (curr != null) {
      Node next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);
    head.next.next.next.next = new Node(50);
    traverse(head);
    head = reverseListN(head);
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
