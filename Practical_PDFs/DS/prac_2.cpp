#include<iostream>
using namespace std;
struct ysl
{
    char name[20];
    int age;  
};
int main()
{
    int total;
    cin>>total;
    struct ysl arr[total];
    int child=0,yngchld=0,adlt=0,old=0;
    for (int i = 0; i < total; i++)
    {
        cin>>arr[i].name;
        cin>>arr[i].age;
    }
    for (int i = 0; i < total; i++)
    {
        if(arr[i].age<=16)
        {
            child++;
        }
        else if(arr[i].age<=30)
        {
            yngchld++;
        }
        else if(arr[i].age<=44)
        {
            adlt++;
        }
        else
        {
            old++;
        }
    }
    cout<<"Child(0-16)-"<<child;
    cout<<" Young Child(17-30)-"<<yngchld;
    cout<<" Middle Aged Adults(31-44)-"<<adlt;
    cout<<" Old Aged Adults(45+)-"<<old;
    return 0;
}