#include <cstring>
#include <iostream>
using namespace std;
#define INF 9999999

int main() 
{
    int cost=0;
    int V;
    cin>>V;
    
    int G[V][V];
    for(int i=0;i<V;i++)
    {
        for(int j=0;j<V;j++)
        {
          cin>>G[i][j];
        }
    }
    int no_edge;
    int selected[V];
    memset(selected, false, sizeof(selected));

      no_edge = 0;
    
      selected[0] = true;
    
      int x;  
      int y;  
    
     while (no_edge < V - 1) 
     {        
        int min = INF;
        x = 0;
        y = 0;
    
        for (int i = 0; i < V; i++) 
        {
          if (selected[i]) 
          {
            for (int j = 0; j < V; j++) 
            {
              if (!selected[j] && G[i][j]) 
              {   
               if (min > G[i][j]) 
               {
                  min = G[i][j];
                  x = i;
                  y = j;
               }
              }
            }
          }
        }
        cost += G[x][y];
        selected[y] = true;
        no_edge++;
     }
      cout<<"Total Cost : "<<cost;

  return 0;
}