/*"Using a constructor and destructor in C++, Write a C++ class 'Student' and assign the following :
1. default constructor (string collegeName = ""MVGR"", int collegeCode=33)
2. parameterized constructor (string fullName, double semPerentage)
Also create the objects respectivelty asd display their values."*/
#include<iostream>
using namespace std;
class clg
{
    public:
        clg()//default constructor with no parameters
        {
            string collegename = "MVGR";
            cout<<"Welcome to "<<collegename<<endl;
            int collegecode=33;
            cout<<"Your college code is "<<collegecode<<endl;
            
        }
        clg(string fullName, double semPercentage)//parameterized constructor
        {
            cout<<"Your name is: "<<fullName<<endl;
            cout<<"Your percentage is "<<semPercentage<<endl;
        }
};
int main()
{
    cout<<"Enter your name:";
    string fullName;
    cin>>fullName;
    cout<<"Enter your percentage:";
    double semPercentage;
    cin>>semPercentage;
    cout<<"\tYOUR DETAILS\t"<<endl;
    clg();//default constructor is called 
    clg(fullName,semPercentage);//parameterized constructor is called by passing parameters
    //overriding is also done in this program
    return 0;

}