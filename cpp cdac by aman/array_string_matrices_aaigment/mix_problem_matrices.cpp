#include<iostream>
/*
Problem 2: Matrix with Row-wise and Column-wise Addition
Problem Definition

Write a C++ program to accept the elements of a from the user.

The program should display the matrix in such a way that:

The is displayed next to that row.

The is displayed below the corresponding column.

The of all matrix elements should also be displayed.
*/
using namespace std;
int main(){
	int row;
	int column;
	cout<<"Enter row Number :";
	cin>>row;
	cout<<"Enter column Number :";
	cin>>column;
	int a[row][column];
	
	for(int r=0;r<row;r++){
		for(int c=0;c<column;c++){
			cout<<"Enter data for m ["<<r<<"]["<<c<<"]:";
			cin>>a[r][c];
		}
	}
	
	
	int mat_total_sum=0;
		cout<<"\n Matrix has:\n";
		int sum_row=0;
	for(int r=0;r<row;r++)
	{
		int row_sum=0;
		
	  for(int c=0;c<column;c++)
		{
			cout<<a[r][c]<<"\t";
			row_sum=row_sum+a[r][c];
			mat_total_sum+=a[r][c];
			
			
			
		}
			cout <<"| "<<row_sum<<endl;
					cout<<endl;
	}
	// Line 
	cout << "------------------------" << endl;
			/// column sum
			for(int c=0;c<column;c++)
			{
				int sum_column=0;
		
	  			for(int r=0;r<row;r++)
				{
					
					sum_column+=a[r][c];
			
				}
					cout<<sum_column<<"\t";
				
		
	}
	cout << "\n\nGrand Total = " << mat_total_sum;
	
}