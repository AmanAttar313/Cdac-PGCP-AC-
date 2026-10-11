package CircularQueue;

public class CircularQueue_Class {
	//circular queue:
	
	    int queue[],MaxSize,front,rear,count;
	    void createQueue(int size)
	    {
	        MaxSize=size;
	        rear=-1;
	        front=0;
	        queue=new int[MaxSize];
	        count=0;
	    }
	    void enqueue(int e)//with every enqueue rear+1
	    {
	        count++;
	        rear=(rear+1)%MaxSize;
	        queue[rear]=e;
	    }

	    boolean is_full()
	    {
	        return (count==MaxSize);
	    }

	    int dequeue()
	//removes element from front ,front+1
	    {
	        count--;
	        int temp=queue[front];
	        front=(front+1)%MaxSize;
	        return temp;
	    }

	    boolean is_empty()
	    {
	        return count==0;
	    }
	    void print_queue() {
	        int c = 0, i = front;
	        while (c < count) {
	            System.out.print(queue[i] + " - ");
	            i = (i + 1) % MaxSize;
	            c++;
	        }
	    }
}
