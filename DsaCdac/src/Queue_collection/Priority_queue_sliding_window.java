package Queue_collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Priority_queue_sliding_window {
	public static void main(String []args) {
		PriorityQueue<Integer>q=new PriorityQueue<>();
		 int arr[]={1,5,2,8,9,4,5,9};
		 int min=0;
		
		int k=3;
		for(int i=0;i<arr.length;i++) {
			q.offer(arr[i]);
			if(q.size()>k) {
				
					q.poll();
				
				
			}
			
			if(q.size()==k ) {
				
                System.out.print("\n--->"+q);
        }

		}
	}
}
