#include<iostream>
using namespace std;

struct Node
{
    int data;
    struct Node *next;
};

void dsply(struct Node *head)
{
    struct Node *ptr;
    ptr=head;
    while(ptr!=NULL)
    {
        cout<<ptr->data;
        while(ptr->next!=NULL){
            cout<<", ";
            break;
        }

        ptr=ptr->next;
    }
}

void lctn(struct Node *head,int data)
{
    struct Node *ptr=head;
    int cnt=1;
    while(data!=ptr->data){
        cnt++;
        ptr=ptr->next;
        
    }
    cout<<cnt<<"th Location"<<endl;
}

void cnt(struct Node *head)
{
    struct Node *ptr=head;
    int cnt=0;
    while(ptr!=NULL){
        cnt++;
        ptr=ptr->next;
        
    }
    cout<<cnt<<" Counts"<<endl;
}

struct Node *InsrtFrst(struct Node *head,int data){
    struct Node *ptr=new Node;
    ptr->data=data;
    ptr->next=head;
    return ptr;
    
}

void InsrtLst(struct Node *head,int data)
{
    struct Node *ptr=new Node;
    ptr->data=data;
    struct Node *p;
    p=head;
    while(p->next!=NULL)
    {
        p=p->next;
    }
    p->next=ptr;
    ptr->next=NULL;
    
}

void InsrtBfr(struct Node *head,int data,int data1)
{
    struct Node *p;
    struct Node *q;
    p=head;
    struct Node *ptr=new Node;
    ptr->data=data;
    while(p->data!=data1)
    {
        q=p;
        p=p->next;
    }
    q->next=ptr;
    ptr->next=p;
 
}

void InsrtAftr(struct Node *head,int data,int data1)
{
    struct Node *p;
    struct Node *q;
    p=head;
    struct Node *ptr=new Node;
    ptr->data=data;
    while(p->data!=data1)
    {
        p=p->next;
    }
    ptr->next=p->next;
    p->next=ptr;
 
}

struct Node* DlteByValue(struct Node * head, int value){
    struct Node *p = head;
    struct Node *q = head->next;
    while(q->data!=value && q->next!= NULL)
    {
        p = p->next;
        q = q->next;
    }
    
    if(q->data == value){
        p->next=q->next;
        delete(q);
    }
    return head;
}

struct Node *DlteBfr(struct Node *head,int value){
    struct Node *p = head;
    struct Node *q = head->next->next;
    struct Node *r;
    while(q->data!=value && q->next!= NULL)
    {
        p = p->next;
        q = q->next;
        
    }
    
    if(q->data == value){
        r=p->next;
        p->next=r->next;
        delete(r);
    }
    return head;
}

struct Node *DlteAftr(struct Node *head,int value){
    struct Node *p = head;
    struct Node *q = head->next;
    struct Node *r;
    while(p->data!=value && p->next!= NULL)
    {
        p = p->next;
        q = q->next;
        
    }
    
    if(p->data == value){
        p->next=q->next;
        delete(q);
    }
    return head;
}


struct Node * DlteFrst(struct Node *head){
    struct Node *p=head;
    head=head->next;
    delete(p);
    return head;
}

struct Node * DlteLst(struct Node *head){
    struct Node *p = head;
    struct Node *q=head->next;
    while(q->next!=NULL){
        p=p->next;
        q=q->next;
    }
    delete(q);
    p->next=NULL;
   
    return head;
}

int main()
{
    int n;

    struct Node *head=new Node;
    struct Node *a=new Node;
    struct Node *b=new Node;
    struct Node *c=new Node;
    struct Node *d=new Node;
    struct Node *e=new Node;
    struct Node *f=new Node;
    struct Node *g=new Node;
    struct Node *h=new Node;
    struct Node *i=new Node;
    
    head->data=5;
    head->next=a;
    
    a->data=3;
    a->next=b;
    
    b->data=4;
    b->next=c;
    
    c->data=8;
    c->next=d;
    
    d->data=13;
    d->next=e;
    
    e->data=55;
    e->next=f;
    
    f->data=79;
    f->next=g;
    
    g->data=31;
    g->next=h;
    
    h->data=27;
    h->next=i;
    
    i->data=87;
    i->next=NULL;
    
    cin>>n;
    head=InsrtFrst(head,n);
    cin>>n;
    InsrtLst(head,n);

    int data,data1;
    cin>>data1>>data;
    InsrtBfr(head,data,data1);
    
    cin>>data1>>data;
    InsrtAftr(head,data,data1);
    cin>>n;
    lctn(head,n);

    dsply(head);
    cout<<endl;

    cnt(head);

    cin>>n;
    head=DlteByValue(head,n);

    cin>>n;
    head=DlteBfr(head,n);

    cin>>n;
    head=DlteAftr(head,n);

    head=DlteFrst(head);
    head=DlteLst(head);
    dsply(head);
    cout<<endl;

    cnt(head);

    return 0;
}