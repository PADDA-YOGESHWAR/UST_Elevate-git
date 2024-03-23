//Write a C++ program to display Hello 'Username', where 'Username' will be given by the user.
#include<iostream>
#include<string>//must include string for using string as an input
using namespace std;
int main()
{
    string name;
    cout<<"Enter your name : ";
    cin>>name;
    cout<<"Hello "+name<<endl;//prints hello username as output
    return 0;
}
