class ArrayImplementationOfDeque {

  public static void main(String[] args) {}
}

class Deque {

  int arr[];
  int front, size, cap;

  Deque(int c) {
    cap = c;
    size = 0;
    arr = new int[cap];
    front = 0;
  }

  boolean isFull() {
    return size == cap;
  }

  boolean isEmpty() {
    return size == 0;
  }

  void insertFront(int x) {
    if (isFull()) return;
    front = (front + 1) % cap;
    arr[front] = x;
    size++;
  }

  void insertRear(int x) {
    if (isFull()) return;
    int rear = (front + size) % cap;
    arr[rear] = x;
    size++;
  }

  void deleteRear() {
    if (isEmpty()) return;
    size--;
  }

  void deleteFront() {
    if (isEmpty()) return;
    front = (front + 1) % cap;
    size--;
  }

  int getFront() {
    if (isEmpty()) return -1; else return arr[front];
  }

  int getRear() {
    if (isEmpty()) return -1; else return arr[(front + size - 1) % cap];
  }
}
