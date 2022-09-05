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
          int chkprec(char y)
          {
               if (y=='+' || y=='-')
               {
                    return 1;
               }
               if (y=='*' || y=='/')
               {
                    return 2;
               }
               if (y=='^')
               {
                    return 3;
               }
               else
               {
                    return 0;
               }
          }
          void ysl_in()
          {
               cin>>infx;
          }
          void chkop(char y)
          {
               if (isalnum(y))
               {
                    for (int i = 0; i < top; i++)
                    {
                         for (int j = 0; j < top; j++)
                         {
                              pstfx[j]=infx[i];
                         }
                    }
               }
               else
               {
                    if(y=='(')
                    {
                         push(y);
                    }
                    if (y==')')
                    {
                         while (y!='(')
                         {
                              for (int i = 0; i < top; i++)
                              {
                                   for (int j = 0; j < top; j++)
                                   {
                                        pstfx[j]=infx[i];
                                        pop();
                                   }
                              }
                         }
                    }
               }
               
          }
          void cnvrt()
          {

          }
};

int main()
{

     return 0;
}