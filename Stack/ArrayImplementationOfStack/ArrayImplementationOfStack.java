class ArrayImplementationOfStack {

  public static void main(String[] args) {
    Stack s = new Stack(3);
    s.push(10);
    s.push(20);
    System.out.println(s.peek());
    s.push(40);
  }
}

class Stack {

  int capacity;
  int arr[];
  int top;

  Stack(int c) {
    top = -1;
    capacity = c;
    arr = new int[capacity];
  }

  public int size() {
    return top + 1;
  }

  public void push(int val) {
    if (top == capacity - 1) {
      System.out.println("Overflow");
      return;
    }
    top++;
    arr[top] = val;
  }

  public int peek() {
    if (top == -1) {
      System.out.println("Underflow");
      return -1;
    }
    return arr[top];
  }

  public int pop() {
    if (top == -1) {
      System.out.println("Underflow");
      return -1;
    }
    int res = arr[top];
    top--;
    return res;
  }

  public boolean isEmpty() {
    return top == -1;
  }
}
