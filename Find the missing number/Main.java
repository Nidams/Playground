#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n],i,c=1;
  for(i=1;i<=n;i++)
    scanf("%d",&a[i]);
  for(i=1;i<=n;i++)
  {
    if(a[i]==-1)
      continue;
   else if(a[i]==c && i<=n)
    {
      c++;
      a[i]=-1;
     i=1;
    }
    else if(a[i]!=c && i==n)
    {
      printf("%d",c);
      break;
    }
      
  }
  //Type your code here
 
  
  return 0;
}