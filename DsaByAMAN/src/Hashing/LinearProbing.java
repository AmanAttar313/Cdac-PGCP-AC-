package Hashing;

import java.util.Scanner;

public class LinearProbing {
	int size;
	int table[];
	 LinearProbing(int size) {
		 this.size=size;
		 this.table=new int[size];
	        for (int i = 0; i < size; i++) {
	            table[i] = -1;
	        }
	    }
	
	void insert(int value) {
		int index=value %size;
		int start=index;
		
		while(table[index]!=-1) {
			
			if(table[index]==value) {
				System.out.print("Duplicate entry");
				return;
			}
			index=(index+1)%size;
			if(index==start) {
				 System.out.println("Hash table is full!");
		            return;
			}
			
		}
		table[index]=value;
		System.out.println("value inserted at :"+index);
	}
	
	void search() {
			
	}
	void display() {
		System.out.print("index\tvalue");
		for(int i=0;i<size;i++) {
			System.out.println(i+"\t"+table[i]);
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of hash table");
		int size=sc.nextInt();
		LinearProbing l=new LinearProbing(size);
		
		System.out.println("how may value insert");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int value=sc.nextInt();
		l.insert(value);
		}
		System.out.println("Hash Table:");
        l.display();

        sc.close();
	}
}
