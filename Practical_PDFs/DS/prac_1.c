#include <stdio.h>

int main(void) 
{
     int n;
	int yash[n],i,j,num,k;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	    scanf("%d",&yash[i]);
	}
	for(i=0;i<n;i++)
	{
	    for(j=i+1;j<n;j++)
	    {
	        if(yash[i]>yash[j])
	        {
	            yash[i]=yash[i]-yash[j];
	            yash[j]=yash[i]+yash[j];
	            yash[i]=yash[j]-yash[i];
	        }
	    }
	}
     for(i=0;i<n;i++)
	{
	    printf("%d ", yash[i]);
	}
     printf("\n");
     scanf("%d",&k);
     yash[n]=k;
	for(i=0;i<=n;i++)
	{
	    for(j=i+1;j<=n;j++)
	    {
	        if(yash[i]>yash[j])
	        {
	            yash[i]=yash[i]-yash[j];
	            yash[j]=yash[i]+yash[j];
	            yash[i]=yash[j]-yash[i];
	        }
	    }
	}
     for(i=0;i<=n;i++)
	{
	    printf("%d ", yash[i]);
	}

	return 0;
}