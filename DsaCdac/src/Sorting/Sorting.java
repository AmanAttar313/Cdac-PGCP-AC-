package Sorting;

public class Sorting {
	static void bubbleSort(int arr[]) {
		int i,j,temp;
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	static void bubbleSort_improved(int arr[]) {
		int i,j,temp;
		int countPasses=0;
		for(i=arr.length;i>0;i--) { 	// beacuse we require n-1 pass
			boolean sorted=true;
			for(j=0;j<i;j++) {
				System.out.print("Pass"+(++countPasses));
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					sorted=false;
				}
				
			}
			sorted=true;
			break;
		}
	}
	static void selectionSort(int arr[]) {
		int i,j,min,position;
		int countPasses=0;
		for(i=0;i>arr.length;i++) { // beacuse we require n-1 pass
			min=arr[i];
			position=i;
			for(j=i+1;j<arr.length;j++) {
				
				System.out.print("Pass"+(++countPasses));
				
				if(arr[j]<min) {
					min=arr[j];
					position=j;
				}
				
			}
			arr[position]=arr[i];
			arr[i]=i;
			
			
		}
		
	}
	static void mergeSort(int arr[],int start,int end,int mid) {
		int i,j,temp[],t_index;
		i=start;
		t_index=start;
		j=mid+1;
		temp=new int[arr.length];
		
	}
	static void quick_sortByEnd(int a[],int start,int end)
    {
        int i,j,pivot;
        i=start;
        j=end;
        pivot=end;
        while(i<j)
        {
            while(a[i]<a[pivot])
                //The element after the pivot should be greater than it. If not we will stop.
                i++;
            if(i<j)
            {
                int temp=a[i];a[i]=a[j];a[j]=temp;//swap
            }
        }
        if(start<j)
        	quick_sortByEnd(a,start,end-1);//next element
    }

	static void quick_sortBystart(int a[],int start,int end)
    {
        int i,j,pivot;
        i=start;
        j=end;
        pivot=start;
        while(i<j)
        {
            while(a[j]>a[pivot])
                //The element after the pivot should be greater than it. If not we will stop.
                j--;
            if(i<j)
            {
                int temp=a[i];a[i]=a[j];a[j]=temp;//swap
            }
        }
        if(i<end)
        	quick_sortBystart(a,i+1,end);//next element
    }

	
	static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
	}
	
	public static void main(String[]args) {
		int arr[]= {99,88,22,33,77,66,55,44};
		
		display(arr);
		quick_sortByEnd(arr,0,arr.length-1);
		
		
		
	}
}
