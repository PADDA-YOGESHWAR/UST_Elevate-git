#include<iostream>
#include"boxArea.h"
#include"boxVolume.h"//includes header file
using namespace std;
int main()
{
    cout<<"Enter the length , breadth and height of box : ";
    float len,bre,hei;//declaring float variables
    cin>>len>>bre>>hei;//reading both float variables at a time 
    cout<<"The area of the box with length "<<len<<" and breadth "<<bre<<" is :"<<boxArea(len,bre)<<endl;
    cout<<"The volume of the box with length "<<len<<" , breadth "<<bre<<" and height "<<hei<<" is : "<<boxVolume(len,bre,hei)<<endl;
    return 0;
}