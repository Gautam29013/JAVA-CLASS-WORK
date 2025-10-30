#include<iostream>
using namespace std;

int power(int base , int exp) {
    if(exp == 0  ) {
        return 1;
    }
    return base * power(base , exp - 1);

}

int main() {
    int num;
    cin >> num;
    cout <<power(3,num) << endl;
}