#include <iostream>
using namespace std;

int main() {
    int number = 5696;
    int number_copy = number;
    int newnumber = 0;
    int place = 1;

    while (number_copy > 0) {
        int digit = number_copy % 10;

        digit = (digit + 2) % 10;

        newnumber = newnumber + digit * place;

        place = place * 10;
        number_copy /= 10;
    }

    cout << newnumber;

    return 0;
}