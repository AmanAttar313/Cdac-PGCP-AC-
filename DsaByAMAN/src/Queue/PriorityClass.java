package Queue;

public class PriorityClass {
	int queue[],maxSize,rear,front;
	
	public void createQueue(int size){
		maxSize=size;
		rear=-1;
		front=0;
		 queue=new int[maxSize];
	}
	void enqueue(int a) {
		if(isEmpty()) {
			System.out.println("");
			}
		rear++;
		queue[rear]=a;
		
		// bubble sorting 
		for(int i=front;i<=rear;i++) {
			for(int j=front;j<rear;j++) {
				if(queue[j]<queue[j+1]) {
					int temp=queue[j];
					queue[j]=queue[j+1];
					queue[j+1]=temp;
				}
			}
		}
	}
	int dequeue(int a) {
		if(isEmpty()) {
			System.out.println("Queue iS EMpty");
			return -1;
		}
		int temp=queue[front];
		front++;
		return temp;
		
	}
	boolean isEmpty() {
		return front>rear;
	}
	
	void print() {
		for(int i=0;i<rear;i++) {
			System.out.println(queue[i]);
		}
	}
}
