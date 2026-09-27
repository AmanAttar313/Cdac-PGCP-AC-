#include<iostream>
#include<string>
using namespace std;
class Student{
public:	
string name;
 int rollNo;
   double marks1, marks2, marks3;
   
     double calculateTotal() {
        return marks1+marks2+marks3;
    }
    
    double calculatePercentage() {
        return (calculateTotal() / 300) * 100;
    }
    
    void display() {
        cout << "Student Name = "<<name<<endl;
        cout << "Roll Number = " <<rollNo<<endl;
        cout << "Total Marks = " <<calculateTotal()<< endl;
        cout << "Percentage = " << calculatePercentage() << endl;
    }


};
int main(){
	Student s;
	cout<<"Enter student name: ";
    cin >>s.name;

    cout<<"Enter roll number: ";
    cin>>s.rollNo;

    cout<<"Enter marks in three subjects: ";
    cin>>s.marks1>>s.marks2>>s.marks3;

    s.display();
	
	
}