package Queue;

public class QueueClass {
	int maxSize;
	int queue[];
	int front;
	int rear;
	
	void createQueue(int size) {
		int maxSize=size;
		queue=new int[maxSize];
		front=-1;
		rear=-1;
	}
	void enqueue(int value) {
		 queue[++rear]=value;
		
	}
	int dequeue() {
		return queue[++front];
	}
	boolean isEmpty() {
		return rear==-1;
	}
	boolean ifFull() {
		return front==rear;
	}
	void print() {
		for(int i=rear;i>=0;i--) {
			System.out.println(isEmpty());
		}
	}
}
