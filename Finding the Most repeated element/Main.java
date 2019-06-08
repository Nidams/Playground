#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int a[n],i;
  for(i=0;i<n;i++)
  scanf("%d",&a[i]);
  int c=0,max=a[0],count=0;
  for(i=0;i<n;i++)
  {
    if(a[i]==a[i+1])
      c++;
    else 
      c=0;
    if(c>count)
    {
      count=c;
      max=a[i];
    }
      
  }
  printf("%d",max);
  return 0;
}