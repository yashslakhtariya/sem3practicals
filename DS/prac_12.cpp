#include <iostream>
#include <stdlib.h>
using namespace std;

struct cirq
{
    int size;
    int f;
    int r;
    int *ysl;
};
int mt(struct cirq *q)
{
    if(q->r == q->f)
    {
        return 1;
    }
    return 0;
}
int fl(struct cirq *q)
{
    if((q->r+1)%q->size == q->f)
    {
        return 1;
    }
    return 0;
}
void nq(struct cirq *q,int val)
{
    if(fl(q))
    {
        cout<<"\n!!Full!!"<<endl;
    }
    else
    {
        q->r = (q->r+1)%q->size;
        q->ysl[q->r] = val;
    }
}
void dq(struct cirq *q)
{
    if(mt(q))
    {
        cout<<"\n!!Empty!!"<<endl;
    }
    else
    {
        q->f = (q->f+1)%q->size;
        cout<<"DEQ->"<<q->ysl[q->f]<<endl;
    }
}
int main() 
{
	struct cirq * q = (struct cirq*) malloc(sizeof(struct cirq));
	q->f = 0;
	q->r = 0;
	q->size = 4;
	q->ysl = (int*)malloc(q->size*sizeof(int));
	int hold;
	for(int i=0;i<4;i++)
     {
	    cin>>hold;
	    if(i<3)
         {
	     cout<<"->"<<hold;
	    }
	    nq(q,hold);
	}
	cout<<"Front->"<<q->f<<endl;
	for(int i=1;i<4;i++)
     {
	    cout<<"->"<<q->ysl[i];
	}
	cout<<endl;
	cout<<"Rear->"<<q->r<<endl;
	dq(q);
	dq(q);
	nq(q,hold);
	cout<<"ENQ->"<<q->ysl[q->r]<<endl;
	cout<<"Front->"<<q->f<<endl;
	int j =0;
	cout<<"->"<<q->ysl[q->f+1] <<"->"<<q->ysl[q->r]<<endl;
	cout<<"Rear->"<<q->r;
	return 0;
}