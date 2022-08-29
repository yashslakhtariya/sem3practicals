#include<iostream>
using namespace std;
#include<stdlib.h>

struct yash
{
    int sz;
    int *ysl;
    int top;
};

int empty(struct yash *y)
{
    if (y->top == -1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int full(struct yash *y)
{
    if (y->top == y->sz - 1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

void push(struct yash *y, int val)
{
    if (full(y))
    {
        cout << "Stack Overflow" << endl;
    }
    else
    {
        y->top++;
        y->ysl[y->top] = val;
    }
}

int pop(struct yash *y)
{
    if (empty(y))
    {
        cout << "Stack Underflow";
    }
    else
    {
        int val = y->ysl[y->top];
        y->top--;
        return val;
    }
}
void out(struct yash *y)
{
    for(int i=0;i<y->top+1;i++)
    {
          cout<<y->ysl[i]<<" "; 
    }
}

int main() 
{
     struct yash *p = (struct yash *)malloc(sizeof(struct yash));
     p->sz = 10;
     p->top = -1;
     p->ysl = (int *)malloc(p->sz * sizeof(int));
     push(p, 1);
     push(p, 8);
     push(p, 9);
     push(p, 7);
     push(p, 2);
     pop(p);
     pop(p);
     push(p, 3);
     out(p);
    
	return 0;
}