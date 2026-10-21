package QueueCollection;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFS {
	public static void main(String []args) {
		Queue<Integer> q=new ArrayDeque<>();
		int visited[];
		
		q.add(10);
		q.add(11);
		q.add(12);
		q.add(1);
		q.add(14);
		
		while(!q.isEmpty()) {
			q.remove();
		}
		
	}
}
