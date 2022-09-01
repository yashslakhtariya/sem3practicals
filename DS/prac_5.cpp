#include<iostream>
#include<ctype.h>
#include<string.h>
using namespace std;
#define sz 100

class ysl
{
     public:
          char infx[sz], pstfx[sz], stck[sz];
          int top=-1;
          void push(char y)
          {
               if (top==sz-1)
               {
                    cout<<"\tStack Overflow"<<endl;
               }
               else
               {
                    top=top+1;
                    stck[top]=y;
               }
          }
          void pop()
          {
               if(top==-1)
               {
                    cout<<"\tStack Underflow"<<endl;
               }
               else
               {
                    top=top-1;
               }
          }
          void chkprec()
          {
               
          }
          void ysl_in()
          {
               cin>>infx;
          }
          void cnvrt()
          {

          }
};

int main()
{

     return 0;
}