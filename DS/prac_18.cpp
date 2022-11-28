#include <iostream>
using namespace std;

void print(int *ysl,int n,int k)
{
    cout<<"Pass-"<<k<<"  ";
    for(int i=0;i<n;i++)
    {
        cout<<ysl[i]<<" ";
    }
    cout<<endl;
}

int main() 
{
	int n;
	cin>>n;
	int hold[n];
	for(int i=0;i<n;i++)
	{
	    cin>>hold[i];
	}
	int pos,elmnt,h,k=0,ans;
	cin>>pos;
	cin>>elmnt;
	for(int i=1;i<n;i++)
	{
	    k++;
	    print(hold,n,k);
	    h = i;
	    while(hold[i]<hold[i-1] && (i-1)>=0)
	    {
	        int temp = hold[i];
	        hold[i] = hold[i-1];
	        hold[i-1] = temp;
	        i--;
	    }
	    i=h;
	}
	for(int i=0;i<n;i++)
	{
	    if(hold[i] == elmnt)
	    {
	        ans = i+1;
	        break;
	    }
	}
	cout<<"Element "<<elmnt<<" found at position "<<ans<<endl;
	return 0;
}