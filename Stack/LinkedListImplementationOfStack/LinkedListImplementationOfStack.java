public class LinkedListImplementationOfStack {

  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(10);
    s.push(20);
    s.push(30);
    System.out.println(s.pop());
  }
}

class Stack {

  Node head;
  int size;

  Stack() {
    head = null;
    size = 0;
  }

  int size() {
    return size;
  }

  boolean isEmpty() {
    return head == null;
  }

  void push(int x) {
    Node newNode = new Node(x);
    newNode.next = head;
    head = newNode;
    size++;
  }

  int pop() {
    if (head == null) {
      return Integer.MAX_VALUE;
    }
    int res = head.data;
    head = head.next;
    size--;
    return res;
  }

  int peek() {
    if (head == null) return Integer.MAX_VALUE;
    return head.data;
  }
}

class Node {

  int data;
  Node next;

  Node(int x) {
    data = x;
  }
}
