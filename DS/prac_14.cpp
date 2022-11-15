#include<iostream>
using namespace std;

struct Node
{
    int data;
    struct Node *nxt;
    struct Node *prv;
};

void trvrsl(struct Node *head)
{
    struct Node *p=head;
    do
    {
        cout<<p->data;
        p=p->nxt;
        while(p!=head)
        {
          cout<<", ";
          break;
        }
    }
    while(p!=head);
    
}

struct Node *InsrtBfr(struct Node *head,int data)
{
    struct Node *ptr=new Node;
    struct Node *p=head;
    while(p->nxt!=head)
    {
        p=p->nxt;
    }
    ptr->data=data;
    ptr->nxt=head;
    ptr->prv=p;
    p->nxt=ptr;
    head->prv=ptr;
    head=ptr;
    return head;
}

struct Node *InsrtBfrVlu(struct Node* head,int data,int data1)
{
    struct Node *ptr=new Node;
    ptr->data=data;
    struct Node *p=head;
    while(p->data!=data1)
    {
        p=p->nxt;
    }
    p->prv->nxt=ptr;
    ptr->prv=p->prv;
    ptr->nxt=p;
    p->prv=ptr;
    return head;
}

struct Node *InsrtAftrVlu(struct Node *head,int data,int data1)
{
    struct Node *ptr=new Node;
    ptr->data=data;
    struct Node *p=head;
    while(p->data!=data1)
    {
        p=p->nxt;
    }
    ptr->nxt=p->nxt;
    p->nxt->prv=ptr;
    ptr->prv=p;
    p->nxt=ptr;

    return head;
}

struct Node *DlteAtLst(struct Node* head)
{
    struct Node *p=head;
    while(p->nxt!=head)
    {
        p=p->nxt;
    }
    p->prv->nxt=head;
    head->prv=p->prv;
    delete(p);

    return head;
}

struct Node *DlteByVlu(struct Node *head,int data)
{
    struct Node *p=head;
    struct Node *q;
    while(p->data!=data)
    {
        p=p->nxt;
        q=p;
    }
    p->prv->nxt=p->nxt;
    p->nxt->prv=p->prv;
    delete(q);

    return head;
}

struct Node *DlteBfr(struct Node *head,int data)
{
    struct Node *p=head;
    while(p->data!=data)
    {
        p=p->nxt;
    }
    p->prv->prv->nxt=p;
    p->prv=p->prv->prv;
    return head;
}

struct Node *DlteAftr(struct Node *head,int data)
{
    struct Node *p=head;
    struct Node *q;
    while(p->data!=data)
    {
        p=p->nxt;
    }
    q=p->nxt;
    p->nxt=p->nxt->nxt;
    p->nxt->nxt->prv=p;
    delete(q);

    return head;
}

void count(struct Node *head)
{
    struct Node *p=head;
    int count=1;
    while(p->nxt!=head)
    {
        count++;
        p=p->nxt;
    }
    cout<<endl;
    cout<<count<<" Counts"<<endl;
}

int main()
{
    struct Node *head=new Node;
    struct Node *a=new Node;
    struct Node *b=new Node;
    struct Node *c=new Node;
    struct Node *d=new Node;
    struct Node *e=new Node;
    struct Node *f=new Node;

    head->data=11;
    head->prv=f;
    head->nxt=a;

    a->data=22;
    a->prv=head;
    a->nxt=b;

    b->data=33;
    b->prv=a;
    b->nxt=c;

    c->data=44;
    c->prv=b;
    c->nxt=d;

    d->data=55;
    d->prv=c;
    d->nxt=e;

    e->data=66;
    e->prv=d;
    e->nxt=f;

    f->data=77;
    f->prv=e;
    f->nxt=head;

    int n;
    cin>>n;
    head=InsrtBfr(head,n);
    int data1,data;
    cin>>data1>>data;
    head=InsrtBfrVlu(head,data,data1);
    cin>>data1>>data;
    head=InsrtAftrVlu(head,data,data1);

    trvrsl(head);
    count(head);
    
    head=DlteAtLst(head);
    cin>>n;
    head=DlteByVlu(head,n);
    cin>>n;
    head=DlteBfr(head,n);
    cin>>n;
    head=DlteAftr(head,n);

    trvrsl(head);
    count(head);

    return 0;
}