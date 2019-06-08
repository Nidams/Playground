#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int a[n],i;
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  int c=0,max=0;
  for(i=0;i<n;i++)
  {
    if(a[i]==1)
      c++;
    else if(a[i]==0)
      c=0;
    if(c>max)
      max=c;
  }
  printf("%d",max);
  return 0;
  
}