public class ArrayImplementationQueueCircular {

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

  int cap, size, front;
  int arr[];

  Queue(int c) {
    cap = c;
    size = 0;
    arr = new int[cap];
    front = 0;
  }

  boolean isEmpty() {
    return size == 0;
  }

  boolean isFull() {
    return size == cap;
  }

  int front() {
    if (isEmpty()) return -1; else return arr[front];
  }

  int rear() {
    if (isEmpty()) return -1; else return arr[(front + size - 1) % cap];
  }

  void enqueue(int x) {
    if (isFull()) return;
    int r = rear();
    r = (r + 1) % cap;
    arr[r] = x;
    size++;
  }

  int dequeue() {
    if (isEmpty()) return -1;
    int r = arr[front];
    front = (front + 1) % cap;
    size--;
    return r;
  }
}
