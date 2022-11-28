#include <iostream>
using namespace std;

void print(int *ysl,int n,int k){
    cout<<"Pass-"<<k<<"  ";
    for(int i=0;i<n;i++){
        cout<<ysl[i]<<" ";
    }
    cout<<endl;
}

int main() {
	int n;
	cin>>n;
	int hold[n];
	for(int i=0;i<n;i++){
	    cin>>hold[i];
	}
	int pos,el,h,k=0,ans;
	cin>>pos;
	cin>>el;
	for(int i=0;i<n-1;i++){
	    k++;
	    h = i;
	    for(int j=i+1;j<n;j++){
	        if(hold[j]<hold[h]){
	            h = j;
	        }
	    }
	    int temp = hold[i];
	    hold[i] = hold[h];
	    hold[h] = temp;
	    print(hold,n,k);
	}
	for(int i=0;i<n;i++){
	    if(hold[i] == el){
	        ans = i+1;
	        break;
	    }
	}
	cout<<"Element "<<el<<" found at position "<<ans<<endl;
	
	return 0;
}