//The solution to the problem is a virtual base class where, during inheritance, we use the keyword `virtual` before or after the `public` keyword. 
#include <iostream>
using namespace std;

class Human
{
public:
    string name;

    Human()
    {
        cout << "Human constructor called" << endl;
    }
};

class Student : virtual Human
{
public:
    string degree;

    Student()
    {
        cout << "Student constructor called" << endl;
    }
};

class Employee : virtual Human
{
public:
    string company;

    Employee()
    {
        cout << "Employee constructor called" << endl;
    }
};

class WorkingStudent : public Student, public Employee
{
public:
    void display()
    {
      cout<<"\nWorking Student:my display";
    }
};

int main()
{
    WorkingStudent obj;
	obj.display();

    return 0;
}
