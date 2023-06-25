class ArrayImplementationQueue {

  public static void main(String[] args) {
    Queue queue = new Queue(1000);

    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    queue.enqueue(40);

    System.out.println(queue.dequeue() + " dequeued from queue\n");

    System.out.println("Front item is " + queue.front());

    System.out.println("Rear item is " + queue.rear());
  }
}

class Queue {

  int size, cap;
  int arr[];

  Queue(int c) {
    cap = c;
    size = 0;
    arr = new int[cap];
  }

  void enqueue(int x) {
    if (isFull()) return;
    arr[size] = x;
    size++;
  }

  int dequeue() {
    if (isEmpty()) return -1;
    int res = arr[0];
    for (int i = 0; i < size; i++) {
      arr[i] = arr[i + 1];
    }
    size--;
    return res;
  }

  int front() {
    if (isEmpty()) return -1; else return arr[0];
  }

  int rear() {
    if (isEmpty()) return -1; else return arr[size - 1];
  }

  boolean isFull() {
    return size == cap;
  }

  boolean isEmpty() {
    return size == 0;
  }

  int size() {
    return size;
  }
}
