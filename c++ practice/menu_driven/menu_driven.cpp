#include<iostream>
#include<string>
using namespace std;

int main(){
	int choice;
	int quantity;
	int total=0;
	
	do{
		 cout << "\n========== HOTEL MENU ==========" << endl;
        cout << "1. Pizza       - Rs. 200" << endl;
        cout << "2. Burger      - Rs. 100" << endl;
        cout << "3. Sandwich    - Rs. 80" << endl;
        cout << "4. Biryani     - Rs. 180" << endl;
        cout << "5. Coffee      - Rs. 50" << endl;
        cout << "6. Exit" << endl;
        
        cout<<"\nEnter your choice : ";
        cin>>choice;
     	
		 switch(choice){
		 	case 1:
		 		cout<<"Enter Quantity :";
		 		cin>>quantity;
		 		total=total + (200 * quantity);
		 		cout<<"pizza added..!"<<endl;
		 		break;
		 	
		 	case 2:
		 		cout<<"Enter Quantity :";
		 		cin>>quantity;
		 		total=total + (100 * quantity);
		 		cout<<"Burger added..!"<<endl;
		 		break;
		 	
		 	case 3:
		 		cout<<"Enter Quantity :";
		 		cin>>quantity;
		 		total=total + (100 * quantity);
		 		cout<<"Burger added..!"<<endl;
		 		break;
		 		
		 	case 4:
		 		cout<<"Enter Quantity :";
		 		cin>>quantity;
		 		total=total + (100 * quantity);
		 		cout<<"Burger added..!"<<endl;
		 		break;
		 		
		 	case 5:
		 		cout<<"Enter Quantity :";
		 		cin>>quantity;
		 		total=total + (100 * quantity);
		 		cout<<"Burger added..!"<<endl;
		 		break;
		 		
		 	case 6:
                cout << "\nThank you for visiting!" << endl;
                break;
				
			default:
                cout << "Invalid choice!" << endl;	
		 	
	}
		 }  
		 while(choice != 6);

    cout << "\nTotal Bill = Rs. " << total << endl;

    
		 
	

	
}