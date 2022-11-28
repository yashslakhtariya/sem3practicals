#include <iostream>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int n_a=0,n_s=0,n_b=0,n_r=0,n_x=0;
    string names[n];
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin >> names[i] >> arr[i];
        if(arr[i]==1)
        {
            n_a++;
        }
        
        if(arr[i]==2)
        {
            n_s++;
        }
        
        if(arr[i]==3)
        {
            n_b++;
        }
        
        if(arr[i]==4)
        {
            n_r++;
        }
        
        if(arr[i]==5)
        {
            n_x++;
        }
        
    }
    cout << "City-wise Patient Count" << endl;
    cout << "Ahmedabad-" << n_a  << endl;
    cout << "Surat-" << n_s << endl;
    cout << "Baroda-" << n_b  << endl;
    cout << "Rajkot-" << n_r  << endl;
    cout << "Extra-" << n_x  << endl;
    string temp;
    cout << "Patient List" << endl;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            if( int(names[j][0]) >int(names[j+1][0]) )
            {
                string temp = names[j];
                names[j]=names[j+1];
                names[j+1]=temp;
            }
        }
    }
    for(int i=0;i<n;i++)
    {
        cout << names[i] << endl;
    }
    return 0;
}