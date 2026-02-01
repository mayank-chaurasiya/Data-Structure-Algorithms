package revision.queue;

// Implementation of Queue using array -- 
public class ArrQueue {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        public Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        public void addCQ(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            // Adding first element
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public int removeCQ() {
            if (isEmpty()) {
                System.out.println("Queue is full");
                return -1;
            }

            int result = arr[front];

            // delete last element
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }

        public int peekCQ() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.addCQ(1);
        q.addCQ(2);
        q.addCQ(3);

        while (!q.isEmpty()) {
            System.out.println(q.peekCQ() + " ");
            q.removeCQ();
        }
    }
}
