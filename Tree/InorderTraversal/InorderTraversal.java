class InorderTraversal {

  static void inorder(Node head) {
    if (head != null) {
      inorder(head.left);
      System.out.println(head.data + " ");
      inorder(head.right);
    }
  }

  public static void main(String[] args) {
    Node root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);
    root.right.left = new Node(40);
    root.right.right = new Node(50);

    inorder(root);
  }
}

class Node {

  int data;
  Node left;
  Node right;

  Node(int k) {
    data = k;
    left = right = null;
  }
}
