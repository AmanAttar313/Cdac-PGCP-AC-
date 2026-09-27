#include <iostream>
using namespace std;

class Address
{
private:
    string city;
    int pincode;

public:
    void accept_address()
    {
        cout << "Enter city: ";
        cin >> city;

        cout << "Enter pincode: ";
        cin >> pincode;
    }

    void display_address()
    {
        cout << "City: " << city << endl;
        cout << "Pincode: " << pincode << endl;
    }
};

class Student
{
private:
    string name;
    int roll_no;

    Address a;   // HAS-A relationship

public:
    void accept_student()
    {
        cout << "Enter student name: ";
        cin >> name;

        cout << "Enter roll number: ";
        cin >> roll_no;

        a.accept_address();
    }

    void display_student()
    {
        cout << "\nStudent Name: " << name << endl;
        cout << "Roll Number: " << roll_no << endl;

        a.display_address();
    }
};

int main()
{
    Student s;

    s.accept_student();
    s.display_student();

    return 0;
}
