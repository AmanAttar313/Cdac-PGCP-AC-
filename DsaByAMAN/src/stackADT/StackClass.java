package stackADT;

public class StackClass {
	int stack[],maxSize,tos;
	
	void createStack(int size) {
		maxSize=size;
		tos=-1;
		stack=new int[maxSize];
	}
	void push(int value) {
		stack[++tos]=value;
	}
	int  pop() {
		return stack[tos--];
	}
	boolean IsFull() {
		return (tos==maxSize-1);
	}
	boolean isEmpty() {
		return (tos==-1);
	}
	int peek() {
		return stack[tos];
	}
	boolean search(int element) {
		for(int i=tos-1;i>=0;i--) {
			if(element==stack[i]) {
				return true;
			}
		}
		return false;
	}
	void print() {
		for(int i=tos;i>=0;i--) {
			System.out.println(stack[i]);		}
	}
}
