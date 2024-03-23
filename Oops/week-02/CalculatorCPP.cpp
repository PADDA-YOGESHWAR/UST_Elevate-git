//Write a C++ program to compute arithmetic operations with the user input and choice of operation(switch case).
#include<iostream>
using namespace std;
int main()
{
    float a,b;//declaring the variables
    char op;
    cout<<"Enter two numbers ";
    cin>>a>>b;//reading the input operands
    cout<<"Enter an operator to perform operation between between given numbers(+,-,*,/,%) ";
    cin>>op;//reading the input operators
    switch(op)//beginning of switch case
    {
        case '+'://peforms the logic when given operator is +
        cout<<"a + b = "<<a+b<<endl;
        break;//breaks the entire switch loop
        case '-':
        cout<<"a - b = "<<a-b<<endl;
        break;
        case '*':
        cout<<"a * b = "<<a*b<<endl;
        break;
        case '/':
        cout<<"a / b = "<<a/b<<endl;
        break;
        case '%':
        cout<<"a % b = "<<int(a)%int(b)<<endl;
        break;
        default://performs the logic when the given operator doesn't match with any of the cases
        cout<<"Invalid operator input\n";
    }
    return 0;
}