Node temp = new Node(x);
    if (pos == 1) {
      temp.next = head;
      return temp;
    }
    Node curr = head;
    int count = 0;
    while (curr.next != null && pos < count) {
      curr = curr.next;
      count++;
    }
    temp.next = curr.next;
    curr.next = temp;
    return head;