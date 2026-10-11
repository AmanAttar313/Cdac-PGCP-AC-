package Queue_collection;

import java.util.ArrayDeque;

public class SlidingWindow {
	public static void main(String []args) {
		ArrayDeque<Integer>q=new ArrayDeque<>();
		 int arr[]={1,5,2,8,9,4,5,9};

		
		int k=3;
		for(int i=0;i<arr.length;i++) {
			q.addLast(arr[i]);
			if(q.size()>k) {
				q.pollFirst();
			}
			
			if(q.size()==k) {
                System.out.print("\n--->"+q);
        }

		}
	}
}
