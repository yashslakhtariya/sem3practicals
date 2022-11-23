#include<iostream>
#include<string.h>
using namespace std;

int main() 
{
    int i, j, n;
    int num[n];
    int cnt_a = 0, cnt_s = 0, cnt_b = 0, cnt_r = 0, others = 0;
    char ysl[100][100], s[100];

    cin>>n;

    for (i = 0; i < n; i++) 
    {
          cin>>ysl[i];
          cin>>num[i];
          if (num[i] == 1) 
          {
          cnt_a++;
          } 
          else if (num[i] == 2) 
          {
          cnt_s++;
          } 
          else if (num[i] == 3) 
          {
          cnt_b++;
          } 
          else if (num[i] == 4) 
          {
          cnt_r++;
          } 
          else 
          {
          others++;
          }
    }

     for (i = 0; i < n; i++) 
     {
          for (j = i + 1; j < n; j++) 
          {
               if (strcmp(ysl[i], ysl[j]) > 0) 
               {
                    strcpy(s, ysl[i]);
                    strcpy(ysl[i], ysl[j]);
                    strcpy(ysl[j], s);
               }
          }
     }
    cout<<"City-wise Patient Count\n";
    cout<<"Ahmedabad-"<<cnt_a<<endl;
    cout<<"Surat-"<<cnt_s<<endl;
    cout<<"Baroda-"<<cnt_b<<endl;
    cout<<"Rajkot-"<<cnt_r<<endl;
    cout<<"Extra-"<<others<<endl;

    cout<<"Patient List\n";

    for (i = 0; i < n; i++) 
    {
        cout<<ysl[i]<<endl;
    }
}