package LinkedListADT;

public class Node {
	Node root;
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
		
	}
	void insertLeft(int data) {
		Node n=new Node(data);
		if(root==null) {
			root=n;
		}else {
			n.next=root;
			root=n;
		}
	}
	
	void insertRight() {
		Node n=new Node(data);
		if(root==null) {
			root=n;
		}else {
			Node t=root;
			
			while(t.next!=null) {
				t=t.next;
				t.next=n;
			}
		}
	}
	void deleteLeft() {
		if(root==null) {
			System.out.println("List is Empty");
		}else {
			Node t=root;
			t.next=root;
			System.out.println("Node Deleted: "+t.data);
		}
	}
	
	void deleteRight() {
		if(root==null) {
			System.out.println("List is Empty");
		}else {
			Node t2=root;
			Node t=root;
			
			while(t.next!=null) {
				t2=t;
				t=t.next;
			}
			
		}
	}
}
