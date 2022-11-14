#include<iostream>
using namespace std;

struct Node{

    int data;
    struct Node *next;

};

void dsply(struct Node *head)
{
    struct Node *ptr;
    ptr=head;
    while(ptr!=NULL)
    {
        cout<<ptr->data<<endl;
        ptr=ptr->next;
    }
}

void InserAtEnd(struct Node *head,int data)
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

int main(){
    int n;
    struct Node *head=new Node;

    cin>>head->data;
    head->next=NULL;
    cin>>n;
    InserAtEnd(head,n);
    cin>>n;
    InserAtEnd(head,n);
    int data,data1;
    cin>>data>>data1;
    InsrtBfr(head,data,data1);
    cin>>n;
    InserAtEnd(head,n);
    cin>>n;
    InserAtEnd(head,n);
    cin>>data>>data1;
    InsrtAftr(head,data,data1);
    dsply(head);
    
    return 0;
}