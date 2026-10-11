package PriorityQueue;

public class Priority_class {

    int queue[], MaxSize, rear, front;

    void createQueue(int size) {

        MaxSize = size;
        rear = -1;
        front = 0;

        queue = new int[MaxSize];
    }

    void enqueue(int e) {

        if (is_full()) {
            System.out.println("Queue Full");
            return;
        }

        rear++;
        queue[rear] = e;

        // Arrange elements in descending order
        // Largest element = highest priority

        for (int i = front; i <= rear; i++) {

            for (int j = front; j < rear; j++) {

                if (queue[j] < queue[j + 1]) {

                    int temp = queue[j];
                    queue[j] = queue[j + 1];
                    queue[j + 1] = temp;
                }
            }
        }
    }

    boolean is_full() {

        return rear == MaxSize - 1;
    }

    int dequeue() {

        if (is_empty()) {
            System.out.println("Queue Empty");
            return -1;
        }

        int temp = queue[front];

        front++;

        return temp;
    }

    boolean is_empty() {

        return front > rear;
    }

    void print_queue() {

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " - ");
        }
    }
}
