#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "enter number : ";
    cin >> n;

    int high_fact = 0;

    for (int i = 1; i < n; i++)
    {
        if (n % i == 0)
        {
            high_fact = i;
        }
    }

    cout << "highest factor = " << high_fact;

    return 0;
}