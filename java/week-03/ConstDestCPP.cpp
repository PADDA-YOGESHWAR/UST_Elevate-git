/* Using a constructor and destructor in C++, Write a C++ class 'Student' and assign the following :
* string fullName
* int rollNum
* double semPerentage
* string collegeName
* int collegeCode */
#include<iostream>
using namespace std;
class Student
{
    public:
        Student(string fullname,int rollno,float percentage,string collegename,int collegecode)//student constructor 
        {
            cout<<"\tYOUR DETAILS\t"<<endl;
            cout<<"Your name is: "<<fullname<<endl;
            cout<<"Your rollnumber is: "<<rollno<<endl;
            cout<<"Your study percentage is: "<<percentage<<endl;
            cout<<"Your college name is: "<<collegename<<endl;
            cout<<"Your college code is: "<<collegecode<<endl;
        }~Student()//distructor syntax is ~constructor_name(){ some statements }
        {
           cout<<"Constructor is Destructed"<<endl; 
        }
};
int main()
{
    cout<<"Enter your name:";
    string name;
    cin>>name;
    cout<<"Enter your roll-number: ";
    int n;
    cin>>n;
    cout<<"Enter your percentage: ";
    float f;
    cin>>f;
    cout<<"Enter your college name: ";
    string collegename;
    cin>>collegename;
    cout<<"Enter your college code: ";
    int code;
    cin>>code;
    Student(name,n,f,collegename,code);//calling a constructor by passing parameters
    return 0;

}