//Write a C++ program to demonstrate the usage of data manipulators(ws)
#include<iostream>
#include<string>
#include<iomanip>
using namespace std;
int main()
{
    string name;
    float x = 28.1234;
    cout << setprecision(2) << x << endl;//gives 2 digits as output ignoring decimal points
    cout << setprecision(5) << x << endl;//gives 5 digits as output including decimal points
    cout<<setw(50)<<"test123"<<endl;//50 white spaces 
    cout <<setw(15) << setfill('*') << 99 << 97 << endl;//15 *s
    cout<<"Enter Your name"<<endl;
    cin>>ws;//ws will ignore the blank spaces that are entered by the user before input value
    cin>>name;
    cout<<"Name is "<<name<<endl;
    cout<<"C++ and Java"<<flush;// flush will flush the next line same as ends
    cout<<"hola"<<ends;//ends is used to skip next line and continues to print the next outputs immediately
    cout<<"Hii"<<endl;//endl is used to end the line on cout and print the next output from the next line..
}
