// Write a C++ function to check whether a number is even or odd.
#include <iostream>
using namespace std;
void even(int n)
{
    if (n % 2 == 0) // if statement checks the condition and if it is true then it's logic will be performed
        cout << "The given number is even number\n";
    else // performs it's logic when if condition is failed
        cout << "The given number is odd number\n";
}
int main()
{
    int n;
    cout << "Enter a number to check wheather the given number even or odd\n";
    cin >> n;
    even(n);
}