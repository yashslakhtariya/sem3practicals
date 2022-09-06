#include <iostream>
#include<ctype.h>
using namespace std;

class ysl 
{
    int top;
    int max;
    char* a;
     public:
     ysl(int sz)
     {
          top = -1;
          max = sz;
          a = new char [max];
     }
     void push(char x) 
     {
          if (top >= (max - 1)) 
          {
               cout << "Overflow";
          }
          else 
          {
               top++;
               a[top] = x;
          }
     }
     int pop()
     {
          if (top < 0) 
          {
               cout << "Underflow"; 
          } 
          else 
          { 
               int x = a[top]; 
               top--; 
               return x; 
          }
     }     
     int tos()
     { 
          return a[top]; 
     } 
     int empty()
     {
          return (top < 0); 
     } 
     int full()
     {
          return (top == max - 1); 
     } 
};

int chkprec(char c)
{
    if (c == '^')
        return 3;
    else if (c == '*' || c == '/')
        return 2;
    else if (c == '+' || c == '-')
        return 1;
    else
        return 0;
}

string cnvrt(string infx)
{
    int i = 0;
    string pstfx = "";
    
    ysl s(20);
    while(infx[i]!='\0')
    {
	    if(isalnum(infx[i]))
	    {
	        pstfx += infx[i]; 
	        i++; 
	    } 
	    else if(infx[i]=='(') 
		{
	        s.push(infx[i]);
	        i++; 
	    } 
	    else if(infx[i]==')') 
		{ 
               while(s.tos()!='(')
               pstfx += s.pop(); 
               s.pop(); 
               i++;
	    } 
	    else 
		{ 
                while (!s.empty() && (chkprec(infx[i]) <= chkprec(s.tos())))
			{
			     pstfx += s.pop();
			} 
			s.push(infx[i]);
			i++;
	    }
    } 
    while(!s.empty())
	{
        pstfx += s.pop();
    }
    return pstfx;
    
} 

int main() 
{
    string infx;
    cin>>infx;
    cout<<cnvrt(infx);
    return 0;
}